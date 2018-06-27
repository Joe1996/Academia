package controller;

import java.sql.SQLException;
import java.util.List;

import dao.impl.ModalidadeDAO;
import dao.impl.ProfessorDAO;
import model.impl.Modalidade;
import model.impl.Professor;
import util.BusinessException;
import util.StringUtil;
import view.InternalFrameCadastroModalidade;

public class ModalidadeController {
	
	private ModalidadeDAO modalidadeDAO = new ModalidadeDAO();
	private ProfessorDAO professorDAO = new ProfessorDAO();
	private InternalFrameCadastroModalidade frame;
	
	public ModalidadeController(InternalFrameCadastroModalidade frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		Modalidade object = generateObject();
		try {
			modalidadeDAO.insert(object);
		} catch (SQLException ex) {
			System.out.println("Não foi possível inserir os dados da modalidade no banco, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível inserir o modalidade.");
		}
	}
	
	public void populateProfessorComboBox() {
		try {
			List<Professor> list = professorDAO.selectAll();
			for(Professor professor : list) {
				frame.getComboBoxProfessor().addItem(professor);
			}			
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar os professores do banco, motivo: " + e.getMessage());
		}
	}
	
	private Modalidade generateObject() throws BusinessException {
		Modalidade object = new Modalidade();
		
		if (StringUtil.isEmpty(frame.getTextFieldNome().getText())) 
			throw new BusinessException("O nome deve ser informado!");
		
		object.setNome(frame.getTextFieldNome().getText());
		
		Professor professor = (Professor) frame.getComboBoxProfessor().getSelectedItem();
		if (professor == null)
			throw new BusinessException("Selecione um professor para esta modalidade!");
			
		return object;
	}
	
}
