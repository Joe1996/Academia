package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Gerente;

public interface IGerenteDAO {
	public void create(String nome, String rg, String email, String telefone, String cpf, 
			Date dataNascimento, String rua, String numeroCasa, String complemento, 
			String bairro, String cep, String estado, String cidade, String doencas,
			String planoSaude, String tipoSanguineo, String tempoGerencia, double salario) throws SQLException;
	public List<Gerente> retrieve() throws SQLException;
	public void update(Gerente gerente) throws SQLException;
	public void delete(Gerente gerente) throws SQLException;
}
