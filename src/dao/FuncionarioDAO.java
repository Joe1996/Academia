package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Administrador;
import model.Funcionario;

public class FuncionarioDAO implements IDatabaseDAO<Funcionario> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM FUNCIONARIO";
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
	private final String COLUMN_FUNCTION = "funcao";
	private final String COLUMN_SALARY = "salario";

	Connection conn;
	
	public FuncionarioDAO() {
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
	public void insert(Funcionario object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Funcionario> selectAll() throws SQLException {
		Statement st;
		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Funcionario objFuncionario = new Funcionario();
				objFuncionario.setId(rs.getLong(COLUMN_ID));
				objFuncionario.setNome(rs.getString(COLUMN_NAME));
				objFuncionario.setRg(rs.getString(COLUMN_RG));
				objFuncionario.setEmail(rs.getString(COLUMN_EMAIL));
				objFuncionario.setTelefone(rs.getString(COLUMN_PHONE));
				objFuncionario.setCpf(rs.getString(COLUMN_CPF));
				objFuncionario.setDataNascimento(rs.getDate(COLUMN_BIRTH_DATE));
				objFuncionario.setRua(rs.getString(COLUMN_STREET));
				objFuncionario.setNumeroCasa(rs.getString(COLUMN_NUMBER_HOUSE));
				objFuncionario.setComplemento(rs.getString(COLUMN_COMPLEMENT));
				objFuncionario.setBairro(rs.getString(COLUMN_NEIGHBORHOOD));
				objFuncionario.setCep(rs.getString(COLUMN_CEP));
				objFuncionario.setEstado(rs.getString(COLUMN_STATE));
				objFuncionario.setCidade(rs.getString(COLUMN_CITY));
				objFuncionario.setDoencas(rs.getString(COLUMN_DISEASES));
				objFuncionario.setPlanoSaude(rs.getString(COLUMN_HEALTH_INSURANCE));
				objFuncionario.setTipoSanguineo(rs.getString(COLUMN_BLOOD_TYPE));
				objFuncionario.setFuncao(rs.getString(COLUMN_FUNCTION));
				objFuncionario.setSalario(rs.getDouble(COLUMN_SALARY));
				listaDeFuncionarios.add(objFuncionario);
			}
			System.out.println(listaDeFuncionarios.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeFuncionarios;
	}

	@Override
	public void update(Funcionario object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Funcionario object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
