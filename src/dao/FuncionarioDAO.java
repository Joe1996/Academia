package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDAO {

	Connection conn;
	
	public FuncionarioDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDb", "postgres", "aluno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void buscaInformacoesFuncionario() {
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Funcionario");
			List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
			while (rs.next()){
				Funcionario objFuncionario = new Funcionario();
				objFuncionario.setId(rs.getLong("id"));
				objFuncionario.setNome(rs.getString("nome"));
				objFuncionario.setRg(rs.getString("rg"));
				objFuncionario.setEmail(rs.getString("email"));
				objFuncionario.setTelefone(rs.getString("telefone"));
				objFuncionario.setCpf(rs.getString("cpf"));
				objFuncionario.setDataNascimento(rs.getDate("dataNascimento"));
				objFuncionario.setRua(rs.getString("rua"));
				objFuncionario.setNumeroCasa(rs.getString("numeroCasa"));
				objFuncionario.setComplemento(rs.getString("complemento"));
				objFuncionario.setBairro(rs.getString("bairro"));
				objFuncionario.setCep(rs.getString("cep"));
				objFuncionario.setEstado(rs.getString("estado"));
				objFuncionario.setCidade(rs.getString("cidade"));
				objFuncionario.setDoencas(rs.getString("doencas"));
				objFuncionario.setPlanoSaude(rs.getString("planoSaude"));
				objFuncionario.setTipoSanguineo(rs.getString("tipoSanguineo"));
				objFuncionario.setFuncao(rs.getString("funcao"));
				objFuncionario.setSalario(rs.getDouble("salario"));
				listaDeFuncionarios.add(objFuncionario);
			}
			System.out.println(listaDeFuncionarios.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
