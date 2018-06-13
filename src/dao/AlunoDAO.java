package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDAO implements IDatabaseDAO<Aluno>{

	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM ALUNO";
	private final String COLUMN_ID = "id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_RG = "rg";
	private final String COLUMN_EMAIL = "email";
	private final String COLUMN_PHONE = "telefone";
	private final String COLUMN_CPF = "cpf";
	private final String COLUMN_BIRTH_DATE = "dataNascimento";
	private final String COLUMN_STREET = "rua";

	Connection conn;
	
	public AlunoDAO() {
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
	public void insert(Aluno object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> selectAll() throws SQLException {
		Statement st;
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Aluno objAluno = new Aluno();
				objAluno.setId(rs.getLong(COLUMN_ID));
				objAluno.setNome(rs.getString(COLUMN_NAME));
				objAluno.setRg(rs.getString(COLUMN_RG));
				objAluno.setEmail(rs.getString(COLUMN_EMAIL));
				objAluno.setTelefone(rs.getString(COLUMN_PHONE));
				objAluno.setCpf(rs.getString(COLUMN_CPF));
				objAluno.setDataNascimento(rs.getDate(COLUMN_BIRTH_DATE));
				objAluno.setRua(rs.getString(COLUMN_STREET));
				objAluno.setNumeroCasa(rs.getString("numeroCasa"));
				objAluno.setComplemento(rs.getString("complemento"));
				objAluno.setBairro(rs.getString("bairro"));
				objAluno.setCep(rs.getString("cep"));
				objAluno.setEstado(rs.getString("estado"));
				objAluno.setCidade(rs.getString("cidade"));
				objAluno.setDoencas(rs.getString("doencas"));
				objAluno.setPlanoSaude(rs.getString("planoSaude"));
				objAluno.setTipoSanguineo(rs.getString("tipoSanguineo"));
				listaDeAlunos.add(objAluno);
			}
			System.out.println(listaDeAlunos.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeAlunos;
	}

	@Override
	public void update(Aluno object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Aluno object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
