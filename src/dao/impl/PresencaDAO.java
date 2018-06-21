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
import model.Presenca;;

public class PresencaDAO extends DatabaseDAO implements IDatabaseDAO<Presenca> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private final String COLUMN_ID = "_id";
	private final String COLUMN_DATE_HOUR = "dataHora";
	private final String COLUMN_STUDENT_ID = "_idAluno";
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS presenca "
			+ "(" 
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ COLUMN_DATE_HOUR + " VARCHAR(50) NOT NULL, "
			+ COLUMN_STUDENT_ID  + " INTEGER NOT NULL"
			+ ");";

	private final String SQL_INSERT = "INSERT INTO presenca "
			+ "("
			+ COLUMN_DATE_HOUR + COMMA
			+ COLUMN_STUDENT_ID + COMMA
			+ ")" 
			+ " VALUES "
			+ "(?,?)";

	private final String SQL_UPDATE = "UPDATE presenca SET"
			+ COLUMN_DATE_HOUR + UPDATE_MARK + COMMA
			+ COLUMN_STUDENT_ID + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;

	private final String SQL_DELETE = "DELETE FROM presenca WHERE " + COLUMN_ID + UPDATE_MARK;
	private final String SQL_SELECT_ALL = "SELECT * FROM presenca";
	private final String SQL_SELECT_BY_ID = "SELECT * FROM presenca WHERE " + COLUMN_ID + UPDATE_MARK;
	
	public PresencaDAO() {
		super();
	}
	
	@Override
	public void createTable() {
		try {
			executeQuery(SQL_CREATE_TABLE);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Aluno, motivo: " + e.getMessage());
		}		
	}

	@Override
	public void insert(Presenca object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);		
	}

	@Override
	public void update(Presenca object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(17, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public void delete(Presenca object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}
	
	@Override
	public List<Presenca> selectAll() throws SQLException {
		List<Presenca> listaDeAlunos = new ArrayList<Presenca>();
		ResultSet resultSet = executeQueryWithResult(SQL_SELECT_ALL);
		if (resultSet != null) {
			while (resultSet.next()){
				listaDeAlunos.add(resultSetToObject(resultSet));
			}
		}
		return listaDeAlunos;
	}

	@Override
	public Presenca selectById(long id) throws SQLException {
		Presenca aluno = null;
		PreparedStatement statement = getConnection().prepareStatement(SQL_SELECT_BY_ID);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				aluno = resultSetToObject(resultSet);
			}
		}
		return aluno;
	}

	@Override
	public Presenca resultSetToObject(ResultSet resultSet) throws SQLException {
		Presenca objPresenca = new Presenca();
		objPresenca.setId(resultSet.getLong(COLUMN_ID));
		try {
			objPresenca.setDataHora(sdf.parse(COLUMN_DATE_HOUR));
		} catch (ParseException e) {}
		return objPresenca;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Presenca object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, sdf.format(object.getDataHora()));
		statement.setLong(2, object.getIdAluno());
		return statement;
	}
	
}
