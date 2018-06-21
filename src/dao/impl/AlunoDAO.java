package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.DatabaseDAO;
import dao.IDatabaseDAO;
import model.Aluno;

public class AlunoDAO extends DatabaseDAO implements IDatabaseDAO<Aluno>{
	
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

	private final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS aluno "
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
			+ ");";
	
	private final String SQL_INSERT = "INSERT INTO aluno "
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
			+ COLUMN_BLOOD_TYPE
			+ ")"
			+ " VALUES "
			+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private final String SQL_UPDATE = "UPDATE aluno SET"
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
			+ COLUMN_BLOOD_TYPE + UPDATE_MARK
			+ " WHERE " + COLUMN_ID + UPDATE_MARK;
	
	
	private final String SQL_DELETE = "DELETE FROM aluno WHERE " + COLUMN_ID + UPDATE_MARK;
	private final String SQL_SELECT_ALL = "SELECT * FROM aluno";
	private final String SQL_SELECT_BY_ID = "SELECT * FROM aluno WHERE " + COLUMN_ID + UPDATE_MARK;	
		
	public AlunoDAO() {
		super();
		createTable();
	}
	
	@Override
	public void createTable() {
		try {
			executeQuery(SQL_CREATE_TABLE);
		} catch (SQLException e) {
			System.out.println("Não foi possível criar a tabela Aluno, motivo: " + e.getMessage());
		}
	}
	
	@Override
	public void insert(Aluno object) throws SQLException {
		PreparedStatement statement =  objectToPreparedStatement(SQL_INSERT, object);
		executePreparedStatement(statement);
	}

	@Override
	public void update(Aluno object) throws SQLException {
		PreparedStatement statement = objectToPreparedStatement(SQL_UPDATE, object);
		statement.setLong(17, object.getId());
		executePreparedStatement(statement);
	}

	@Override
	public void delete(Aluno object) throws SQLException {
		PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
		statement.setLong(1, object.getId());
		executePreparedStatement(statement);
	}
	
	@Override
	public List<Aluno> selectAll() throws SQLException {
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		ResultSet resultSet = executeQueryWithResult(SQL_SELECT_ALL);
		if (resultSet != null) {
			while (resultSet.next()){
				listaDeAlunos.add(resultSetToObject(resultSet));
			}
		}
		return listaDeAlunos;
	}
	
	@Override
	public Aluno selectById(long id) throws SQLException {
		Aluno aluno = null;
		PreparedStatement statement = getConnection().prepareStatement(SQL_SELECT_BY_ID);
		statement.setLong(1, id);
		ResultSet resultSet = executePreparedStatementWithResult(statement);;
		if (resultSet != null) {
			while (resultSet.next()){
				aluno = resultSetToObject(resultSet);
			}
		}
		return aluno;
	}

	@Override
	public Aluno resultSetToObject(ResultSet resultSet) throws SQLException {
		Aluno objAluno = new Aluno();
		objAluno.setId(resultSet.getLong(COLUMN_ID));
		objAluno.setNome(resultSet.getString(COLUMN_NAME));
		objAluno.setRg(resultSet.getString(COLUMN_RG));
		objAluno.setEmail(resultSet.getString(COLUMN_EMAIL));
		objAluno.setTelefone(resultSet.getString(COLUMN_PHONE));
		objAluno.setCpf(resultSet.getString(COLUMN_CPF));
		objAluno.setDataNascimento(resultSet.getDate(COLUMN_BIRTH_DATE));
		objAluno.setRua(resultSet.getString(COLUMN_STREET));
		objAluno.setNumeroCasa(resultSet.getString(COLUMN_NUMBER_HOUSE));
		objAluno.setComplemento(resultSet.getString(COLUMN_COMPLEMENT));
		objAluno.setBairro(resultSet.getString(COLUMN_NEIGHBORHOOD));
		objAluno.setCep(resultSet.getString(COLUMN_CEP));
		objAluno.setEstado(resultSet.getString(COLUMN_STATE));
		objAluno.setCidade(resultSet.getString(COLUMN_CITY));
		objAluno.setDoencas(resultSet.getString(COLUMN_DISEASES));
		objAluno.setPlanoSaude(resultSet.getString(COLUMN_HEALTH_INSURANCE));
		objAluno.setTipoSanguineo(resultSet.getString(COLUMN_BLOOD_TYPE));		
		return objAluno;
	}

	@Override
	public PreparedStatement objectToPreparedStatement(String query, Aluno object) throws SQLException {
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
		return statement;
	}

}
