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
	private JTextField textFieldNomeEmergencia;
	private JFormattedTextField textFieldTelefoneEmergencia;
	private JTextField textFieldLogradouro;
	private JTextField textFieldNumeroDaCasa;
	private JTextField textFieldComplemento;
	private JTextField textFieldBairro;
	private JFormattedTextField textFieldCEP;
	private JTextField textFieldCidade;
	private JTextField textFieldEstado;

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
		setBounds(100, 100, 901, 468);
		
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelContato = new JPanel();
		panelContato.setBorder(new TitledBorder(null, "Contato", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnCadastrarDigital = new JButton("Cadastrar Digital");
		btnCadastrarDigital.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrarDigital.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeDigital.png"));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		
		JButton btnLimparcampos = new JButton("LimparCampos");
		btnLimparcampos.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\eraser.png"));
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\question.png"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\exit.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelEndereco, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCadastrarDigital)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(btnLimparcampos, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(btnAjuda, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
						.addComponent(panelContato, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelContato, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLimparcampos)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair)
							.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
							.addComponent(btnAjuda))
						.addComponent(panelEndereco, 0, 0, Short.MAX_VALUE)
						.addComponent(btnCadastrarDigital, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
					.addContainerGap(25, Short.MAX_VALUE))
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
						.addComponent(textFieldLogradouro, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addGroup(gl_panelEndereco.createSequentialGroup()
							.addComponent(textFieldNumeroDaCasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblComplement)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldComplemento, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
						.addComponent(textFieldBairro, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(textFieldEstado, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
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
					.addContainerGap(92, Short.MAX_VALUE))
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
		
		JFormattedTextField formattedTextFieldCPF = new JFormattedTextField();
		
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
		
		JLabel lblSexo = new JLabel("Sexo");
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
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
								.addComponent(lblNome)
								.addComponent(lblSexo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxSexo, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING)
									.addComponent(textFieldPlanoDeSaude, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
									.addGroup(gl_panelDadosPessoais.createSequentialGroup()
										.addComponent(formattedTextFieldCPF, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblRg)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textFieldRG, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
									.addComponent(textFieldNome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
									.addComponent(textFieldEnfermidade, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))))
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
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo)
						.addComponent(comboBoxSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
		getContentPane().setLayout(groupLayout);

	}
}
