package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Administrador;

public class AdministradorDAO implements IDatabaseDAO<Administrador> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM ADMINISTRADOR";
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
	private final String COLUMN_LOGIN = "login";
	private final String COLUMN_PASSWORD = "senha";

	Connection conn;
	
	public AdministradorDAO() {
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
	public void insert(Administrador object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Administrador> selectAll() throws SQLException {
		Statement st;
		List<Administrador> listaDeAdministradores = new ArrayList<Administrador>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Administrador objAdministrador = new Administrador();
				objAdministrador.setId(rs.getLong(COLUMN_ID));
				objAdministrador.setNome(rs.getString(COLUMN_NAME));
				objAdministrador.setRg(rs.getString(COLUMN_RG));
				objAdministrador.setEmail(rs.getString(COLUMN_EMAIL));
				objAdministrador.setTelefone(rs.getString(COLUMN_PHONE));
				objAdministrador.setCpf(rs.getString(COLUMN_CPF));
				objAdministrador.setDataNascimento(rs.getDate(COLUMN_BIRTH_DATE));
				objAdministrador.setRua(rs.getString(COLUMN_STREET));
				objAdministrador.setNumeroCasa(rs.getString(COLUMN_NUMBER_HOUSE));
				objAdministrador.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objAdministrador.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objAdministrador.setCep(rs.getString(COLUMN_CEP));
				objAdministrador.setEstado(rs.getString(COLUMN_STATE));
				objAdministrador.setCidade(rs.getString(COLUMN_CITY));
				objAdministrador.setDoencas(rs.getString(COLUMN_DISEASES));
				objAdministrador.setPlanoSaude(rs.getString(COLUMN_HEALTH_INSURANCE));
				objAdministrador.setTipoSanguineo(rs.getString(COLUMN_BLOOD_TYPE));
				objAdministrador.setSenha(rs.getString(COLUMN_LOGIN));
				objAdministrador.setLogin(rs.getString(COLUMN_PASSWORD));
				listaDeAdministradores.add(objAdministrador);
			}
			System.out.println(listaDeAdministradores.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeAdministradores;
	}

	@Override
	public void update(Administrador object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Administrador object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
