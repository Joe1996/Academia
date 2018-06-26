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
import model.GradeAula;

public class GradeAulasDAO extends DatabaseDAO implements IDatabaseDAO<GradeAula> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private final String COLUMN_ID = "_id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_START_TIME = "horaInicio";
	private final String COLUMN_END_TIME = "horaTermino";
	private final String COLUMN_MAX_STUDENTS = "maxAlunos";
	private final String COLUMN_CLASS_DAYS = "diasAula";
	private final String COLUMN_VALUE = "valor";
	private final String COLUMN_MODALITY_ID = "_idModality";
	private final String COLUMN_TEACHER_ID = "_idTeacher";
	
	private final String TABLE_NAME = "gradeAula";
	
	private final String TABLE_BODY =
			"(" 
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
			+ COLUMN_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_START_TIME + " VARCHAR(50) NOT NULL, "
			+ COLUMN_END_TIME + " VARCHAR(50) NOT NULL, "
			+ COLUMN_MAX_STUDENTS + " INTEGER NOT NULL, "
			+ COLUMN_CLASS_DAYS + " VARCHAR(200) NOT NULL, "
			+ COLUMN_VALUE + " VARCHAR(15) NOT NULL, "
			+ COLUMN_MODALITY_ID + " INTEGER NOT NULL, "
			+ COLUMN_TEACHER_ID + " INTEGER NOT NULL"
			+ ");";

	private final String SQL_INSERT = "INSERT INTO gradeAula "
			+ "(" 
			+ COLUMN_NAME + COMMA 
			+ COLUMN_START_TIME + COMMA
			+ COLUMN_END_TIME + COMMA
			+ COLUMN_MAX_STUDENTS + COMMA
			+ COLUMN_CLASS_DAYS + COMMA
			+ COLUMN_VALUE + COMMA
			+ COLUMN_MODALITY_ID + COMMA
			+ COLUMN_TEACHER_ID
			+ ")" 
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?)";

	private final String SQL_UPDATE = "UPDATE gradeAula SET" 
			+ COLUMN_NAME + UPDATE_MARK + COMMA 
			+ COLUMN_START_TIME + UPDATE_MARK + COMMA
			+ COLUMN_END_TIME + UPDATE_MARK + COMMA
			+ COLUMN_MAX_STUDENTS + UPDATE_MARK + COMMA
			+ COLUMN_CLASS_DAYS + UPDATE_MARK + COMMA
			+ COLUMN_VALUE + UPDATE_MARK + COMMA
			+ COLUMN_MODALITY_ID + UPDATE_MARK + COMMA
			+ COLUMN_TEACHER_ID + UPDATE_MARK
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
	public long insert(GradeAula object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		return selectLastId();
	}

	@Override
	public void update(GradeAula object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(9, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public void delete(GradeAula object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public List<GradeAula> selectAll() throws SQLException {
		List<GradeAula> list = new ArrayList<GradeAula>();
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
	public GradeAula selectById(long id) throws SQLException {
		GradeAula object = null;
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
	public GradeAula resultSetToObject(ResultSet resultSet) throws SQLException {
		GradeAula object = new GradeAula();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNome(resultSet.getString(COLUMN_NAME));
		
		try {
			object.setHoraInicio(sdf.parse(resultSet.getString(COLUMN_START_TIME)));
		} catch (ParseException e) {}
		
		try {
			object.setHoraTermino(sdf.parse(resultSet.getString(COLUMN_END_TIME)));
		} catch (ParseException e) {}
		
		object.setMaximoAlunos(resultSet.getInt(COLUMN_MAX_STUDENTS));
		object.setDiasAula(resultSet.getString(COLUMN_CLASS_DAYS));
		object.setValor(Double.parseDouble(resultSet.getString(COLUMN_VALUE)));
		
		long idModalidade = resultSet.getInt(COLUMN_MODALITY_ID);
		object.setModalidade(new ModalidadeDAO().selectById(idModalidade));
		
		long idProfessor = resultSet.getLong(COLUMN_TEACHER_ID);
		object.setProfessor(new ProfessorDAO().selectById(idProfessor));
		
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, GradeAula object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNome());
		statement.setString(2, sdf.format(object.getHoraInicio()));
		statement.setString(3, sdf.format(object.getHoraTermino()));
		statement.setInt(4, object.getMaximoAlunos());
		statement.setString(5, object.getDiasAula());
		statement.setDouble(6, object.getValor());
		statement.setLong(7, object.getModalidade() != null ? object.getModalidade().getId() : 0);
		statement.setLong(8, object.getProfessor() != null ? object.getProfessor().getId() : 0);
		return statement;
	}

}
