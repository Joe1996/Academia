package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Presenca;;

public class PresencaDAO {

	Connection conn;
	
	public PresencaDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesPresenca() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Presenca");
			List<Presenca> listaDePresencas = new ArrayList<Presenca>();
			while (rs.next()){
				Presenca objPresenca = new Presenca();
				objPresenca.setId(rs.getLong("id"));
				objPresenca.setDataHora(rs.getDate("dataHora"));
				listaDePresencas.add(objPresenca);
			}
			System.out.println(listaDePresencas.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
