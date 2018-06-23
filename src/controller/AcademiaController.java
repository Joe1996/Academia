//package controller;
//
//import dao.impl.AcademiaDAO;
//import model.Academia;
//import view.FrameCadastroAcademia;
//
//public class AcademiaController {
//
//	private AcademiaDAO dao = new AcademiaDAO();
//	
//	private FrameCadastroAcademia frame;
//	
//	public AcademiaController(FrameCadastroAcademia frame) {
//		this.frame = frame;
//	}
//	
//	public void insertUser() throws Exception {
//		Academia object = generateObject();
//		dao.insert(object);
//	}
//	
//	private Academia generateObject() throws Exception {
//		Academia object = new Academia();
//		
//		if (frame.getTxtNomeFantasia().getText().isEmpty()) 
//			throw new Exception("O nome fantasia deve ser informado!");
//		
//		object.setNomeFantasia(frame.getTxtNomeFantasia().getText());
//		
//		if (frame.getTxtRazaoSocial().getText().isEmpty())
//			throw new Exception("A razão social deve ser informada!");
//		
//		object.setRazaoSocial(frame.getTxtRazaoSocial().getText());
//		
//		if (frame.getTxtCnpj().getText().isEmpty())
//			throw new Exception("O CNPJ deve ser informado!");
//		
//		object.setCnpj(frame.getTxtCnpj().getText());
//		
//		if (frame.getTxtInscricaoMunicipal().getText().isEmpty())
//			throw new Exception("A inscrição municipal deve ser informada!");
//		
//		object.setInscricaoMunicipal(frame.getTxtInscricaoMunicipal().getText());
//		
//		if (frame.getTxtEndereco().getText().isEmpty())
//			throw new Exception("O endereço deve ser informado!");
//		
//		object.setEndereco(frame.getTxtEndereco().getText());
//		
//		if (frame.getTxtNumero().getText().isEmpty())
//			throw new Exception("O número deve ser informado!");
//		
//		object.setNumero(frame.getTxtNumero().getText());
//		
//		if (frame.getTxtComplemento().getText().isEmpty())
//			throw new Exception("O complemento deve ser informado!");
//		
//		object.setComplemento(frame.getTxtComplemento().getText());
//		
//		if (frame.getTxtBairro().getText().isEmpty())
//			throw new Exception("O bairro deve ser informado!");
//		
//		object.setBairro(frame.getTxtBairro().getText());
//		
//		if (frame.getTxtCep().getText().isEmpty())
//			throw new Exception("O cep deve ser informado!");
//		
//		object.setCep(frame.getTxtCep().getText());
//		
//		if (frame.getTxtEstado().getText().isEmpty())
//			throw new Exception("O estado deve ser informado!");
//		
//		object.setEstado(frame.getTxtEstado().getText());
//		
//		if (frame.getTxtCidade().getText().isEmpty())
//			throw new Exception("A cidade deve ser informada!");
//		
//		object.setCidade(frame.getTxtCidade().getText());
//		
//		if (frame.getTxtEmail().getText().isEmpty())
//			throw new Exception("O email deve ser informado!");
//		
//		object.setEmail(frame.getTxtEmail().getText());
//		
//		if (frame.getTxtTelefone().getText().isEmpty())
//			throw new Exception("O telefone deve ser informado!");
//		
//		object.setTelefone(frame.getTxtTelefone().getText());
//			
//		return object;
//	}
//	
//}
