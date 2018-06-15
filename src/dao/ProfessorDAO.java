package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Gerente;
import model.Professor;

public class ProfessorDAO implements IDatabaseDAO<Professor> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM PROFESSOR";
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
	private final String COLUMN_GRADUATION = "graduacao";
	private final String COLUMN_SALARY = "salario";

	Connection conn;
	
	public ProfessorDAO() {
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
	public void insert(Professor object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> selectAll() throws SQLException {
		Statement st;
		List<Professor> listaDeProfessores = new ArrayList<Professor>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Professor objProfessor = new Professor();
				objProfessor.setId(rs.getLong(COLUMN_ID));
				objProfessor.setNome(rs.getString(COLUMN_NAME));
				objProfessor.setRg(rs.getString(COLUMN_RG));
				objProfessor.setEmail(rs.getString(COLUMN_EMAIL));
				objProfessor.setTelefone(rs.getString(COLUMN_PHONE));
				objProfessor.setCpf(rs.getString(COLUMN_CPF));
				objProfessor.setDataNascimento(rs.getDate(COLUMN_BIRTH_DATE));
				objProfessor.setRua(rs.getString(COLUMN_STREET));
				objProfessor.setNumeroCasa(rs.getString(COLUMN_NUMBER_HOUSE));
				objProfessor.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objProfessor.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objProfessor.setCep(rs.getString(COLUMN_CEP));
				objProfessor.setEstado(rs.getString(COLUMN_STATE));
				objProfessor.setCidade(rs.getString(COLUMN_CITY));
				objProfessor.setDoencas(rs.getString(COLUMN_DISEASES));
				objProfessor.setPlanoSaude(rs.getString(COLUMN_HEALTH_INSURANCE));
				objProfessor.setTipoSanguineo(rs.getString(COLUMN_BLOOD_TYPE));
				objProfessor.setGraduacao(rs.getString(COLUMN_GRADUATION));
				objProfessor.setSalario(rs.getDouble(COLUMN_SALARY));
				listaDeProfessores.add(objProfessor);
			}
			System.out.println(listaDeProfessores.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeProfessores;
	}

	@Override
	public void update(Professor object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Professor object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
