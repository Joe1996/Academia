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
	private final String COLUMN_NUMBER_HOUSE = "numeroCasa";
	private final String COLUMN_COMPLEMENT = "complemento";
	private final String COLUMN_NEIGHBORHOOD = "bairro";
	private final String COLUMN_CEP = "cep";
	private final String COLUMN_STATE = "estado";
	private final String COLUMN_CITY = "cidade";
	private final String COLUMN_DISEASES = "doencas";
	private final String COLUMN_HEALTH_INSURANCE = "planoSaude";
	private final String COLUMN_BLOOD_TYPE = "tipoSanguineo";

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
				objAluno.setNumeroCasa(rs.getString(COLUMN_NUMBER_HOUSE));
				objAluno.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objAluno.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objAluno.setCep(rs.getString(COLUMN_CEP));
				objAluno.setEstado(rs.getString(COLUMN_STATE));
				objAluno.setCidade(rs.getString(COLUMN_CITY));
				objAluno.setDoencas(rs.getString(COLUMN_DISEASES));
				objAluno.setPlanoSaude(rs.getString(COLUMN_HEALTH_INSURANCE));
				objAluno.setTipoSanguineo(rs.getString(COLUMN_BLOOD_TYPE));
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
