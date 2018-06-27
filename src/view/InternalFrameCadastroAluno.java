package view;

import java.awt.Dimension;
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
import javax.swing.border.TitledBorder;

import controller.AlunoController;
import util.BusinessException;

public class InternalFrameCadastroAluno extends JInternalFrame {
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
	private JFormattedTextField formattedTextFieldCPF;
	private JComboBox<String> comboBoxSanguineo;
	private JComboBox<String> comboBoxSexo;
	private AlunoController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameCadastroAluno frame = new InternalFrameCadastroAluno();
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
	public InternalFrameCadastroAluno() {
		
		setTitle("Cadastrar Aluno");
		setClosable(true);
		setBounds(100, 100, 590, 636);
		
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setPreferredSize(new Dimension(60, 25));
		btnSalvar.setMinimumSize(new Dimension(60, 25));
		btnSalvar.setMaximumSize(new Dimension(60, 25));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.insert();
				} catch (BusinessException be) {
					JOptionPane.showMessageDialog(InternalFrameCadastroAluno.this, be.getMessage());
				}
			}
		});
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelEndereco, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
								.addComponent(panelDadosPessoais, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelEndereco, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addContainerGap())
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
					.addGap(41)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNmeroDaCasa)
						.addComponent(lblLogradouro)
						.addComponent(lblComplement)
						.addComponent(lblBairro)
						.addComponent(lblCep)
						.addComponent(lblCidade)
						.addComponent(lblEstado))
					.addGap(18)
					.addGroup(gl_panelEndereco.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldEstado)
						.addComponent(textFieldCidade, Alignment.TRAILING)
						.addComponent(textFieldCEP, Alignment.TRAILING)
						.addComponent(textFieldBairro, Alignment.TRAILING)
						.addComponent(textFieldComplemento)
						.addComponent(textFieldNumeroDaCasa)
						.addComponent(textFieldLogradouro, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
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
					.addGap(74))
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
		comboBoxSanguineo.setMaximumSize(new Dimension(28, 20));
		comboBoxSanguineo.setModel(new DefaultComboBoxModel<String>(new String[] {"A-", "A+", "AB-", "AB+", "B-", "B+", "O+", "O-"}));
		
		JLabel lblSexo = new JLabel("Sexo");
		
		comboBoxSexo = new JComboBox<String>();
		comboBoxSexo.setMaximumSize(new Dimension(28, 20));
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] {"Masculino", "Feminino"}));
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		textFieldTelefone = new JFormattedTextField();
		textFieldTelefone.setColumns(10);
		GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
		gl_panelDadosPessoais.setHorizontalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEnfermidade)
						.addComponent(lblDataDeNascimento)
						.addComponent(lblPlanoDeSade)
						.addComponent(lblEmail)
						.addComponent(lblTelefone)
						.addComponent(lblTipoSanguineo)
						.addComponent(lblSexo)
						.addComponent(lblRg)
						.addComponent(lblCpf)
						.addComponent(lblNome))
					.addGap(18)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
						.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(formattedTextFieldCPF, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(comboBoxSanguineo, 0, 372, Short.MAX_VALUE)
						.addComponent(textFieldTelefone, 350, 372, Short.MAX_VALUE)
						.addComponent(textFieldEmail, 350, 372, Short.MAX_VALUE)
						.addComponent(textFieldPlanoDeSaude, 350, 372, Short.MAX_VALUE)
						.addComponent(textFieldEnfermidade, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(textFieldDataDeNascimento, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(comboBoxSexo, 0, 372, Short.MAX_VALUE)
						.addComponent(textFieldRG, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
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
					.addGap(9)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPlanoDeSaude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlanoDeSade))
					.addGap(8)
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSexo))
					.addContainerGap())
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
		getContentPane().setLayout(groupLayout);
		
		controller = new AlunoController(this);
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

	public JFormattedTextField getFormattedTextFieldCPF() {
		return formattedTextFieldCPF;
	}

	public JComboBox<String> getComboBoxSanguineo() {
		return comboBoxSanguineo;
	}

	public JComboBox<String> getComboBoxSexo() {
		return comboBoxSexo;
	}
	
}
