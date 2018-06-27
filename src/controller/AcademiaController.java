package controller;

import java.sql.SQLException;

import dao.impl.AcademiaDAO;
import model.impl.Academia;
import util.BusinessException;
import util.StringUtil;
import view.InternalFrameCadastroAcademia;

public class AcademiaController {

	private AcademiaDAO dao = new AcademiaDAO();
	private InternalFrameCadastroAcademia frame;
	
	public AcademiaController(InternalFrameCadastroAcademia frame) {
		this.frame = frame;
	}
	
	public void insert() throws BusinessException {
		Academia object = generateObject();
		try {
			dao.insert(object);
		} catch (SQLException ex) {
			System.out.println("Não foi possível inserir os dados da academia no banco, motivo: " + ex.getMessage());
			throw new BusinessException("Não foi possível inserir a academia.");
		}
	}
	
	private Academia generateObject() throws BusinessException {
		Academia object = new Academia();
		
		if (StringUtil.isEmpty(frame.getTextFieldNomeFantasia().getText())) 
			throw new BusinessException("O nome fantasia deve ser informado!");
		
		object.setNomeFantasia(frame.getTextFieldNomeFantasia().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldRazaoSocial().getText()))
			throw new BusinessException("A razão social deve ser informada!");
		
		object.setRazaoSocial(frame.getTextFieldRazaoSocial().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldCnpj().getText()))
			throw new BusinessException("O CNPJ deve ser informado!");
		
		object.setCnpj(frame.getTextFieldCnpj().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldInscricaoMunicipal().getText()))
			throw new BusinessException("A inscrição municipal deve ser informada!");
		
		object.setInscricaoMunicipal(frame.getTextFieldInscricaoMunicipal().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldEmail().getText()))
			throw new BusinessException("O email deve ser informado!");
		
		object.setEmail(frame.getTextFieldEmail().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldTelefone().getText()))
			throw new BusinessException("O telefone deve ser informado!");
		
		object.setTelefone(frame.getTextFieldTelefone().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldLogradouro().getText()))
			throw new BusinessException("O logradouro deve ser informado!");
		
		object.setEndereco(frame.getTextFieldLogradouro().getText());
		
		if (StringUtil.isEmpty(frame.getTextFieldNumero().getText()))
			throw new BusinessException("O número deve ser informado!");
		
		object.setNumero(frame.getTextFieldNumero().getText());
		
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
		
		return object;
	}
	
}
