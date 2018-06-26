package controller;

import java.sql.SQLException;

import dao.impl.PlanoDAO;
import model.Plano;
import util.BusinessException;
import view.InternalFrameCadastroPlano;

public class PlanoController {
	
	private PlanoDAO dao = new PlanoDAO();
	private InternalFrameCadastroPlano frame;
	
	public PlanoController(InternalFrameCadastroPlano frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		Plano object = generateObject();
		try {
			dao.insert(object);
		} catch (SQLException ex) {
			System.out.println("Não foi possível inserir os dados da plano no banco, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível inserir o plano.");
		}
	}
	
	private Plano generateObject() throws BusinessException {
		Plano object = new Plano();
		
//		TODO objeto plano
			
		return object;
	}
	
}
