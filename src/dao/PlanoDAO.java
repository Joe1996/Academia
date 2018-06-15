package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Plano;
import model.Presenca;

public class PlanoDAO implements IDatabaseDAO<Plano> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM PLANO";
	private final String COLUMN_ID = "id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_VALUE = "valor";

	Connection conn;
	
	public PlanoDAO() {
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
	public void insert(Plano object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Plano> selectAll() throws SQLException {
		Statement st;
		List<Plano> listaDePlanos = new ArrayList<Plano>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Plano objPlano = new Plano();
				objPlano.setId(rs.getLong(COLUMN_ID));
				objPlano.setNome(rs.getString(COLUMN_NAME));
				objPlano.setValor(rs.getDouble(COLUMN_VALUE));
				listaDePlanos.add(objPlano);
			}
			System.out.println(listaDePlanos.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDePlanos;
	}

	@Override
	public void update(Plano object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Plano object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
