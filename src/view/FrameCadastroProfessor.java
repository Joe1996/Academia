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

public class FrameCadastroProfessor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtDataNascimento;
	private JTextField txtRua;
	private JTextField txtNumeroCasa;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtDoencas;
	private JTextField txtPlanoSaude;
	private JTextField txtTipoSanguineo;
	private JTextField txtGraduacao;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroProfessor frame = new FrameCadastroProfessor();
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
	public FrameCadastroProfessor() {
		setTitle("Cadastro de Professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 655);
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
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
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
		contentPane.add(txtNome, "4, 2, 23, 1, fill, default");
		txtNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		contentPane.add(lblRg, "2, 4");
		
		txtRg = new JTextField();
		contentPane.add(txtRg, "4, 4, 23, 1, fill, default");
		txtRg.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		contentPane.add(lblEmail, "2, 6");
		
		txtEmail = new JTextField();
		contentPane.add(txtEmail, "4, 6, 23, 1, fill, default");
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "2, 8");
		
		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "4, 8, 23, 1, fill, default");
		txtTelefone.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		contentPane.add(lblCpf, "2, 10");
		
		txtCpf = new JTextField();
		contentPane.add(txtCpf, "4, 10, 23, 1, fill, default");
		txtCpf.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		contentPane.add(lblDataNascimento, "2, 12");
		
		txtDataNascimento = new JTextField();
		contentPane.add(txtDataNascimento, "4, 12, 23, 1, fill, default");
		txtDataNascimento.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua:");
		contentPane.add(lblRua, "2, 14");
		
		txtRua = new JTextField();
		contentPane.add(txtRua, "4, 14, 23, 1, fill, default");
		txtRua.setColumns(10);
		
		JLabel lblNumeroCasa = new JLabel("N\u00FAmero da Casa:");
		contentPane.add(lblNumeroCasa, "2, 16");
		
		txtNumeroCasa = new JTextField();
		contentPane.add(txtNumeroCasa, "4, 16, 23, 1, fill, default");
		txtNumeroCasa.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		contentPane.add(lblComplemento, "2, 18");
		
		txtComplemento = new JTextField();
		contentPane.add(txtComplemento, "4, 18, 23, 1, fill, default");
		txtComplemento.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "2, 20");
		
		txtBairro = new JTextField();
		contentPane.add(txtBairro, "4, 20, 23, 1, fill, default");
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		contentPane.add(lblCep, "2, 22");
		
		txtCep = new JTextField();
		contentPane.add(txtCep, "4, 22, 23, 1, fill, default");
		txtCep.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		contentPane.add(lblEstado, "2, 24");
		
		txtEstado = new JTextField();
		contentPane.add(txtEstado, "4, 24, 23, 1, fill, default");
		txtEstado.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "2, 26");
		
		txtCidade = new JTextField();
		contentPane.add(txtCidade, "4, 26, 23, 1, fill, default");
		txtCidade.setColumns(10);
		
		JLabel lblDoencas = new JLabel("Doen\u00E7as:");
		contentPane.add(lblDoencas, "2, 28");
		
		txtDoencas = new JTextField();
		contentPane.add(txtDoencas, "4, 28, 23, 1, fill, default");
		txtDoencas.setColumns(10);
		
		JLabel lblPlanoSaude = new JLabel("Plano de Sa\u00FAde:");
		contentPane.add(lblPlanoSaude, "2, 30");
		
		txtPlanoSaude = new JTextField();
		contentPane.add(txtPlanoSaude, "4, 30, 23, 1, fill, default");
		txtPlanoSaude.setColumns(10);
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo:");
		contentPane.add(lblTipoSanguineo, "2, 32");
		
		txtTipoSanguineo = new JTextField();
		contentPane.add(txtTipoSanguineo, "4, 32, 23, 1, fill, default");
		txtTipoSanguineo.setColumns(10);
		
		JLabel lblGraduacao = new JLabel("Gradua\u00E7\u00E3o:");
		contentPane.add(lblGraduacao, "2, 34");
		
		txtGraduacao = new JTextField();
		contentPane.add(txtGraduacao, "4, 34, 23, 1, fill, default");
		txtGraduacao.setColumns(10);
		
		JLabel lblSalario = new JLabel("Sal\u00E1rio:");
		contentPane.add(lblSalario, "2, 36");
		
		txtSalario = new JTextField();
		contentPane.add(txtSalario, "4, 36, 23, 1, fill, default");
		txtSalario.setColumns(10);
		
		JButton btnCadastrarProfessor = new JButton("Cadastrar Professor");
		contentPane.add(btnCadastrarProfessor, "24, 40");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "26, 40");
	}

}
