package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import controller.ProfessorController;
import util.BusinessException;

public class InternalFrameCadastroProfessor extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JFormattedTextField textFieldEnfermidade;
	private JFormattedTextField textFieldDataDeNascimento;
	private JTextField textFieldPlanoDeSaude;
	private JFormattedTextField textFieldRG;
	private JTextField textFieldEmail;
	private JFormattedTextField textFieldTelefone;
	private JTextField textFieldLogradouro;
	private JTextField textFieldNumeroDaCasa;
	private JTextField textFieldComplemento;
	private JTextField textFieldBairro;
	private JFormattedTextField textFieldCEP;
	private JTextField textFieldCidade;
	private JTextField textFieldEstado;
	private JTextField textFieldSalario;
	private JFormattedTextField formattedTextFieldCPF;
	private JComboBox<String> comboBoxSanguineo;
	private JComboBox<String> comboBoxFuncao;
	private JComboBox<String> comboBoxModalidade;
	private ProfessorController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameCadastroProfessor frame = new InternalFrameCadastroProfessor();
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
	public InternalFrameCadastroProfessor() {
		
		setTitle("Cadastrar Professor");
		setClosable(true);
		setBounds(100, 100, 590, 723);
		
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					controller.insert();
				} catch (BusinessException be) {
					JOptionPane.showMessageDialog(InternalFrameCadastroProfessor.this, be.getMessage());
				}
			}
		});
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		
		JPanel panelEmprego = new JPanel();
		panelEmprego.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Emprego", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Modalidade");
		
		JLabel label_1 = new JLabel("Fun\u00E7\u00E3o");
		
		JLabel label_2 = new JLabel("Sal\u00E1rio");
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		
		comboBoxFuncao = new JComboBox<String>();
		comboBoxFuncao.setModel(new DefaultComboBoxModel<String>(new String[] {"Professor"}));
		
		comboBoxModalidade = new JComboBox<String>();
		comboBoxModalidade.setModel(new DefaultComboBoxModel<String>(new String[] {"Jiu-Jitsu", "Taekwondo", "Capoeira"}));
		GroupLayout gl_panelEmprego = new GroupLayout(panelEmprego);
		gl_panelEmprego.setHorizontalGroup(
			gl_panelEmprego.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelEmprego.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_2)
						.addComponent(label_1)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(comboBoxModalidade, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBoxFuncao, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textFieldSalario, 353, 353, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelEmprego.setVerticalGroup(
			gl_panelEmprego.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEmprego.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxFuncao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldSalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxModalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelEmprego.setLayout(gl_panelEmprego);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelEndereco, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelDadosPessoais, GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
						.addComponent(panelEmprego, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelEmprego, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		
		JLabel lblNmeroDaCasa = new JLabel("N\u00FAmero da Casa");
		
		JLabel lblComplement = new JLabel("Complemento");
		
		JLabel lblBairro = new JLabel("Bairro");
		
		JLabel lblCep = new JLabel("CEP");
		
		JLabel lblEstado = new JLabel("Estado");
		
		JLabel lblCidade = new JLabel("Cidade");
		
		textFieldLogradouro = new JTextField();
		textFieldLogradouro.setColumns(10);
		
		textFieldNumeroDaCasa = new JTextField();
		textFieldNumeroDaCasa.setColumns(10);
		
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
					.addGap(75)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNmeroDaCasa)
						.addComponent(lblComplement)
						.addComponent(lblLogradouro)
						.addComponent(lblBairro)
						.addComponent(lblCep)
						.addComponent(lblCidade)
						.addComponent(lblEstado))
					.addGap(18)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(textFieldComplemento)
						.addComponent(textFieldNumeroDaCasa, Alignment.LEADING)
						.addComponent(textFieldBairro, Alignment.LEADING)
						.addComponent(textFieldCEP, Alignment.LEADING)
						.addComponent(textFieldCidade, Alignment.LEADING)
						.addComponent(textFieldEstado, Alignment.LEADING)
						.addComponent(textFieldLogradouro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
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
						.addComponent(textFieldNumeroDaCasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmeroDaCasa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblComplement))
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
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelEndereco.setLayout(gl_panelEndereco);
		
		JLabel lblNome = new JLabel("Nome");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		
		formattedTextFieldCPF = new JFormattedTextField();
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		
		textFieldEnfermidade = new JFormattedTextField();
		textFieldEnfermidade.setColumns(10);
		
		JLabel lblEnfermidade = new JLabel("Enfermidade");
		
		JLabel lblPlanoDeSade = new JLabel("Plano de Sa\u00FAde");
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo");
		
		textFieldDataDeNascimento = new JFormattedTextField();
		textFieldDataDeNascimento.setColumns(10);
		
		textFieldPlanoDeSaude = new JTextField();
		textFieldPlanoDeSaude.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		
		textFieldRG = new JFormattedTextField();
		textFieldRG.setColumns(10);
		
		comboBoxSanguineo = new JComboBox<String>();
		comboBoxSanguineo.setModel(new DefaultComboBoxModel<String>(new String[] {"A-", "A+", "AB-", "AB+", "B-", "B+", "O+", "O-"}));
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		textFieldTelefone = new JFormattedTextField();
		textFieldTelefone.setColumns(10);
		GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
		gl_panelDadosPessoais.setHorizontalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNome)
						.addComponent(lblRg)
						.addComponent(lblCpf)
						.addComponent(lblDataDeNascimento)
						.addComponent(lblEnfermidade)
						.addComponent(lblPlanoDeSade)
						.addComponent(lblEmail)
						.addComponent(lblTelefone)
						.addComponent(lblTipoSanguineo))
					.addGap(18)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxSanguineo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textFieldTelefone)
						.addComponent(textFieldEmail)
						.addComponent(textFieldPlanoDeSaude)
						.addComponent(textFieldEnfermidade)
						.addComponent(textFieldDataDeNascimento)
						.addComponent(textFieldRG)
						.addComponent(formattedTextFieldCPF)
						.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelDadosPessoais.setVerticalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(formattedTextFieldCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCpf))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldRG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRg))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDataDeNascimento))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEnfermidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnfermidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPlanoDeSaude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlanoDeSade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxSanguineo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoSanguineo))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
		getContentPane().setLayout(groupLayout);

		controller = new ProfessorController(InternalFrameCadastroProfessor.this);
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public JFormattedTextField getTextFieldEnfermidade() {
		return textFieldEnfermidade;
	}

	public JFormattedTextField getTextFieldDataDeNascimento() {
		return textFieldDataDeNascimento;
	}

	public JTextField getTextFieldPlanoDeSaude() {
		return textFieldPlanoDeSaude;
	}

	public JFormattedTextField getTextFieldRG() {
		return textFieldRG;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public JFormattedTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}

	public JTextField getTextFieldLogradouro() {
		return textFieldLogradouro;
	}

	public JTextField getTextFieldNumeroDaCasa() {
		return textFieldNumeroDaCasa;
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

	public JTextField getTextField() {
		return textFieldSalario;
	}

	public JFormattedTextField getFormattedTextFieldCPF() {
		return formattedTextFieldCPF;
	}

	public JComboBox<String> getComboBoxSanguineo() {
		return comboBoxSanguineo;
	}

	public JComboBox<String> getComboBoxFuncao() {
		return comboBoxFuncao;
	}

	public JComboBox<String> getComboBoxModalidade() {
		return comboBoxModalidade;
	}

	public JTextField getTextFieldSalario() {
		return textFieldSalario;
	}
	
}
