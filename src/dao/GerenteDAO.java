package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Gerente;

public class GerenteDAO implements IDatabaseDAO<Gerente> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM GERENTE";
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
	private final String COLUMN_MANAGEMENT_TIME = "tempoGerencia";
	private final String COLUMN_SALARY = "salario";

	Connection conn;
	
	public GerenteDAO() {
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
	public void insert(Gerente object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Gerente> selectAll() throws SQLException {
		Statement st;
		List<Gerente> listaDeGerentes= new ArrayList<Gerente>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Gerente objGerente = new Gerente();
				objGerente.setId(rs.getLong(COLUMN_ID));
				objGerente.setNome(rs.getString(COLUMN_NAME));
				objGerente.setRg(rs.getString(COLUMN_RG));
				objGerente.setEmail(rs.getString(COLUMN_EMAIL));
				objGerente.setTelefone(rs.getString(COLUMN_PHONE));
				objGerente.setCpf(rs.getString(COLUMN_CPF));
				objGerente.setDataNascimento(rs.getDate(COLUMN_BIRTH_DATE));
				objGerente.setRua(rs.getString(COLUMN_STREET));
				objGerente.setNumeroCasa(rs.getString(COLUMN_NUMBER_HOUSE));
				objGerente.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objGerente.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objGerente.setCep(rs.getString(COLUMN_CEP));
				objGerente.setEstado(rs.getString(COLUMN_STATE));
				objGerente.setCidade(rs.getString(COLUMN_CITY));
				objGerente.setDoencas(rs.getString(COLUMN_DISEASES));
				objGerente.setPlanoSaude(rs.getString(COLUMN_HEALTH_INSURANCE));
				objGerente.setTipoSanguineo(rs.getString(COLUMN_BLOOD_TYPE));
				objGerente.setTempoGerencia(rs.getString(COLUMN_MANAGEMENT_TIME));
				objGerente.setSalario(rs.getDouble(COLUMN_SALARY));
				listaDeGerentes.add(objGerente);
			}
			System.out.println(listaDeGerentes.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeGerentes;
	}

	@Override
	public void update(Gerente object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gerente object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
