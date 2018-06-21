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
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS modalidade "
			+ "(" 
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

	private final String SQL_DELETE = "DELETE FROM modalidade WHERE " + COLUMN_ID + UPDATE_MARK;
	private final String SQL_SELECT_ALL = "SELECT * FROM modalidade";
	private final String SQL_SELECT_BY_ID = "SELECT * FROM modalidade WHERE " + COLUMN_ID + UPDATE_MARK;

	
	public ModalidadeDAO() {
		super();
	}

	@Override
	public void createTable() {
		try {
			executeQuery(SQL_CREATE_TABLE);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela GradeAula, motivo: " + e.getMessage());
		}
	}

	@Override
	public void insert(Modalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
	}

	@Override
	public void update(Modalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(19, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public void delete(Modalidade object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}
	
	@Override
	public List<Modalidade> selectAll() throws SQLException {
		List<Modalidade> list = new ArrayList<Modalidade>();
		ResultSet resultSet = executeQueryWithResult(SQL_SELECT_ALL);
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
		PreparedStatement statement = getConnection().prepareStatement(SQL_SELECT_BY_ID);
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
	public Modalidade resultSetToObject(ResultSet resultSet) throws SQLException {
		Modalidade objModalidade = new Modalidade();
		objModalidade.setId(resultSet.getLong(COLUMN_ID));
		objModalidade.setNome(resultSet.getString(COLUMN_NAME));
		objModalidade.setNomeMestre(resultSet.getString(COLUMN_NAME_MASTER));
		return objModalidade;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Modalidade object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNome());
		statement.setString(2, object.getNomeMestre());
		return statement;
	}
}
