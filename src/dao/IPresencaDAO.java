package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Presenca;

public interface IPresencaDAO {
	public void create(Date dataHora) throws SQLException;
	public List<Presenca> retrieve() throws SQLException;
	public void update(Presenca presenca) throws SQLException;
	public void delete(Presenca presenca) throws SQLException;
}
