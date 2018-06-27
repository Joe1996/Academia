package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.impl.Mensalidade;

public class MensalidadeDAO extends DatabaseDAO implements IDatabaseDAO<Mensalidade> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private final String COLUMN_ID = "_id";
	private final String COLUMN_STUDENT_ID = "_idAluno";
	private final String COLUMN_DUE_DATE = "dataVencimento";
	
	private final String TABLE_NAME = "mensalidade";
	
	private final String TABLE_BODY =
			"(" 
			+ COLUMN_ID + " SERIAL PRIMARY KEY, " 
			+ COLUMN_STUDENT_ID + " INTEGER NOT NULL, "
			+ COLUMN_DUE_DATE + " VARCHAR(150) NOT NULL"
			+ ");";

	private final String SQL_INSERT = "INSERT INTO mensalidade "
			+ "(" 
			+ COLUMN_STUDENT_ID + COMMA 
			+ COLUMN_DUE_DATE
			+ ")" 
			+ " VALUES "
			+ "(?,?)";

	private final String SQL_UPDATE = "UPDATE mensalidade SET" 
			+ COLUMN_STUDENT_ID + UPDATE_MARK + COMMA 
			+ COLUMN_DUE_DATE + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	private String SELECT_BY_STUDENT_AND_DUE_DATE = "SELECT * FROM " + TABLE_NAME 
			+ " WHERE " 
			+ COLUMN_STUDENT_ID + UPDATE_MARK 
			+ " AND " 
			+ COLUMN_DUE_DATE + UPDATE_MARK;
	
	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Mensalidade, motivo: " + e.getMessage());
		}		
	}

	@Override
	public long insert(Mensalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		long id = selectLastId();
		statement.close();
		closeConnection();
		return id;
	}

	@Override
	public void update(Mensalidade object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(3, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}

	@Override
	public void delete(Mensalidade object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}
	
	@Override
	public List<Mensalidade> selectAll() throws SQLException {
		List<Mensalidade> list = new ArrayList<Mensalidade>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()) {
				list.add(resultSetToObject(resultSet));
			}
		}
		resultSet.close();
		closeConnection();
		return list;
	}

	@Override
	public Mensalidade selectById(long id) throws SQLException {
		Mensalidade object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()) {
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
	public Mensalidade resultSetToObject(ResultSet resultSet) throws SQLException {
		Mensalidade object = new Mensalidade();
		object.setId(resultSet.getLong(COLUMN_ID));
		
		long idAluno = resultSet.getLong(COLUMN_STUDENT_ID);
		object.setAluno(new AlunoDAO().selectById(idAluno));
		
		object.setDataVencimento(resultSet.getDate(COLUMN_DUE_DATE));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Mensalidade object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getAluno() != null ? object.getAluno().getId() : 0);
		statement.setString(2, sdf.format(object.getDataVencimento()));
		return statement;
	}
	
	public Mensalidade selectByStudentAndDueDate(long studentId, String dueDate) throws SQLException {
		Mensalidade object = null;
		PreparedStatement statement = getConnection().prepareStatement(SELECT_BY_STUDENT_AND_DUE_DATE);
		statement.setLong(1, studentId);
		statement.setString(2, dueDate);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()) {
				object = resultSetToObject(resultSet);
			}
		}
		statement.close();
		resultSet.close();
		closeConnection();
		return object;
	}
	
}
