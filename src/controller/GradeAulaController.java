package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import dao.impl.GradeAulasDAO;
import model.GradeAula;
import util.BusinessException;
import view.InternalFrameCadastroGradeAula;

public class GradeAulaController {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private GradeAulasDAO dao = new GradeAulasDAO();
	private InternalFrameCadastroGradeAula frame;
	
	public GradeAulaController(InternalFrameCadastroGradeAula frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		GradeAula object = generateObject();
		try {
			dao.insert(object);
		} catch (SQLException ex) {
			System.out.println("Não foi possível inserir os dados da grade aula no banco, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível inserir o grade aula.");
		}
	}
	
	private GradeAula generateObject() throws BusinessException {
		GradeAula object = new GradeAula();
		
//		TODO objeto grade aula
			
		return object;
	}
	
}
