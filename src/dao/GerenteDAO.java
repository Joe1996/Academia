package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Gerente;

public class GerenteDAO {

	Connection conn;
	
	public GerenteDAO() {
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
			ResultSet rs = st.executeQuery("SELECT * FROM Gerente");
			List<Gerente> listaDeGerentes= new ArrayList<Gerente>();
			while (rs.next()){
				Gerente objGerente = new Gerente();
				objGerente.setId(rs.getLong("id"));
				objGerente.setNome(rs.getString("nome"));
				objGerente.setRg(rs.getString("rg"));
				objGerente.setEmail(rs.getString("email"));
				objGerente.setTelefone(rs.getString("telefone"));
				objGerente.setCpf(rs.getString("cpf"));
				objGerente.setDataNascimento(rs.getDate("dataNascimento"));
				objGerente.setRua(rs.getString("rua"));
				objGerente.setNumeroCasa(rs.getString("numeroCasa"));
				objGerente.setComplemento(rs.getString("complemento"));
				objGerente.setBairro(rs.getString("bairro"));
				objGerente.setCep(rs.getString("cep"));
				objGerente.setEstado(rs.getString("estado"));
				objGerente.setCidade(rs.getString("cidade"));
				objGerente.setDoencas(rs.getString("doencas"));
				objGerente.setPlanoSaude(rs.getString("planoSaude"));
				objGerente.setTipoSanguineo(rs.getString("tipoSanguineo"));
				objGerente.setTempoGerencia(rs.getString("tempoGerencia"));
				objGerente.setSalario(rs.getDouble("salario"));
				listaDeGerentes.add(objGerente);
			}
			System.out.println(listaDeGerentes.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
