package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Gerente;
import model.GradeAulas;

public class GradeAulasDAO implements IDatabaseDAO<GradeAulas> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM GRADEAULAS";
	private final String COLUMN_ID = "id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_GRADUATION = "graduacao";
	private final String COLUMN_NEXT_GRADUATION = "proximaGraduacao";

	Connection conn;
	
	public GradeAulasDAO() {
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
	public void insert(GradeAulas object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GradeAulas> selectAll() throws SQLException {
		Statement st;
		List<GradeAulas> listaDeGradeAulas= new ArrayList<GradeAulas>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				GradeAulas objGradeAulas = new GradeAulas();
				objGradeAulas.setId(rs.getLong(COLUMN_ID));
				objGradeAulas.setNome(rs.getString(COLUMN_NAME));
				objGradeAulas.setGraduacao(rs.getString(COLUMN_GRADUATION));
				objGradeAulas.setProximaGraduacao(rs.getString(COLUMN_NEXT_GRADUATION));
				listaDeGradeAulas.add(objGradeAulas);
			}
			System.out.println(listaDeGradeAulas.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeGradeAulas;
	}

	@Override
	public void update(GradeAulas object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GradeAulas object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
