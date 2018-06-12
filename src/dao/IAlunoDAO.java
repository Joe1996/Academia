package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Aluno;

public interface IAlunoDAO {
	public void create(String nome, String rg, String email, String telefone, String cpf, 
			Date dataNascimento, String rua, String numeroCasa, String complemento, 
			String bairro, String cep, String estado, String cidade, String doencas,
			String planoSaude, String tipoSanguineo) throws SQLException;
	public List<Aluno> retrieve() throws SQLException;
	public void update(Aluno aluno) throws SQLException;
	public void delete(Aluno aluno) throws SQLException;
}
