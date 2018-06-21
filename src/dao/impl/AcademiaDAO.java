package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Academia;

public class AcademiaDAO implements IDatabaseDAO<Academia> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM ACADEMIA";
	private final String COLUMN_ID = "id";
	private final String COLUMN_FANTASY_NAME = "nomeFantasia";
	private final String COLUMN_SOCIAL_NAME = "razaoSocial";
	private final String COLUMN_CNPJ = "cnpj";
	private final String COLUMN_MUNICIPAL_REGISTRATION = "inscricaoMunicipal";
	private final String COLUMN_ADDRESS = "endereco";
	private final String COLUMN_NUMBER = "numero";
	private final String COLUMN_COMPLEMENT = "complemento";
	private final String COLUMN_NEIGHBORHOOD = "bairro";
	private final String COLUMN_CEP = "cep";
	private final String COLUMN_STATE = "estado";
	private final String COLUMN_CITY = "cidade";
	private final String COLUMN_EMAIL = "email";
	private final String COLUMN_PHONE = "telefone";
	
Connection conn;
	
	public AcademiaDAO() {
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
	public void insert(Academia object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Academia> selectAll() throws SQLException {
		Statement st;
		List<Academia> listaDeAcademias = new ArrayList<Academia>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Academia objAcademia = new Academia();
				objAcademia.setId(rs.getLong(COLUMN_ID));
				objAcademia.setNomeFantasia(rs.getString(COLUMN_FANTASY_NAME));
				objAcademia.setRazaoSocial(rs.getString(COLUMN_SOCIAL_NAME));
				objAcademia.setCnpj(rs.getString(COLUMN_CNPJ));
				objAcademia.setInscricaoMunicipal(rs.getString(COLUMN_MUNICIPAL_REGISTRATION));
				objAcademia.setEndereco(rs.getString(COLUMN_ADDRESS));
				objAcademia.setNumero(rs.getString(COLUMN_NUMBER));
				objAcademia.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objAcademia.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objAcademia.setCep(rs.getString(COLUMN_CEP));
				objAcademia.setEstado(rs.getString(COLUMN_STATE));
				objAcademia.setCidade(rs.getString(COLUMN_CITY));
				objAcademia.setEmail(rs.getString(COLUMN_EMAIL));
				objAcademia.setTelefone(rs.getString(COLUMN_PHONE));
				listaDeAcademias.add(objAcademia);
			}
			System.out.println(listaDeAcademias.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeAcademias;
	}
	@Override
	public void update(Academia object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Academia object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
