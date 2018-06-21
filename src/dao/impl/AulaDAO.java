package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Aula;

public class AulaDAO implements IDatabaseDAO<Aula> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM AULA";
	private final String COLUMN_ID = "id";
	private final String COLUMN_CLASS_NAME = "nomeAula";
	private final String COLUMN_HOUR_TRAINING = "horaTreino";
	private final String COLUMN_DATE = "data";
	private final String COLUMN_TEACHER_NAME = "nomeProfessor";
	private final String COLUMN_PERFORMED_ACTIVITIES = "atividadesRealizadas";
	private final String COLUMN_STUDENTS_PRESENT = "alunosPresentes";
	private final String COLUMN_TRAINING_GUESTS = "convidadosTreino";
	private final String COLUMN_FIGHT_MODE = "modalidadeLuta";
	
	Connection conn;
	
	public AulaDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
			createTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void createTable() {
		//TODO EXECUTAR SCRIPT DE CREATE TABLE
	}

	@Override
	public void insert(Aula object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aula> selectAll() throws SQLException {
		Statement st;
		List<Aula> listaDeAulas = new ArrayList<Aula>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Aula objAula = new Aula();
				objAula.setId(rs.getLong(COLUMN_ID));
				objAula.setNomeAula(rs.getString(COLUMN_CLASS_NAME));
				objAula.setHoraTreino(rs.getString(COLUMN_HOUR_TRAINING));
				objAula.setData(rs.getDate(COLUMN_DATE));
				objAula.setNomeProfessor(rs.getString(COLUMN_TEACHER_NAME));
				objAula.setAtividadesRealizadas(rs.getString(COLUMN_PERFORMED_ACTIVITIES));
				objAula.setAlunosPresentes(rs.getString(COLUMN_STUDENTS_PRESENT));
				objAula.setConvidadosTreino(rs.getString(COLUMN_TRAINING_GUESTS));
				objAula.setModalidadeLuta(rs.getString(COLUMN_FIGHT_MODE));
				listaDeAulas.add(objAula);
			}
			System.out.println(listaDeAulas.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeAulas;
	}

	@Override
	public void update(Aula object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Aula object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
