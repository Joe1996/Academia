package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.impl.AcademiaDAO;
import dao.impl.AdministradorDAO;
import dao.impl.AlunoDAO;
import dao.impl.AulaDAO;
import dao.impl.FuncionarioDAO;
import dao.impl.GerenteDAO;
import dao.impl.GradeAulasDAO;
import dao.impl.MensalidadeDAO;
import dao.impl.ModalidadeDAO;
import dao.impl.PlanoDAO;
import dao.impl.PresencaDAO;
import dao.impl.ProfessorDAO;

public class DatabaseDAO {

	private final String USER = "postgres";
	private final String PASSWORD = "postgres";

	protected final String COMMA = ", ";
	protected final String UPDATE_MARK = " = ?";
	protected final String LAST_ID = "lastId";

	protected Connection connection;

	public static void createTables() {
		new AcademiaDAO().createTable();
		new AdministradorDAO().createTable();
		new AlunoDAO().createTable();
		new AulaDAO().createTable();
		new FuncionarioDAO().createTable();
		new GerenteDAO().createTable();
		new GradeAulasDAO().createTable();
		new MensalidadeDAO().createTable();
		new ModalidadeDAO().createTable();
		new PlanoDAO().createTable();
		new PresencaDAO().createTable();
		new ProfessorDAO().createTable();
	}

	private void connectJDBC() throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost/academiaDB", USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Erro ao connectar com banco: " + e.getMessage());
			throw new SQLException("Sem conex�o com o banco de dados!");
		}
	}
	
	protected void closeConnection() {
		try {
			if (isConnected())
				connection.close();
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel fechar a conex�o com o banco, motivo: " + e.getMessage());
		}
	}

	protected boolean isConnected() throws SQLException {
		return connection != null && connection.isClosed();
	}

	protected Connection getConnection() throws SQLException {
		if (!isConnected())
			connectJDBC();
		return connection;
	}

	protected void executeQuery(String query) throws SQLException {
		Statement statement = getConnection().createStatement();
		statement.executeUpdate(query);
		statement.close();
	}

	protected ResultSet executeQueryWithResult(String query) throws SQLException {
		Statement statement = getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		return resultSet;
	}

	protected void executePreparedStatement(PreparedStatement statement) throws SQLException {
		statement.execute();
		statement.close();
	}

	protected ResultSet executePreparedStatementWithResult(PreparedStatement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery();
		return resultSet;
	}

	private final String SQL_CREATE_TALE = "CREATE TABLE IF NOT EXISTS %s %s";

	protected void createTable(String tableName, String tableBody) throws SQLException {
		String query = String.format(SQL_CREATE_TALE, tableName, tableBody);
		executeQuery(query);
	}

	private final String SQL_DELETE = "DELETE FROM %s WHERE %s = ?";

	protected String generateQueryDelete(String tableName, String columnIdName) {
		return String.format(SQL_DELETE, tableName, columnIdName);
	}

	private final String SQL_SELECT_ALL = "SELECT * FROM %s";

	protected String generateQuerySelectAll(String tableName) {
		return String.format(SQL_SELECT_ALL, tableName);
	}

	private final String SQL_SELECT_BY = "SELECT * FROM %s WHERE %s = ?";

	protected String generateQuerySelectBy(String tableName, String columnName) {
		return String.format(SQL_SELECT_BY, tableName, columnName);
	}

	private final String SQL_SELECT_LAST_ID = "SELECT MAX(%s) AS %s FROM %s";

	protected String generateQuerySelectLastId(String tableName, String columnIdName) {
		return String.format(SQL_SELECT_LAST_ID, columnIdName, LAST_ID, tableName);
	}

}
