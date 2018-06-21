package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.Plano;

public class PlanoDAO extends DatabaseDAO implements IDatabaseDAO<Plano> {

	private final String COLUMN_ID = "id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_VALUE = "valor";
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS plano "
			+ "(" 
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
			+ COLUMN_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_VALUE + " VARCHAR(15) NOT NULL "
			+ ");";

	private final String SQL_INSERT = "INSERT INTO plano "
			+ "(" 
			+ COLUMN_NAME + COMMA 
			+ COLUMN_VALUE
			+ ")" 
			+ " VALUES "
			+ "(?,?)";

	private final String SQL_UPDATE = "UPDATE plano SET" 
			+ COLUMN_NAME + UPDATE_MARK + COMMA
			+ COLUMN_VALUE + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;

	private final String SQL_DELETE = "DELETE FROM plano WHERE " + COLUMN_ID + UPDATE_MARK;
	private final String SQL_SELECT_ALL = "SELECT * FROM plano";
	private final String SQL_SELECT_BY_ID = "SELECT * FROM plano WHERE " + COLUMN_ID + UPDATE_MARK;
	
	public PlanoDAO() {
		super();
	}
	
	@Override
	public void createTable() {
		try {
			executeQuery(SQL_CREATE_TABLE);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Plano, motivo: " + e.getMessage());
		}		
	}

	@Override
	public void insert(Plano object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);		
	}

	@Override
	public void update(Plano object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(19, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public void delete(Plano object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public List<Plano> selectAll() throws SQLException {
		List<Plano> list = new ArrayList<Plano>();
		ResultSet resultSet = executeQueryWithResult(SQL_SELECT_ALL);
		if (resultSet != null) {
			while (resultSet.next()) {
				list.add(resultSetToObject(resultSet));
			}
		}
		return list;
	}

	@Override
	public Plano selectById(long id) throws SQLException {
		Plano object = null;
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
	public Plano resultSetToObject(ResultSet resultSet) throws SQLException {
		Plano object = new Plano();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNome(resultSet.getString(COLUMN_NAME));
		object.setValor(Double.parseDouble(resultSet.getString(COLUMN_VALUE)));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Plano object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNome());
		statement.setDouble(2, object.getValor());
		return statement;
	}
}
