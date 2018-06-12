package dao;

import java.sql.SQLException;
import java.util.List;

import model.GradeAulas;

public interface IGradeAulas {
	public void create(String nome, String graduacao, String proximaGraduacao) throws SQLException;
	public List<GradeAulas> retrieve() throws SQLException;
	public void update(GradeAulas gradeAulas) throws SQLException;
	public void delete(GradeAulas gradeAulas) throws SQLException;
}
