package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Modalidade;;

public class ModalidadeDAO {

	Connection conn;
	
	public ModalidadeDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesModalidade() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Modalidade");
			List<Modalidade> listaDeModalidades = new ArrayList<Modalidade>();
			while (rs.next()){
				Modalidade objModalidade = new Modalidade();
				objModalidade.setId(rs.getLong("id"));
				objModalidade.setNome(rs.getString("nome"));
				objModalidade.setNomeMestre(rs.getString("nomeMestre"));
				listaDeModalidades.add(objModalidade);
			}
			System.out.println(listaDeModalidades.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
