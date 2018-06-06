package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Plano;

public class PlanoDAO {

	Connection conn;
	
	public PlanoDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesPlano() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Plano");
			List<Plano> listaDePlanos = new ArrayList<Plano>();
			while (rs.next()){
				Plano objPlano = new Plano(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));
				listaDePlanos.add(objPlano);
			}
			System.out.println(listaDePlanos.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
