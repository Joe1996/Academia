package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Administrador;

public class AdministradorDAO {

	Connection conn;
	
	public AdministradorDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesAdministrador() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Administrador");
			List<Administrador> listaDeAdministradores = new ArrayList<Administrador>();
			while (rs.next()){
				Administrador objAdministrador = new Administrador();
				objAdministrador.setId(rs.getLong("id"));
				objAdministrador.setNome(rs.getString("nome"));
				objAdministrador.setRg(rs.getString("rg"));
				objAdministrador.setEmail(rs.getString("email"));
				objAdministrador.setTelefone(rs.getString("telefone"));
				objAdministrador.setCpf(rs.getString("cpf"));
				objAdministrador.setDataNascimento(rs.getDate("dataNascimento"));
				objAdministrador.setRua(rs.getString("rua"));
				objAdministrador.setNumeroCasa(rs.getString("numeroCasa"));
				objAdministrador.setComplemento(rs.getString("complemento"));
				objAdministrador.setBairro(rs.getString("bairro"));
				objAdministrador.setCep(rs.getString("cep"));
				objAdministrador.setEstado(rs.getString("estado"));
				objAdministrador.setCidade(rs.getString("cidade"));
				objAdministrador.setDoencas(rs.getString("doencas"));
				objAdministrador.setPlanoSaude(rs.getString("planoSaude"));
				objAdministrador.setTipoSanguineo(rs.getString("tipoSanguineo"));
				objAdministrador.setSenha(rs.getString("login"));
				objAdministrador.setLogin(rs.getString("senha"));
				listaDeAdministradores.add(objAdministrador);
			}
			System.out.println(listaDeAdministradores.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
