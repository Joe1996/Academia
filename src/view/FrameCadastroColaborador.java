package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCadastroColaborador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtIdade;
	private JTextField txtEndereco;
	private JTextField txtNumeroCasa;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtDoencas;
	private JTextField txtPlanoSaude;
	private JTextField txtTipoSanguineo;
	private JTextField txtFuncao;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroColaborador frame = new FrameCadastroColaborador();
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
	public FrameCadastroColaborador() {
		setTitle("Cadastro de Colaborador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "2, 2");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "4, 2, 15, 1, fill, default");
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		contentPane.add(lblCpf, "2, 4");
		
		txtCpf = new JTextField();
		contentPane.add(txtCpf, "4, 4, 15, 1, fill, default");
		txtCpf.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		contentPane.add(lblRg, "2, 6");
		
		txtRg = new JTextField();
		contentPane.add(txtRg, "4, 6, 15, 1, fill, default");
		txtRg.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		contentPane.add(lblIdade, "2, 8");
		
		txtIdade = new JTextField();
		contentPane.add(txtIdade, "4, 8, 15, 1, fill, default");
		txtIdade.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		contentPane.add(lblEndereco, "2, 10");
		
		txtEndereco = new JTextField();
		contentPane.add(txtEndereco, "4, 10, 15, 1, fill, default");
		txtEndereco.setColumns(10);
		
		JLabel lblNumeroCasa = new JLabel("N\u00FAmero da Casa:");
		contentPane.add(lblNumeroCasa, "2, 12");
		
		txtNumeroCasa = new JTextField();
		contentPane.add(txtNumeroCasa, "4, 12, 15, 1, fill, default");
		txtNumeroCasa.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		contentPane.add(lblComplemento, "2, 14");
		
		txtComplemento = new JTextField();
		contentPane.add(txtComplemento, "4, 14, 15, 1, fill, default");
		txtComplemento.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "2, 16");
		
		txtBairro = new JTextField();
		contentPane.add(txtBairro, "4, 16, 15, 1, fill, default");
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		contentPane.add(lblCep, "2, 18");
		
		txtCep = new JTextField();
		contentPane.add(txtCep, "4, 18, 15, 1, fill, default");
		txtCep.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		contentPane.add(lblEstado, "2, 20");
		
		txtEstado = new JTextField();
		contentPane.add(txtEstado, "4, 20, 15, 1, fill, default");
		txtEstado.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "2, 22");
		
		txtCidade = new JTextField();
		contentPane.add(txtCidade, "4, 22, 15, 1, fill, default");
		txtCidade.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		contentPane.add(lblEmail, "2, 24");
		
		txtEmail = new JTextField();
		contentPane.add(txtEmail, "4, 24, 15, 1, fill, default");
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "2, 26");
		
		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "4, 26, 15, 1, fill, default");
		txtTelefone.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		contentPane.add(lblDataNascimento, "2, 28");
		
		txtDataNascimento = new JTextField();
		contentPane.add(txtDataNascimento, "4, 28, 15, 1, fill, default");
		txtDataNascimento.setColumns(10);
		
		JLabel lblDoencas = new JLabel("Doen\u00E7as:");
		contentPane.add(lblDoencas, "2, 30");
		
		txtDoencas = new JTextField();
		contentPane.add(txtDoencas, "4, 30, 15, 1, fill, default");
		txtDoencas.setColumns(10);
		
		JLabel lblPlanoSaude = new JLabel("Plano de Sa\u00FAde:");
		contentPane.add(lblPlanoSaude, "2, 32");
		
		txtPlanoSaude = new JTextField();
		contentPane.add(txtPlanoSaude, "4, 32, 15, 1, fill, default");
		txtPlanoSaude.setColumns(10);
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo:");
		contentPane.add(lblTipoSanguineo, "2, 34");
		
		txtTipoSanguineo = new JTextField();
		contentPane.add(txtTipoSanguineo, "4, 34, 15, 1, fill, default");
		txtTipoSanguineo.setColumns(10);
		
		JLabel lblFuncao = new JLabel("Fun\u00E7\u00E3o:");
		contentPane.add(lblFuncao, "2, 36");
		
		txtFuncao = new JTextField();
		contentPane.add(txtFuncao, "4, 36, 15, 1, fill, default");
		txtFuncao.setColumns(10);
		
		JLabel lblSalario = new JLabel("Sal\u00E1rio:");
		contentPane.add(lblSalario, "2, 38");
		
		txtSalario = new JTextField();
		contentPane.add(txtSalario, "4, 38, 15, 1, fill, default");
		txtSalario.setColumns(10);
		
		JButton btnCadastrarColaborador = new JButton("Cadastrar Colaborador");
		contentPane.add(btnCadastrarColaborador, "16, 40");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "18, 40");
	}

}
