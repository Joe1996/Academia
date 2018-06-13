package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.GradeAulas;

public class GradeAulasDAO {

	Connection conn;
	
	public GradeAulasDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesGerente() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM GradeAulas");
			List<GradeAulas> listaDeGradeAulas= new ArrayList<GradeAulas>();
			while (rs.next()){
				GradeAulas objGradeAulas = new GradeAulas();
				objGradeAulas.setId(rs.getLong("id"));
				objGradeAulas.setNome(rs.getString("nome"));
				objGradeAulas.setGraduacao(rs.getString("graduacao"));
				objGradeAulas.setProximaGraduacao(rs.getString("proximaGraduacao"));
				listaDeGradeAulas.add(objGradeAulas);
			}
			System.out.println(listaDeGradeAulas.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
