package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.impl.ProfessorDAO;
import model.impl.Professor;
import util.BusinessException;
import util.StringUtil;
import view.InternalFrameCadastroProfessor;

public class ProfessorController {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private ProfessorDAO dao = new ProfessorDAO();
	private InternalFrameCadastroProfessor frame;
	
	public ProfessorController(InternalFrameCadastroProfessor frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		Professor object = generateObject();
		try {
			dao.insert(object);
		} catch (SQLException ex) {
			System.out.println("N�o foi poss�vel inserir os dados da professor no banco, motivo: " + ex.getMessage());
			throw new BusinessException("N�o foi poss�vel inserir o professor.");
		}
	}
	
	private Professor generateObject() throws BusinessException {
		Professor object = new Professor();
		
		if (StringUtil.isEmpty(frame.getTextFieldNome().getText())) 
			throw new BusinessException("O nome deve ser informado!");
		
		object.setNome(frame.getTextFieldNome().getText());
		
		if (StringUtil.isEmpty(frame.getFormattedTextFieldCPF().getText()))
			throw new BusinessException("O cpf deve ser informado!");
		
		object.setCpf(frame.getFormattedTextFieldCPF().getText());		
		
		if (StringUtil.isEmpty(frame.getTextFieldRG().getText()))
			throw new BusinessException("A RG deve ser informada!");
		
		object.setRg(frame.getTextFieldRG().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldDataDeNascimento().getText()))
			throw new BusinessException("A data de nascimento deve ser informada!");
		
		try {
			object.setDataNascimento(sdf.parse(frame.getTextFieldDataDeNascimento().getText()));
		} catch (ParseException e) {
			throw new BusinessException("A data de nascimento está em um formato incorreto!");
		}
		
		if (StringUtil.isEmpty(frame.getTextFieldEnfermidade().getText()))
			throw new BusinessException("A enfermidade deve ser informada!");
		
		object.setDoencas(frame.getTextFieldEnfermidade().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldPlanoDeSaude().getText()))
			throw new BusinessException("O plano de sa�de deve ser informado!");
		
		object.setPlanoSaude(frame.getTextFieldPlanoDeSaude().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldEmail().getText()))
			throw new BusinessException("O email deve ser informado!");
		
		object.setEmail(frame.getTextFieldEmail().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldTelefone().getText()))
			throw new BusinessException("A telefone deve ser informado!");
		
		object.setTelefone(frame.getTextFieldTelefone().getText());
		
		String sanguineo = (String) frame.getComboBoxSanguineo().getSelectedItem();
		if (StringUtil.isEmpty(sanguineo))
			throw new BusinessException("Selecione o tipo sanguineo!");	
		
		object.setTipoSanguineo(sanguineo);
		
		if (StringUtil.isEmpty(frame.getTextFieldLogradouro().getText()))
			throw new BusinessException("O logradouro deve ser informado!");
		
		object.setRua(frame.getTextFieldLogradouro().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldNumeroDaCasa().getText()))
			throw new BusinessException("O numero da casa deve ser informado!");
		
		object.setNumeroCasa(frame.getTextFieldNumeroDaCasa().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldComplemento().getText()))
			throw new BusinessException("O complemento deve ser informado!");
		
		object.setComplemento(frame.getTextFieldComplemento().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldBairro().getText()))
			throw new BusinessException("O bairro deve ser informado!");
		
		object.setBairro(frame.getTextFieldBairro().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldCEP().getText()))
			throw new BusinessException("O cep deve ser informado!");
		
		object.setCep(frame.getTextFieldCEP().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldCidade().getText()))
			throw new BusinessException("A cidade deve ser informada!");
		
		object.setCidade(frame.getTextFieldCidade().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldEstado().getText()))
			throw new BusinessException("O estado deve ser informado!");
		
		object.setEstado(frame.getTextFieldEstado().getText());	
		
		if (StringUtil.isEmpty(frame.getTextFieldSalario().getText()))
			throw new BusinessException("O sal�rio deve ser informado!");
		
		object.setSalario(frame.getTextFieldEstado().getText());
		
		object.setGraduacao("gradua��o");
			
		return object;
	}
	
}
