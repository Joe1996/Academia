package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Funcionario;

public interface IProfessorDAO {
	public void create(String nome, String rg, String email, String telefone, String cpf, 
			Date dataNascimento, String rua, String numeroCasa, String complemento, 
			String bairro, String cep, String estado, String cidade, String doencas,
			String planoSaude, String tipoSanguineo, String graduacao, double salario) throws SQLException;
	public List<Funcionario> retrieve() throws SQLException;
	public void update(Funcionario func) throws SQLException;
	public void delete(Funcionario func) throws SQLException;
}
