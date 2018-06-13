package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Professor;

public class ProfessorDAO {

	Connection conn;
	
	public ProfessorDAO() {
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
			ResultSet rs = st.executeQuery("SELECT * FROM Professor");
			List<Professor> listaDeProfessores = new ArrayList<Professor>();
			while (rs.next()){
				Professor objProfessor = new Professor();
				objProfessor.setId(rs.getLong("id"));
				objProfessor.setNome(rs.getString("nome"));
				objProfessor.setRg(rs.getString("rg"));
				objProfessor.setEmail(rs.getString("email"));
				objProfessor.setTelefone(rs.getString("telefone"));
				objProfessor.setCpf(rs.getString("cpf"));
				objProfessor.setDataNascimento(rs.getDate("dataNascimento"));
				objProfessor.setRua(rs.getString("rua"));
				objProfessor.setNumeroCasa(rs.getString("numeroCasa"));
				objProfessor.setComplemento(rs.getString("complemento"));
				objProfessor.setBairro(rs.getString("bairro"));
				objProfessor.setCep(rs.getString("cep"));
				objProfessor.setEstado(rs.getString("estado"));
				objProfessor.setCidade(rs.getString("cidade"));
				objProfessor.setDoencas(rs.getString("doencas"));
				objProfessor.setPlanoSaude(rs.getString("planoSaude"));
				objProfessor.setTipoSanguineo(rs.getString("tipoSanguineo"));
				objProfessor.setGraduacao(rs.getString("graduacao"));
				objProfessor.setSalario(rs.getDouble("salario"));
				listaDeProfessores.add(objProfessor);
			}
			System.out.println(listaDeProfessores.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
