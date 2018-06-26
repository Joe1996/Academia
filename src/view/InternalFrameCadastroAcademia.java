package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class InternalFrameCadastroAcademia extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNomeFantasia;
	private JTextField textFieldRazaoSocial;
	private JFormattedTextField textFieldCnpj;
	private JTextField textFieldInscricaoMunicipal;
	private JTextField textFieldLogradouro;
	private JTextField textFieldNumero;
	private JTextField textFieldComplemento;
	private JTextField textFieldBairro;
	private JFormattedTextField textFieldCEP;
	private JTextField textFieldCidade;
	private JTextField textFieldEstado;
	private JTextField textFieldEmail;
	private JFormattedTextField textFieldTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameCadastroAcademia frame = new InternalFrameCadastroAcademia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InternalFrameCadastroAcademia() {
		setClosable(true);
		setTitle("Cadastrar Acad\u00EAmia");
		setBounds(100, 100, 835, 350);
		
		JPanel panelDadosEmpresariais = new JPanel();
		panelDadosEmpresariais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Empresariais", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelContato = new JPanel();
		panelContato.setBorder(new TitledBorder(null, "Contato", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\eraser.png"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\exit.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelContato, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelDadosEmpresariais, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLimparCampos, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(panelEndereco, 0, 0, Short.MAX_VALUE))
					.addGap(14))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panelDadosEmpresariais, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panelContato, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSalvar)
								.addComponent(btnLimparCampos)
								.addComponent(btnSair))))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		textFieldTelefone = new JFormattedTextField();
		textFieldTelefone.setColumns(10);
		GroupLayout gl_panelContato = new GroupLayout(panelContato);
		gl_panelContato.setHorizontalGroup(
			gl_panelContato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContato.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelContato.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEmail)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldEmail, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panelContato.setVerticalGroup(
			gl_panelContato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContato.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		panelContato.setLayout(gl_panelContato);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		
		JLabel lblComplemento = new JLabel("Complemento");
		
		JLabel lblBairro = new JLabel("Bairro");
		
		JLabel lblCep = new JLabel("CEP");
		
		JLabel lblEstado = new JLabel("Estado");
		
		JLabel lblCidade = new JLabel("Cidade");
		
		textFieldLogradouro = new JTextField();
		textFieldLogradouro.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		
		textFieldComplemento = new JTextField();
		textFieldComplemento.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		
		textFieldCEP = new JFormattedTextField();
		textFieldCEP.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setColumns(10);
		GroupLayout gl_panelEndereco = new GroupLayout(panelEndereco);
		gl_panelEndereco.setHorizontalGroup(
			gl_panelEndereco.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEndereco.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNmero)
						.addComponent(lblLogradouro)
						.addComponent(lblBairro)
						.addComponent(lblCep)
						.addComponent(lblCidade)
						.addComponent(lblEstado))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldLogradouro, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
						.addGroup(gl_panelEndereco.createSequentialGroup()
							.addComponent(textFieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblComplemento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldComplemento, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
						.addComponent(textFieldBairro, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
						.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEstado, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
						.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelEndereco.setVerticalGroup(
			gl_panelEndereco.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEndereco.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLogradouro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblComplemento)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmero))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(textFieldCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstado))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		panelEndereco.setLayout(gl_panelEndereco);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia");
		
		JLabel lblRazaoSocial = new JLabel("Raz\u00E3o Social");
		
		JLabel lblCnpj = new JLabel("CNPJ");
		
		JLabel lblInscricaoMunicipal = new JLabel("Inscri\u00E7\u00E3o Municipal");
		
		textFieldNomeFantasia = new JTextField();
		textFieldNomeFantasia.setColumns(10);
		
		textFieldRazaoSocial = new JTextField();
		textFieldRazaoSocial.setColumns(10);
		
		textFieldCnpj = new JFormattedTextField();
		textFieldCnpj.setColumns(10);
		
		textFieldInscricaoMunicipal = new JTextField();
		textFieldInscricaoMunicipal.setColumns(10);
		GroupLayout gl_panelDadosEmpresariais = new GroupLayout(panelDadosEmpresariais);
		gl_panelDadosEmpresariais.setHorizontalGroup(
			gl_panelDadosEmpresariais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosEmpresariais.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNomeFantasia)
						.addComponent(lblCnpj)
						.addComponent(lblInscricaoMunicipal)
						.addComponent(lblRazaoSocial))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldNomeFantasia, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(textFieldRazaoSocial, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(textFieldCnpj, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(textFieldInscricaoMunicipal, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelDadosEmpresariais.setVerticalGroup(
			gl_panelDadosEmpresariais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosEmpresariais.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeFantasia)
						.addComponent(textFieldNomeFantasia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRazaoSocial)
						.addComponent(textFieldRazaoSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnpj)
						.addComponent(textFieldCnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInscricaoMunicipal)
						.addComponent(textFieldInscricaoMunicipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		panelDadosEmpresariais.setLayout(gl_panelDadosEmpresariais);
		getContentPane().setLayout(groupLayout);

	}

	public JTextField getTextFieldNomeFantasia() {
		return textFieldNomeFantasia;
	}

	public JTextField getTextFieldRazaoSocial() {
		return textFieldRazaoSocial;
	}

	public JFormattedTextField getTextFieldCnpj() {
		return textFieldCnpj;
	}

	public JTextField getTextFieldInscricaoMunicipal() {
		return textFieldInscricaoMunicipal;
	}

	public JTextField getTextFieldLogradouro() {
		return textFieldLogradouro;
	}

	public JTextField getTextFieldNumero() {
		return textFieldNumero;
	}

	public JTextField getTextFieldComplemento() {
		return textFieldComplemento;
	}

	public JTextField getTextFieldBairro() {
		return textFieldBairro;
	}

	public JFormattedTextField getTextFieldCEP() {
		return textFieldCEP;
	}

	public JTextField getTextFieldCidade() {
		return textFieldCidade;
	}

	public JTextField getTextFieldEstado() {
		return textFieldEstado;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public JFormattedTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}
	
}
