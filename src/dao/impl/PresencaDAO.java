package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.impl.Presenca;;

public class PresencaDAO extends DatabaseDAO implements IDatabaseDAO<Presenca> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private final String COLUMN_ID = "_id";
	private final String COLUMN_DATE_HOUR = "dataHora";
	private final String COLUMN_STUDENT_ID = "_idAluno";
	
	private final String TABLE_NAME = "presenca";
	
	private final String TABLE_BODY =
			"("
			+ COLUMN_ID + " SERIAL PRIMARY KEY, "
			+ COLUMN_DATE_HOUR + " VARCHAR(50) NOT NULL, "
			+ COLUMN_STUDENT_ID  + " INTEGER NOT NULL"
			+ ");";

	private final String SQL_INSERT = "INSERT INTO presenca "
			+ "("
			+ COLUMN_DATE_HOUR + COMMA
			+ COLUMN_STUDENT_ID
			+ ")" 
			+ " VALUES "
			+ "(?,?)";

	private final String SQL_UPDATE = "UPDATE presenca SET"
			+ COLUMN_DATE_HOUR + UPDATE_MARK + COMMA
			+ COLUMN_STUDENT_ID + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Presenca, motivo: " + e.getMessage());
		}		
	}

	@Override
	public long insert(Presenca object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		long id = selectLastId();
		statement.close();
		closeConnection();
		return id;
	}

	@Override
	public void update(Presenca object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(3, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}

	@Override
	public void delete(Presenca object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}
	
	@Override
	public List<Presenca> selectAll() throws SQLException {
		List<Presenca> list = new ArrayList<Presenca>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				list.add(resultSetToObject(resultSet));
			}
		}
		resultSet.close();
		closeConnection();
		return list;
	}

	@Override
	public Presenca selectById(long id) throws SQLException {
		Presenca object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				object = resultSetToObject(resultSet);
			}
		}
		statement.close();
		resultSet.close();
		closeConnection();
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
		resultSet.close();
		closeConnection();
		return id;
	}

	@Override
	public Presenca resultSetToObject(ResultSet resultSet) throws SQLException {
		Presenca object = new Presenca();
		object.setId(resultSet.getLong(COLUMN_ID));
		try {
			object.setDataHora(sdf.parse(COLUMN_DATE_HOUR));
		} catch (ParseException e) {}
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Presenca object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, sdf.format(object.getDataHora()));
		statement.setLong(2, object.getIdAluno());
		return statement;
	}
	
}
