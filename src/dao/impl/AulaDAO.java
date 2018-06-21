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
import model.Aula;

public class AulaDAO extends DatabaseDAO implements IDatabaseDAO<Aula> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private final String COLUMN_ID = "_id";
	private final String COLUMN_CLASS_NAME = "nomeAula";
	private final String COLUMN_HOUR_TRAINING = "horaTreino";
	private final String COLUMN_DATE = "data";
	private final String COLUMN_TEACHER_ID = "_idProfessor";
	private final String COLUMN_PERFORMED_ACTIVITIES = "atividadesRealizadas";
	private final String COLUMN_STUDENTS_PRESENT = "alunosPresentes";
	private final String COLUMN_TRAINING_GUESTS = "convidadosTreino";
	private final String COLUMN_FIGHT_MODE = "modalidadeLuta";
	
	private final String TABLE_NAME = "aula";
	
	private final String TABLE_BODY =
			"("
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ COLUMN_CLASS_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_HOUR_TRAINING + " VARCHAR(10) NOT NULL, "
			+ COLUMN_DATE + " VARCHAR(15) NOT NULL, "
			+ COLUMN_TEACHER_ID + " INTEGER NOT NULL, "
			+ COLUMN_PERFORMED_ACTIVITIES + " VARCHAR(150) NOT NULL, "
			+ COLUMN_STUDENTS_PRESENT + " VARCHAR(150) NOT NULL "
			+ COLUMN_TRAINING_GUESTS + " VARCHAR(150) NOT NULL, "
			+ COLUMN_FIGHT_MODE + " VARCHAR(50) NOT NULL"
			+ ");";
	
	private final String SQL_INSERT = "INSERT INTO aula "
			+ "("
			+ COLUMN_CLASS_NAME + COMMA
			+ COLUMN_HOUR_TRAINING + COMMA
			+ COLUMN_DATE + COMMA
			+ COLUMN_TEACHER_ID + COMMA
			+ COLUMN_PERFORMED_ACTIVITIES + COMMA
			+ COLUMN_STUDENTS_PRESENT + COMMA
			+ COLUMN_TRAINING_GUESTS + COMMA
			+ COLUMN_FIGHT_MODE
			+ ")"
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?)";
	
	private final String SQL_UPDATE = "UPDATE aula SET"
			+ COLUMN_CLASS_NAME + UPDATE_MARK + COMMA
			+ COLUMN_HOUR_TRAINING + UPDATE_MARK + COMMA
			+ COLUMN_DATE + UPDATE_MARK + COMMA
			+ COLUMN_TEACHER_ID + UPDATE_MARK + COMMA
			+ COLUMN_PERFORMED_ACTIVITIES + UPDATE_MARK + COMMA
			+ COLUMN_STUDENTS_PRESENT + UPDATE_MARK + COMMA
			+ COLUMN_TRAINING_GUESTS + UPDATE_MARK + COMMA
			+ COLUMN_FIGHT_MODE
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Aula, motivo: " + e.getMessage());
		}			
	}

	@Override
	public long insert(Aula object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		return selectLastId();
	}

	@Override
	public void update(Aula object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(14, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public void delete(Aula object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public List<Aula> selectAll() throws SQLException {
		List<Aula> list = new ArrayList<Aula>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				list.add(resultSetToObject(resultSet));
			}
		}
		return list;
	}

	@Override
	public Aula selectById(long id) throws SQLException {
		Aula object = null;
		String query = generateQuerySelectById(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
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
	public Aula resultSetToObject(ResultSet resultSet) throws SQLException {
		Aula object = new Aula();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNomeAula(resultSet.getString(COLUMN_CLASS_NAME));
		object.setHoraTreino(resultSet.getString(COLUMN_HOUR_TRAINING));
		
		try {
			object.setData(sdf.parse(resultSet.getString(COLUMN_DATE)));
		} catch (ParseException e) {}
		
		long idProfessor = resultSet.getLong(COLUMN_TEACHER_ID);
		object.setProfessor(new ProfessorDAO().selectById(idProfessor));
		
		object.setAtividadesRealizadas(resultSet.getString(COLUMN_PERFORMED_ACTIVITIES));
		object.setAlunosPresentes(resultSet.getString(COLUMN_STUDENTS_PRESENT));
		object.setConvidadosTreino(resultSet.getString(COLUMN_TRAINING_GUESTS));
		object.setModalidadeLuta(resultSet.getString(COLUMN_FIGHT_MODE));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Aula object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNomeAula());
		statement.setString(2, object.getHoraTreino());
		statement.setString(3, sdf.format(object.getData()));
		statement.setLong(4, object.getProfessor() != null ? object.getProfessor().getId() : 0);
		statement.setString(5, object.getAtividadesRealizadas());
		statement.setString(6, object.getAlunosPresentes());
		statement.setString(7, object.getConvidadosTreino());
		statement.setString(8, object.getModalidadeLuta());
		return statement;
	}

}
