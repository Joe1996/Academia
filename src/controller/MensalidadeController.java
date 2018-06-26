package controller;

import java.sql.SQLException;

import dao.impl.AlunoDAO;
import dao.impl.MensalidadeDAO;
import model.Aluno;
import model.Mensalidade;
import util.BusinessException;
import util.StringUtil;
import view.FrameControleMensalidade;

public class MensalidadeController {
	
	private AlunoDAO alunoDao = new AlunoDAO();
	private MensalidadeDAO mensalidadeDao = new MensalidadeDAO();
	private FrameControleMensalidade frame;
	
	public MensalidadeController(FrameControleMensalidade frame) {
		this.frame = frame;
	}
	
	public Mensalidade getMonthlyPayment() throws BusinessException {
		String studentName = frame.getTxtAluno().getText();
		String dueDate = frame.getTxtDataVencimento().getText();
		
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
