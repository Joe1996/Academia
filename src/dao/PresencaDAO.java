package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Presenca;
import model.Professor;;

public class PresencaDAO implements IDatabaseDAO<Presenca> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM PRESENCA";
	private final String COLUMN_ID = "id";
	private final String COLUMN_DATE_HOUR = "dataHora";

	Connection conn;
	
	public PresencaDAO() {
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
	public void insert(Presenca object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Presenca> selectAll() throws SQLException {
		Statement st;
		List<Presenca> listaDePresencas = new ArrayList<Presenca>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Presenca objPresenca = new Presenca();
				objPresenca.setId(rs.getLong(COLUMN_ID));
				objPresenca.setDataHora(rs.getDate(COLUMN_DATE_HOUR));
				listaDePresencas.add(objPresenca);
			}
			System.out.println(listaDePresencas.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDePresencas;
	}

	@Override
	public void update(Presenca object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Presenca object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
