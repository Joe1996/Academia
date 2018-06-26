package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.Modalidade;;

public class ModalidadeDAO extends DatabaseDAO implements IDatabaseDAO<Modalidade> {
	
	private final String COLUMN_ID = "_id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_NAME_MASTER = "nomeMestre";
	
	private final String TABLE_NAME = "modalidade";
	
	private final String TABLE_BODY =
			"("
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
			+ COLUMN_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_NAME_MASTER + " VARCHAR(150) NOT NULL"
			+ ");";

	private final String SQL_INSERT = "INSERT INTO modalidade "
			+ "(" 
			+ COLUMN_NAME + COMMA 
			+ COLUMN_NAME_MASTER
			+ ")" 
			+ " VALUES "
			+ "(?,?)";

	private final String SQL_UPDATE = "UPDATE modalidade SET" 
			+ COLUMN_NAME + UPDATE_MARK + COMMA 
			+ COLUMN_NAME_MASTER + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;

	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela GradeAula, motivo: " + e.getMessage());
		}
	}

	@Override
	public long insert(Modalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		return selectLastId();
	}

	@Override
	public void update(Modalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(3, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public void delete(Modalidade object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}
	
	@Override
	public List<Modalidade> selectAll() throws SQLException {
		List<Modalidade> list = new ArrayList<Modalidade>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()) {
				list.add(resultSetToObject(resultSet));
			}
		}
		return list;
	}

	@Override
	public Modalidade selectById(long id) throws SQLException {
		Modalidade object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()) {
				object = resultSetToObject(resultSet);
			}
		}
		return object;
	}
	
	@Override
	public long selectLastId() throws SQLException {
		long id = 0;
		String query = generateQuerySelectLastId(TABLE_NAME, COLUMN_ID);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				id = resultSet.getLong(LAST_ID);
			}
		}
		return id;
	}

	@Override
	public Modalidade resultSetToObject(ResultSet resultSet) throws SQLException {
		Modalidade object = new Modalidade();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNome(resultSet.getString(COLUMN_NAME));
		object.setNomeMestre(resultSet.getString(COLUMN_NAME_MASTER));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Modalidade object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNome());
		statement.setString(2, object.getNomeMestre());
		return statement;
	}

}
