package controller;

import java.sql.SQLException;

import dao.impl.AdministradorDAO;
import model.Administrador;
import util.BusinessException;
import util.StringUtil;
import view.FrameLogin;

public class LoginController {
	
	private FrameLogin frame;
	private AdministradorDAO administradorDao;
	
	public LoginController(FrameLogin frame) {
		this.frame = frame;
		this.administradorDao = new AdministradorDAO();
	}
	
	private String getPassword() {
		char[] password = frame.getPasswordFieldSenha().getPassword();
		StringBuilder builder = new StringBuilder();		
		for(int position = 0; position < password.length; position++) {
			builder.append(password[position]);
		}		
		return builder.toString();
	}
	
	public boolean validateLogin() throws BusinessException {
		String login = frame.getTextFieldLogin().getText();
		String password = getPassword();		
		
		if (StringUtil.isEmpty(login))
			throw new BusinessException("O login deve ser informado.");
		
		if (StringUtil.isEmpty(password))
			throw new BusinessException("A senha deve ser informada.");

		try {
			Administrador administrador = administradorDao.selectByLogin(login);
			
			if (administrador == null)
				throw new BusinessException("Usuário não cadastrado.");
			
			if (!password.equals(administrador.getSenha()))
				throw new BusinessException("Senha incorreta.");
			
			return true;
		} catch (SQLException ex) {
			System.out.println("Não foi possível carregar o administrador, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível carregar o administrador.");
		}
	}

}
