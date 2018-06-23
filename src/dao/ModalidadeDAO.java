package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Modalidade;;

public class ModalidadeDAO implements IDatabaseDAO<Modalidade> {
	
	private final String SQL_CREATE_TABLE = "CREATE TABLE IF EXISTS...."; 
	private final String SQL_SELECT_ALL = "SELECT * FROM MODALIDADE";
	private final String COLUMN_ID = "id";
	private final String COLUMN_NAME = "nome";
	private final String COLUMN_NAME_MASTER = "nomeMestre";

	Connection conn;
	
	public ModalidadeDAO() {
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
	public void insert(Modalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Modalidade> selectAll() throws SQLException {
		Statement st;
		List<Modalidade> listaDeModalidades = new ArrayList<Modalidade>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL);
			while (rs.next()){
				Modalidade objModalidade = new Modalidade();
				objModalidade.setId(rs.getLong(COLUMN_ID));
				objModalidade.setNome(rs.getString(COLUMN_NAME));
				objModalidade.setNomeMestre(rs.getString(COLUMN_NAME_MASTER));
				listaDeModalidades.add(objModalidade);
			}
			System.out.println(listaDeModalidades.size());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		return listaDeModalidades;
	}

	@Override
	public void update(Modalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Modalidade object) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
