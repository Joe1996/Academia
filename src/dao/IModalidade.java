package dao;

import java.sql.SQLException;
import java.util.List;

import model.Modalidade;

public interface IModalidade {
	public void create(String nome, String nomeMestre) throws SQLException;
	public List<Modalidade> retrieve() throws SQLException;
	public void update(Modalidade modalidade) throws SQLException;
	public void delete(Modalidade modalidade) throws SQLException;
}
