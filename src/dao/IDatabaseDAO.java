package dao;

import java.sql.SQLException;
import java.util.List;

public interface IDatabaseDAO<T> {
	public void insert(T object) throws SQLException;
	public List<T> selectAll() throws SQLException;
	public void update(T object) throws SQLException;
	public void delete(T object) throws SQLException;
}
