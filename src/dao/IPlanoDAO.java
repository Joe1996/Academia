package dao;

import java.sql.SQLException;
import java.util.List;

import model.Plano;

public interface IPlanoDAO {
	public void create(String nome, double valor) throws SQLException;
	public List<Plano> retrieve() throws SQLException;
	public void update(Plano plano) throws SQLException;
	public void delete(Plano plano) throws SQLException;
}
