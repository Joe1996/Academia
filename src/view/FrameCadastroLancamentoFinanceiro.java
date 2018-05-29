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

public class FrameCadastroLancamentoFinanceiro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtTipoLancamento;
	private JTextField txtDataEmissao;
	private JTextField txtTipoPessoa;
	private JTextField txtDescricao;
	private JTextField txtTipoPagamento;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroLancamentoFinanceiro frame = new FrameCadastroLancamentoFinanceiro();
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
	public FrameCadastroLancamentoFinanceiro() {
		setTitle("Cadastrar Lan\u00E7amentos Financeiros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 275);
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblTipoLancamento = new JLabel("Tipo do Lan\u00E7amento:");
		contentPane.add(lblTipoLancamento, "2, 2");
		
		txtTipoLancamento = new JTextField();
		contentPane.add(txtTipoLancamento, "4, 2, 13, 1, fill, default");
		txtTipoLancamento.setColumns(10);
		
		JLabel lblDataEmissao = new JLabel("Data de Emiss\u00E3o:");
		contentPane.add(lblDataEmissao, "2, 4");
		
		txtDataEmissao = new JTextField();
		contentPane.add(txtDataEmissao, "4, 4, 13, 1, fill, default");
		txtDataEmissao.setColumns(10);
		
		JLabel lblTipoPessoa = new JLabel("Tipo de Pessoa:");
		contentPane.add(lblTipoPessoa, "2, 6");
		
		txtTipoPessoa = new JTextField();
		contentPane.add(txtTipoPessoa, "4, 6, 13, 1, fill, default");
		txtTipoPessoa.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		contentPane.add(lblDescricao, "2, 8");
		
		txtDescricao = new JTextField();
		contentPane.add(txtDescricao, "4, 8, 13, 1, fill, default");
		txtDescricao.setColumns(10);
		
		JLabel lblTipoPagamento = new JLabel("Tipo do Pagamento:");
		contentPane.add(lblTipoPagamento, "2, 10");
		
		txtTipoPagamento = new JTextField();
		contentPane.add(txtTipoPagamento, "4, 10, 13, 1, fill, default");
		txtTipoPagamento.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		contentPane.add(lblValor, "2, 12");
		
		txtValor = new JTextField();
		contentPane.add(txtValor, "4, 12, 13, 1, fill, default");
		txtValor.setColumns(10);
		
		JButton btnCadastrarLancamentos = new JButton("Cadastrar Lan\u00E7amentos");
		contentPane.add(btnCadastrarLancamentos, "14, 14");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "16, 14");
	}

}
