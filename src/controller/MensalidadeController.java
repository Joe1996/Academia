package controller;

import java.sql.SQLException;

import dao.impl.AlunoDAO;
import dao.impl.MensalidadeDAO;
import model.impl.Aluno;
import model.impl.Mensalidade;
import util.BusinessException;
import util.StringUtil;
import view.InternalFrameMensalidade;

public class MensalidadeController {
	
	private AlunoDAO alunoDao = new AlunoDAO();
	private MensalidadeDAO mensalidadeDao = new MensalidadeDAO();
	private InternalFrameMensalidade frame;
	
	public MensalidadeController(InternalFrameMensalidade frame) {
		this.frame = frame;
	}
	
	public Mensalidade getMonthlyPayment() throws BusinessException {
		String studentName = "";
		String dueDate = "";
		
		if (StringUtil.isEmpty(studentName))
			throw new BusinessException("O nome do aluno deve ser informado!");
		
		if (StringUtil.isEmpty(dueDate))
			throw new BusinessException("A data de vencimento deve ser informada!");
		
		try {
			Aluno student = alunoDao.selectByName(studentName);
			
			if (student == null || student.getId() == 0)
				throw new BusinessException("O aluno não foi encontrado.");
			
			return mensalidadeDao.selectByStudentAndDueDate(student.getId(), dueDate);
		} catch (SQLException e) {
			System.out.println("Não foi possível buscar a mensalidade, motivo: " + e.getMessage());
			throw new BusinessException("Não foi possível buscar a mensalidade");
		}
	}
	
}
