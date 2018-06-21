package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.Funcionario;

public class FuncionarioDAO extends DatabaseDAO implements IDatabaseDAO<Funcionario> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
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
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS funcionario "
			+ "("
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ COLUMN_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_RG + " VARCHAR(20) NOT NULL, "
			+ COLUMN_EMAIL + " VARCHAR(50) NOT NULL, "
			+ COLUMN_PHONE + " VARCHAR(20) NOT NULL, "
			+ COLUMN_CPF + " VARCHAR(25) NOT NULL, "
			+ COLUMN_BIRTH_DATE + " VARCHAR(20) NOT NULL, "
			+ COLUMN_STREET + " VARCHAR(150) NOT NULL, "
			+ COLUMN_NUMBER_HOUSE + " VARCHAR(10) NOT NULL, "
			+ COLUMN_COMPLEMENT + " VARCHAR(50) NOT NULL, "
			+ COLUMN_NEIGHBORHOOD + " VARCHAR(50) NOT NULL, "
			+ COLUMN_CEP + " VARCHAR(30) NOT NULL, "
			+ COLUMN_STATE + " VARCHAR(40) NOT NULL, "
			+ COLUMN_CITY + " VARCHAR(50) NOT NULL, "
			+ COLUMN_DISEASES + " VARCHAR(150) NOT NULL, "
			+ COLUMN_HEALTH_INSURANCE + " VARHCAR(100) NOT NULL, "
			+ COLUMN_BLOOD_TYPE + " VARHCAR(10) NOT NULL, "
			+ COLUMN_FUNCTION + " VARCHAR(50) NOT NULL, "
			+ COLUMN_SALARY + " VARCHAR(50) NOT NULL"
			+ ");";
	
	private final String SQL_INSERT = "INSERT INTO funcionario "
			+ "("
			+ COLUMN_NAME + COMMA
			+ COLUMN_RG + COMMA
			+ COLUMN_EMAIL + COMMA
			+ COLUMN_PHONE + COMMA
			+ COLUMN_CPF + COMMA
			+ COLUMN_BIRTH_DATE + COMMA
			+ COLUMN_STREET + COMMA
			+ COLUMN_NUMBER_HOUSE + COMMA
			+ COLUMN_COMPLEMENT + COMMA
			+ COLUMN_NEIGHBORHOOD + COMMA
			+ COLUMN_CEP + COMMA
			+ COLUMN_STATE + COMMA
			+ COLUMN_CITY + COMMA
			+ COLUMN_DISEASES + COMMA
			+ COLUMN_HEALTH_INSURANCE + COMMA
			+ COLUMN_BLOOD_TYPE + COMMA
			+ COLUMN_FUNCTION + COMMA
			+ COLUMN_SALARY
			+ ")"
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private final String SQL_UPDATE = "UPDATE funcionario SET"
			+ COLUMN_NAME + UPDATE_MARK + COMMA
			+ COLUMN_RG + UPDATE_MARK + COMMA
			+ COLUMN_EMAIL + UPDATE_MARK + COMMA
			+ COLUMN_PHONE + UPDATE_MARK + COMMA
			+ COLUMN_CPF + UPDATE_MARK + COMMA
			+ COLUMN_BIRTH_DATE + UPDATE_MARK + COMMA
			+ COLUMN_STREET + UPDATE_MARK + COMMA
			+ COLUMN_NUMBER_HOUSE + UPDATE_MARK + COMMA
			+ COLUMN_COMPLEMENT + UPDATE_MARK + COMMA
			+ COLUMN_NEIGHBORHOOD + UPDATE_MARK + COMMA
			+ COLUMN_CEP + UPDATE_MARK + COMMA
			+ COLUMN_STATE + UPDATE_MARK + COMMA
			+ COLUMN_CITY + UPDATE_MARK + COMMA
			+ COLUMN_DISEASES + UPDATE_MARK + COMMA
			+ COLUMN_HEALTH_INSURANCE + UPDATE_MARK+ COMMA
			+ COLUMN_BLOOD_TYPE + UPDATE_MARK + COMMA
			+ COLUMN_FUNCTION + UPDATE_MARK + COMMA
			+ COLUMN_SALARY + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	
	private final String SQL_DELETE = "DELETE FROM fucionario WHERE " + COLUMN_ID + UPDATE_MARK;
	private final String SQL_SELECT_ALL = "SELECT * FROM funcionario";
	private final String SQL_SELECT_BY_ID = "SELECT * FROM funcionario WHERE " + COLUMN_ID + UPDATE_MARK;	
	
	public FuncionarioDAO() {
		super();
		createTable();
	}
	
	@Override
	public void createTable() {
		try {
			executeQuery(SQL_CREATE_TABLE);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Funcionario, motivo: " + e.getMessage());
		}
	}

	@Override
	public void insert(Funcionario object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
	}


	@Override
	public void update(Funcionario object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(19, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public void delete(Funcionario object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public List<Funcionario> selectAll() throws SQLException {
		List<Funcionario> list = new ArrayList<Funcionario>();
		ResultSet resultSet = executeQueryWithResult(SQL_SELECT_ALL);
		if (resultSet != null) {
			while (resultSet.next()){
				list.add(resultSetToObject(resultSet));
			}
		}
		return list;
	}

	@Override
	public Funcionario selectById(long id) throws SQLException {
		Funcionario object = null;
		PreparedStatement statement = getConnection().prepareStatement(SQL_SELECT_BY_ID);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				object = resultSetToObject(resultSet);
			}
		}
		return object;
	}

	@Override
	public Funcionario resultSetToObject(ResultSet resultSet) throws SQLException {
		Funcionario objFuncionario = new Funcionario();
		objFuncionario.setId(resultSet.getLong(COLUMN_ID));
		objFuncionario.setNome(resultSet.getString(COLUMN_NAME));
		objFuncionario.setRg(resultSet.getString(COLUMN_RG));
		objFuncionario.setEmail(resultSet.getString(COLUMN_EMAIL));
		objFuncionario.setTelefone(resultSet.getString(COLUMN_PHONE));
		objFuncionario.setCpf(resultSet.getString(COLUMN_CPF));
		objFuncionario.setDataNascimento(resultSet.getDate(COLUMN_BIRTH_DATE));
		objFuncionario.setRua(resultSet.getString(COLUMN_STREET));
		objFuncionario.setNumeroCasa(resultSet.getString(COLUMN_NUMBER_HOUSE));
		objFuncionario.setComplemento(resultSet.getString(COLUMN_COMPLEMENT));
		objFuncionario.setBairro(resultSet.getString(COLUMN_NEIGHBORHOOD));
		objFuncionario.setCep(resultSet.getString(COLUMN_CEP));
		objFuncionario.setEstado(resultSet.getString(COLUMN_STATE));
		objFuncionario.setCidade(resultSet.getString(COLUMN_CITY));
		objFuncionario.setDoencas(resultSet.getString(COLUMN_DISEASES));
		objFuncionario.setPlanoSaude(resultSet.getString(COLUMN_HEALTH_INSURANCE));
		objFuncionario.setTipoSanguineo(resultSet.getString(COLUMN_BLOOD_TYPE));
		objFuncionario.setFuncao(resultSet.getString(COLUMN_FUNCTION));
		objFuncionario.setSalario(resultSet.getDouble(COLUMN_SALARY));
		return objFuncionario;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Funcionario object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNome());
		statement.setString(2, object.getRg());
		statement.setString(3, object.getEmail());
		statement.setString(4, object.getTelefone());
		statement.setString(5, object.getCpf());
		statement.setString(6, sdf.format(object.getDataNascimento()));
		statement.setString(7, object.getRua());
		statement.setString(8, object.getNumeroCasa());
		statement.setString(9, object.getComplemento());
		statement.setString(10, object.getBairro());
		statement.setString(11, object.getCep());
		statement.setString(12, object.getEstado());
		statement.setString(13, object.getCidade());
		statement.setString(14, object.getDoencas());
		statement.setString(15, object.getPlanoSaude());
		statement.setString(16, object.getTipoSanguineo());
		statement.setString(17, object.getFuncao());
		statement.setDouble(18, object.getSalario());
		return statement;
	}
	
}
