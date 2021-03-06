package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.impl.Administrador;
import util.BusinessException;

public class AdministradorDAO extends DatabaseDAO implements IDatabaseDAO<Administrador> {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private final String COLUMN_ID = "_id";
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
	private final String COLUMN_LOGIN = "admLogin";
	private final String COLUMN_PASSWORD = "admPassword";
	
	private final String TABLE_NAME = "administrador";
	
	private final String TABLE_BODY =
			"("
			+ COLUMN_ID + " SERIAL PRIMARY KEY, "
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
			+ COLUMN_HEALTH_INSURANCE + " VARCHAR(100) NOT NULL, "
			+ COLUMN_BLOOD_TYPE + " VARCHAR(10) NOT NULL, "
			+ COLUMN_LOGIN + " VARCHAR(100) NOT NULL, "
			+ COLUMN_PASSWORD + " VARCHAR(100) NOT NULL"
			+ ");";
	
	private final String SQL_INSERT = "INSERT INTO administrador "
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
			+ COLUMN_LOGIN + COMMA
			+ COLUMN_PASSWORD
			+ ")"
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private final String SQL_UPDATE = "UPDATE administrador SET"
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
			+ COLUMN_LOGIN + UPDATE_MARK + COMMA
			+ COLUMN_PASSWORD + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	private void insertAdministrator() throws BusinessException {
		try {
			List<Administrador> list = selectAll();
			Administrador object = getAdministrador();
			for(Administrador administrador : list) {
				if (object.getSenha().equals(administrador.getSenha()) 
						&& object.getLogin().equals(administrador.getLogin())) {
					throw new BusinessException("Usu�rio j� criado!");
				}
			}
			insert(object);
		} catch (SQLException e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	private Administrador getAdministrador() {
		Administrador object = new Administrador();
		object.setNome("Usu�rio Master");
		object.setRg("489130732");
		object.setEmail("usuario@master.com.br");
		object.setTelefone("0800123456");
		object.setCpf("72341759033");
		object.setDataNascimento(new Date());
		object.setRua("Av. Dom Pedro II");
		object.setNumeroCasa("1000");
		object.setComplemento("Casa");
		object.setBairro("Centro");
		object.setCep("88500-00");
		object.setEstado("SC");
		object.setCidade("Lages");
		object.setDoencas("Nenhuma");
		object.setPlanoSaude("Nenhum");
		object.setTipoSanguineo("O+");
		object.setLogin("admin");
		object.setSenha("admin");
		return object;
	}
	
	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
			insertAdministrator();
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel criar a tabela administrador, motivo: " + e.getMessage());
		} catch (BusinessException be) {
			System.out.println("N�o foi poss�vel inserir o usu�rio administrador, motivo: " + be.getMessage());
		}		
	}

	@Override
	public long insert(Administrador object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		long id = selectLastId();
		statement.close();
		closeConnection();
		return id;
	}

	@Override
	public void update(Administrador object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(19, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}

	@Override
	public void delete(Administrador object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
		statement.close();
		closeConnection();
	}
	
	@Override
	public List<Administrador> selectAll() throws SQLException {
		List<Administrador> list = new ArrayList<Administrador>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				list.add(resultSetToObject(resultSet));
			}
		}
		resultSet.close();
		closeConnection();
		return list;
	}

	@Override
	public Administrador selectById(long id) throws SQLException {
		Administrador object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				object = resultSetToObject(resultSet);
			}
		}
		statement.close();
		resultSet.close();
		closeConnection();
		return object;
	}
	
	@Override
	public long selectLastId() throws SQLException {
		long id = 0;
		String query = generateQuerySelectLastId(TABLE_NAME, COLUMN_ID);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				id = resultSet.getLong(LAST_ID);
			}
		}
		resultSet.close();
		closeConnection();
		return id;
	}

	@Override
	public Administrador resultSetToObject(ResultSet resultSet) throws SQLException {
		Administrador object = new Administrador();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNome(resultSet.getString(COLUMN_NAME));
		object.setRg(resultSet.getString(COLUMN_RG));
		object.setEmail(resultSet.getString(COLUMN_EMAIL));
		object.setTelefone(resultSet.getString(COLUMN_PHONE));
		object.setCpf(resultSet.getString(COLUMN_CPF));
		
		try {
			object.setDataNascimento(sdf.parse(resultSet.getString(COLUMN_BIRTH_DATE)));
		} catch (ParseException e) {}
		
		object.setRua(resultSet.getString(COLUMN_STREET));
		object.setNumeroCasa(resultSet.getString(COLUMN_NUMBER_HOUSE));
		object.setComplemento(resultSet.getString(COLUMN_COMPLEMENT));
		object.setBairro(resultSet.getString(COLUMN_NEIGHBORHOOD));
		object.setCep(resultSet.getString(COLUMN_CEP));
		object.setEstado(resultSet.getString(COLUMN_STATE));
		object.setCidade(resultSet.getString(COLUMN_CITY));
		object.setDoencas(resultSet.getString(COLUMN_DISEASES));
		object.setPlanoSaude(resultSet.getString(COLUMN_HEALTH_INSURANCE));
		object.setTipoSanguineo(resultSet.getString(COLUMN_BLOOD_TYPE));
		object.setSenha(resultSet.getString(COLUMN_LOGIN));
		object.setLogin(resultSet.getString(COLUMN_PASSWORD));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Administrador object) throws SQLException {
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
		statement.setString(17, object.getLogin());
		statement.setString(18, object.getSenha());
		return statement;
	}
	
	public Administrador selectByLogin(String login) throws SQLException {
		Administrador object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_LOGIN);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, login);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				object = resultSetToObject(resultSet);
			}
		}
		statement.close();
		resultSet.close();
		closeConnection();
		return object;
	}
	
}
