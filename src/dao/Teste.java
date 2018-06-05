package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Teste {
	Connection conn;
	
	public Teste() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://host:localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void buscaInformacoes() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Filme");
			List<Filme> listaDeFilmes = new ArrayList<Filme>();
			while (rs.next()){
				Filme objFilme = new Filme(rs.getInt("id"), rs.getString("nome"), rs.getString("categoria"));
				listaDeFilmes.add(objFilme);
			}
			System.out.println(listaDeFilmes.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}

