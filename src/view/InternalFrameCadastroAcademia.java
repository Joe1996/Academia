package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.AcademiaController;
import util.BusinessException;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private AcademiaController controller;

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
		setBounds(100, 100, 835, 520);
		
		JPanel panelDadosEmpresariais = new JPanel();
		panelDadosEmpresariais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Empresariais", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					controller.insert();
					dispose();
					JOptionPane.showMessageDialog(InternalFrameCadastroAcademia.this, "Academia salva com sucesso!");
				} catch (BusinessException be) {
					JOptionPane.showMessageDialog(InternalFrameCadastroAcademia.this, be.getMessage());
				}
			}
		});
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		btnSalvar.setIcon(new ImageIcon(InternalFrameCadastroAcademia.class.getResource("/resources/checked.png")));
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setIcon(new ImageIcon(InternalFrameCadastroAcademia.class.getResource("/resources/eraser.png")));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon(InternalFrameCadastroAcademia.class.getResource("/resources/exit.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelEndereco, 0, 0, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelDadosEmpresariais, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDadosEmpresariais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		
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
					.addGap(78)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNmero)
						.addComponent(lblLogradouro)
						.addComponent(lblComplemento)
						.addComponent(lblBairro)
						.addComponent(lblCep)
						.addComponent(lblCidade)
						.addComponent(lblEstado))
					.addGap(18)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldComplemento, Alignment.TRAILING)
						.addComponent(textFieldLogradouro, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
						.addComponent(textFieldNumero, Alignment.TRAILING)
						.addComponent(textFieldBairro)
						.addComponent(textFieldCEP)
						.addComponent(textFieldCidade)
						.addComponent(textFieldEstado))
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
						.addComponent(lblNmero))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblComplemento))
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
						.addComponent(textFieldCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstado))
					.addContainerGap(143, Short.MAX_VALUE))
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
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		textFieldTelefone = new JFormattedTextField();
		textFieldTelefone.setColumns(10);
		GroupLayout gl_panelDadosEmpresariais = new GroupLayout(panelDadosEmpresariais);
		gl_panelDadosEmpresariais.setHorizontalGroup(
			gl_panelDadosEmpresariais.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelDadosEmpresariais.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblRazaoSocial)
						.addComponent(lblNomeFantasia)
						.addComponent(lblCnpj)
						.addComponent(lblInscricaoMunicipal)
						.addComponent(lblEmail)
						.addComponent(lblTelefone))
					.addGap(18)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldTelefone)
						.addComponent(textFieldInscricaoMunicipal, Alignment.TRAILING)
						.addComponent(textFieldCnpj, Alignment.TRAILING)
						.addComponent(textFieldRazaoSocial, Alignment.TRAILING)
						.addComponent(textFieldNomeFantasia, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(textFieldEmail))
					.addContainerGap())
		);
		gl_panelDadosEmpresariais.setVerticalGroup(
			gl_panelDadosEmpresariais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosEmpresariais.createSequentialGroup()
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNomeFantasia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeFantasia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldRazaoSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRazaoSocial))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCnpj))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldInscricaoMunicipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInscricaoMunicipal))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosEmpresariais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addContainerGap())
		);
		panelDadosEmpresariais.setLayout(gl_panelDadosEmpresariais);
		getContentPane().setLayout(groupLayout);
		controller = new AcademiaController(this);
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
