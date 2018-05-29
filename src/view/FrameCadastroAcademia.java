package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FrameCadastroAcademia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNomeFantasia;
	private JTextField txtRazaoSocial;
	private JTextField txtCnpj;
	private JTextField txtInscricaoMunicipal;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtEmail;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroAcademia frame = new FrameCadastroAcademia();
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
	public FrameCadastroAcademia() {
		setTitle("Cadastro de Academia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 480);
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		contentPane.add(lblNomeFantasia, "2, 2");
		
		txtNomeFantasia = new JTextField();
		contentPane.add(txtNomeFantasia, "4, 2, 5, 1, fill, top");
		txtNomeFantasia.setColumns(10);
		
		JLabel lblRazaoSocial = new JLabel("Raz\u00E3o Social:");
		contentPane.add(lblRazaoSocial, "2, 4");
		
		txtRazaoSocial = new JTextField();
		contentPane.add(txtRazaoSocial, "4, 4, 5, 1, fill, default");
		txtRazaoSocial.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		contentPane.add(lblCnpj, "2, 6");
		
		txtCnpj = new JTextField();
		contentPane.add(txtCnpj, "4, 6, 5, 1, fill, default");
		txtCnpj.setColumns(10);
		
		JLabel lblInscricaoMunicipal = new JLabel("Inscri\u00E7\u00E3o Municipal:");
		contentPane.add(lblInscricaoMunicipal, "2, 8");
		
		txtInscricaoMunicipal = new JTextField();
		contentPane.add(txtInscricaoMunicipal, "4, 8, 5, 1, fill, default");
		txtInscricaoMunicipal.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		contentPane.add(lblEndereco, "2, 10");
		
		txtEndereco = new JTextField();
		contentPane.add(txtEndereco, "4, 10, 5, 1, fill, default");
		txtEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		contentPane.add(lblNumero, "2, 12");
		
		txtNumero = new JTextField();
		contentPane.add(txtNumero, "4, 12, 5, 1, fill, default");
		txtNumero.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		contentPane.add(lblComplemento, "2, 14");
		
		txtComplemento = new JTextField();
		contentPane.add(txtComplemento, "4, 14, 5, 1, fill, default");
		txtComplemento.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "2, 16");
		
		txtBairro = new JTextField();
		contentPane.add(txtBairro, "4, 16, 5, 1, fill, default");
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		contentPane.add(lblCep, "2, 18");
		
		txtCep = new JTextField();
		contentPane.add(txtCep, "4, 18, 5, 1, fill, default");
		txtCep.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		contentPane.add(lblEstado, "2, 20");
		
		txtEstado = new JTextField();
		contentPane.add(txtEstado, "4, 20, 5, 1, fill, default");
		txtEstado.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "2, 22");
		
		txtCidade = new JTextField();
		contentPane.add(txtCidade, "4, 22, 5, 1, fill, default");
		txtCidade.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		contentPane.add(lblEmail, "2, 24");
		
		txtEmail = new JTextField();
		contentPane.add(txtEmail, "4, 24, 5, 1, fill, default");
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "2, 26");
		
		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "4, 26, 5, 1, fill, default");
		txtTelefone.setColumns(10);
		
		JButton btnCadastrarAcademia = new JButton("Cadastrar Academia");
		contentPane.add(btnCadastrarAcademia, "6, 28");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "8, 28");
	}

}
