package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.Academia;

public class AcademiaDAO extends DatabaseDAO implements IDatabaseDAO<Academia> {
	
	private final String COLUMN_ID = "_id";
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
	
	private final String TABLE_NAME = "academia";
	
	private final String TABLE_BODY =
			"("
			+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ COLUMN_FANTASY_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_SOCIAL_NAME + " VARCHAR(150) NOT NULL, "
			+ COLUMN_CNPJ + " VARCHAR(50) NOT NULL, "
			+ COLUMN_MUNICIPAL_REGISTRATION + " VARCHAR(100) NOT NULL, "
			+ COLUMN_ADDRESS + " VARCHAR(50) NOT NULL, "
			+ COLUMN_NUMBER + " VARCHAR(15) NOT NULL "
			+ COLUMN_COMPLEMENT + " VARCHAR(50) NOT NULL, "
			+ COLUMN_NEIGHBORHOOD + " VARCHAR(50) NOT NULL, "
			+ COLUMN_CEP + " VARCHAR(30) NOT NULL, "
			+ COLUMN_STATE + " VARCHAR(40) NOT NULL, "
			+ COLUMN_CITY + " VARCHAR(50) NOT NULL, "
			+ COLUMN_EMAIL + " VARCHAR(50) NOT NULL, "
			+ COLUMN_PHONE + " VARCHAR(20) NOT NULL"
			+ ");";
	
	private final String SQL_INSERT = "INSERT INTO academia "
			+ "("
			+ COLUMN_FANTASY_NAME + COMMA
			+ COLUMN_SOCIAL_NAME + COMMA
			+ COLUMN_CNPJ + COMMA
			+ COLUMN_MUNICIPAL_REGISTRATION + COMMA
			+ COLUMN_ADDRESS + COMMA
			+ COLUMN_NUMBER + COMMA
			+ COLUMN_COMPLEMENT + COMMA
			+ COLUMN_NEIGHBORHOOD + COMMA
			+ COLUMN_CEP + COMMA
			+ COLUMN_STATE + COMMA
			+ COLUMN_CITY + COMMA
			+ COLUMN_EMAIL + COMMA
			+ COLUMN_PHONE
			+ ")"
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private final String SQL_UPDATE = "UPDATE academia SET"
			+ COLUMN_FANTASY_NAME + UPDATE_MARK + COMMA
			+ COLUMN_SOCIAL_NAME + UPDATE_MARK + COMMA
			+ COLUMN_CNPJ + UPDATE_MARK + COMMA
			+ COLUMN_MUNICIPAL_REGISTRATION + UPDATE_MARK + COMMA
			+ COLUMN_ADDRESS + UPDATE_MARK + COMMA
			+ COLUMN_NUMBER + UPDATE_MARK + COMMA
			+ COLUMN_COMPLEMENT + UPDATE_MARK + COMMA
			+ COLUMN_NEIGHBORHOOD + UPDATE_MARK + COMMA
			+ COLUMN_CEP + UPDATE_MARK + COMMA
			+ COLUMN_STATE + UPDATE_MARK + COMMA
			+ COLUMN_CITY + UPDATE_MARK + COMMA
			+ COLUMN_EMAIL + UPDATE_MARK + COMMA
			+ COLUMN_PHONE + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	@Override
	public void createTable() {
		try {
			createTable(TABLE_NAME, TABLE_BODY);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Academia, motivo: " + e.getMessage());
		}		
	}
	
	@Override
	public long insert(Academia object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
		return selectLastId();
	}

	@Override
	public void update(Academia object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(14, object.getId());
		executePreparedStatement(statement);		
	}
	
	@Override
	public void delete(Academia object) throws SQLException {
		String query = generateQueryDelete(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);		
	}

	@Override
	public List<Academia> selectAll() throws SQLException {
		List<Academia> list = new ArrayList<Academia>();
		String query = generateQuerySelectAll(TABLE_NAME);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				list.add(resultSetToObject(resultSet));
			}
		}
		return list;
	}

	@Override
	public Academia selectById(long id) throws SQLException {
		Academia object = null;
		String query = generateQuerySelectBy(TABLE_NAME, COLUMN_ID);
		PreparedStatement statement = getConnection().prepareStatement(query);
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
	public long selectLastId() throws SQLException {
		long id = 0;
		String query = generateQuerySelectLastId(TABLE_NAME, COLUMN_ID);
		ResultSet resultSet = executeQueryWithResult(query);
		if (resultSet != null) {
			while (resultSet.next()){
				id = resultSet.getLong(LAST_ID);
			}
		}
		return id;
	}

	@Override
	public Academia resultSetToObject(ResultSet resultSet) throws SQLException {
		Academia object = new Academia();
		object.setId(resultSet.getLong(COLUMN_ID));
		object.setNomeFantasia(resultSet.getString(COLUMN_FANTASY_NAME));
		object.setRazaoSocial(resultSet.getString(COLUMN_SOCIAL_NAME));
		object.setCnpj(resultSet.getString(COLUMN_CNPJ));
		object.setInscricaoMunicipal(resultSet.getString(COLUMN_MUNICIPAL_REGISTRATION));
		object.setEndereco(resultSet.getString(COLUMN_ADDRESS));
		object.setNumero(resultSet.getString(COLUMN_NUMBER));
		object.setComplemento(resultSet.getString(COLUMN_COMPLEMENT));
		object.setBairro(resultSet.getString(COLUMN_NEIGHBORHOOD));
		object.setCep(resultSet.getString(COLUMN_CEP));
		object.setEstado(resultSet.getString(COLUMN_STATE));
		object.setCidade(resultSet.getString(COLUMN_CITY));
		object.setEmail(resultSet.getString(COLUMN_EMAIL));
		object.setTelefone(resultSet.getString(COLUMN_PHONE));
		return object;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Academia object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(query);
		statement.setString(1, object.getNomeFantasia());
		statement.setString(2, object.getRazaoSocial());
		statement.setString(3, object.getCnpj());
		statement.setString(4, object.getInscricaoMunicipal());
		statement.setString(5, object.getEndereco());
		statement.setString(6, object.getNumero());
		statement.setString(7, object.getComplemento());
		statement.setString(8, object.getBairro());
		statement.setString(9, object.getCep());
		statement.setString(10, object.getEstado());
		statement.setString(11, object.getCidade());
		statement.setString(12, object.getEmail());
		statement.setString(13, object.getTelefone());
		return statement;
	}

}
