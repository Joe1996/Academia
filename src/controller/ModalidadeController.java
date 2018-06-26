package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import dao.impl.ModalidadeDAO;
import model.Modalidade;
import util.BusinessException;
import view.InternalFrameCadastroModalidade;

public class ModalidadeController {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private ModalidadeDAO dao = new ModalidadeDAO();
	private InternalFrameCadastroModalidade frame;
	
	public ModalidadeController(InternalFrameCadastroModalidade frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		Modalidade object = generateObject();
		try {
			dao.insert(object);
		} catch (SQLException ex) {
			System.out.println("Não foi possível inserir os dados da modalidade no banco, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível inserir o modalidade.");
		}
	}
	
	private Modalidade generateObject() throws BusinessException {
		Modalidade object = new Modalidade();
		
//		TODO objeto modalidade
			
		return object;
	}
	
}
