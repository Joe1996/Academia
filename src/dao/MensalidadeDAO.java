package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Mensalidade;

public class MensalidadeDAO implements IDatabaseDAO<Mensalidade> {

	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM MODALIDADE";
	private final String COLUMN_ID = "id";
	private final String COLUMN_STUDENT_NAME = "nomeAluno";
	private final String COLUMN_DUE_DATE = "dataVencimento";
	
	Connection conn;
	
	public MensalidadeDAO() {
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
	public void insert(Mensalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mensalidade> selectAll() throws SQLException {
		Statement st;
		List<Mensalidade> listaDeMensalidades = new ArrayList<Mensalidade>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Mensalidade objMensalidade = new Mensalidade();
				objMensalidade.setId(rs.getLong(COLUMN_ID));
				objMensalidade.setNomeAluno(rs.getString(COLUMN_STUDENT_NAME));
				objMensalidade.setDataVencimento(rs.getDate(COLUMN_DUE_DATE));
				listaDeMensalidades.add(objMensalidade);
			}
			System.out.println(listaDeMensalidades.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeMensalidades;
	}

	@Override
	public void update(Mensalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Mensalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
}
