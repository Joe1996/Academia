package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.Color;

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
	private JTextField textFieldNomeEmergencia;
	private JFormattedTextField textFieldTelefoneEmergencia;
	private JTextField textFieldLogradouro;
	private JTextField textFieldNumeroDaCasa;
	private JTextField textFieldComplemento;
	private JTextField textFieldBairro;
	private JFormattedTextField textFieldCEP;
	private JTextField textFieldCidade;
	private JTextField textFieldEstado;
	private JTextField textField;
	private JFormattedTextField formattedTextFieldCPF;

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
		setBounds(100, 100, 884, 431);
		
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelContato = new JPanel();
		panelContato.setBorder(new TitledBorder(null, "Contato", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnCadastrarDigital = new JButton("Cadastrar Digital");
		btnCadastrarDigital.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrarDigital.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeDigital1.png"));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		
		JButton btnLimparcampos = new JButton("LimparCampos");
		btnLimparcampos.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\eraser.png"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\exit.png"));
		
		JPanel panelEmprego = new JPanel();
		panelEmprego.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Emprego", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Modalidade");
		
		JLabel label_1 = new JLabel("Fun\u00E7\u00E3o");
		
		JLabel label_2 = new JLabel("Sal\u00E1rio");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JComboBox list = new JComboBox();
		
		JComboBox list_1 = new JComboBox();
		GroupLayout gl_panelEmprego = new GroupLayout(panelEmprego);
		gl_panelEmprego.setHorizontalGroup(
			gl_panelEmprego.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEmprego.createSequentialGroup()
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEmprego.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_panelEmprego.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_1)
								.addComponent(label_2)))
						.addGroup(gl_panelEmprego.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(list, 0, 149, Short.MAX_VALUE)
						.addComponent(list_1, 0, 149, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelEmprego.setVerticalGroup(
			gl_panelEmprego.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEmprego.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelEmprego.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(list_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelEmprego.setLayout(gl_panelEmprego);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelEmprego, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnLimparcampos, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCadastrarDigital)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelContato, 0, 0, Short.MAX_VALUE)))
					.addGap(180))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelContato, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(panelEmprego, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnCadastrarDigital, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnSalvar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnLimparcampos)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnSair))
							.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(16, Short.MAX_VALUE))
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
					.addContainerGap()
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEstado)
						.addComponent(lblCidade)
						.addComponent(lblCep)
						.addComponent(lblBairro)
						.addComponent(lblLogradouro)
						.addComponent(lblNmeroDaCasa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEndereco.createSequentialGroup()
							.addComponent(textFieldNumeroDaCasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblComplement)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldComplemento, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
						.addComponent(textFieldBairro, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(textFieldEstado, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(textFieldLogradouro, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelEndereco.setVerticalGroup(
			gl_panelEndereco.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEndereco.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogradouro)
						.addComponent(textFieldLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroDaCasa)
						.addComponent(textFieldNumeroDaCasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblComplement)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(textFieldBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCep)
						.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(textFieldCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstado)
						.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panelEndereco.setLayout(gl_panelEndereco);
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblNomeParaEmergncia = new JLabel("Nome para Emerg\u00EAncia");
		
		JLabel lblTelefoneParaEmergncia = new JLabel("Telefone para Emerg\u00EAncia");
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		textFieldTelefone = new JFormattedTextField();
		textFieldTelefone.setColumns(10);
		
		textFieldNomeEmergencia = new JTextField();
		textFieldNomeEmergencia.setColumns(10);
		
		textFieldTelefoneEmergencia = new JFormattedTextField();
		textFieldTelefoneEmergencia.setColumns(10);
		GroupLayout gl_panelContato = new GroupLayout(panelContato);
		gl_panelContato.setHorizontalGroup(
			gl_panelContato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContato.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelContato.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTelefoneParaEmergncia)
						.addComponent(lblEmail)
						.addComponent(lblNomeParaEmergncia)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldEmail, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addComponent(textFieldNomeEmergencia, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addComponent(textFieldTelefoneEmergencia, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addComponent(textFieldTelefone, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelContato.setVerticalGroup(
			gl_panelContato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContato.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeParaEmergncia)
						.addComponent(textFieldNomeEmergencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelContato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefoneParaEmergncia)
						.addComponent(textFieldTelefoneEmergencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panelContato.setLayout(gl_panelContato);
		
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
		
		JComboBox listTipoSanguineo = new JComboBox();
		listTipoSanguineo.setModel(new DefaultComboBoxModel(new String[] {"A-", "A+", "AB-", "AB+", "B-", "B+", "O+", "O-"}));
		GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
		gl_panelDadosPessoais.setHorizontalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDadosPessoais.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCpf)
								.addComponent(lblEnfermidade)
								.addComponent(lblPlanoDeSade)
								.addComponent(lblNome))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
								.addComponent(textFieldPlanoDeSaude, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
								.addGroup(gl_panelDadosPessoais.createSequentialGroup()
									.addComponent(formattedTextFieldCPF, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRg)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldRG, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
								.addComponent(textFieldNome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
								.addComponent(textFieldEnfermidade, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
						.addGroup(gl_panelDadosPessoais.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblDataDeNascimento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldDataDeNascimento, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTipoSanguineo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(listTipoSanguineo, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		gl_panelDadosPessoais.setVerticalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(formattedTextFieldCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRg)
						.addComponent(textFieldRG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(listTipoSanguineo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoSanguineo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnfermidade)
						.addComponent(textFieldEnfermidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlanoDeSade)
						.addComponent(textFieldPlanoDeSaude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
		getContentPane().setLayout(groupLayout);

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

	public JTextField getTextFieldNomeEmergencia() {
		return textFieldNomeEmergencia;
	}

	public JFormattedTextField getTextFieldTelefoneEmergencia() {
		return textFieldTelefoneEmergencia;
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
		return textField;
	}

	public JFormattedTextField getFormattedTextFieldCPF() {
		return formattedTextFieldCPF;
	}
	
}
