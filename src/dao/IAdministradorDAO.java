package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Administrador;

public interface IAdministradorDAO {
	public void create(String nome, String rg, String email, String telefone, String cpf, 
			Date dataNascimento, String rua, String numeroCasa, String complemento, 
			String bairro, String cep, String estado, String cidade, String doencas,
			String planoSaude, String tipoSanguineo, String login, String senha) throws SQLException;
	public List<Administrador> retrieve() throws SQLException;
	public void update(Administrador adm) throws SQLException;
	public void delete(Administrador adm) throws SQLException;
}
