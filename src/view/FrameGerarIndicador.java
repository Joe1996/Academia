package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class FrameGerarIndicador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtAlunosIngressaram;
	private JTextField txtAlunosSairam;
	private JTextField txtSaldo;
	private JTextField txtFluxoMatriculasLuta;
	private JTextField txtFluxoContas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					FrameGerarIndicador frame = new FrameGerarIndicador();
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
	public FrameGerarIndicador() {
		setTitle("Gerar Indicador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblFluxoMatriculas = new JLabel("Fluxo de Matr\u00EDculas:");
		contentPane.add(lblFluxoMatriculas, "2, 2");
		
		JLabel lblAlunosIngressaram = new JLabel("Alunos que Ingressaram:");
		contentPane.add(lblAlunosIngressaram, "2, 4, right, default");
		
		txtAlunosIngressaram = new JTextField();
		contentPane.add(txtAlunosIngressaram, "6, 4, fill, default");
		txtAlunosIngressaram.setColumns(10);
		
		JLabel lblAlunosSairam = new JLabel("Alunos que Sa\u00EDram:");
		contentPane.add(lblAlunosSairam, "2, 6, right, default");
		
		txtAlunosSairam = new JTextField();
		contentPane.add(txtAlunosSairam, "6, 6, fill, default");
		txtAlunosSairam.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		contentPane.add(lblSaldo, "2, 8, right, default");
		
		txtSaldo = new JTextField();
		contentPane.add(txtSaldo, "6, 8, fill, default");
		txtSaldo.setColumns(10);
		
		JLabel lblFluxoMatriculasLuta = new JLabel("Fluxo de Matr\u00EDculas por Luta:");
		contentPane.add(lblFluxoMatriculasLuta, "2, 10");
		
		txtFluxoMatriculasLuta = new JTextField();
		contentPane.add(txtFluxoMatriculasLuta, "6, 10, fill, default");
		txtFluxoMatriculasLuta.setColumns(10);
		
		JLabel lblFluxoContas = new JLabel("Fluxo de Contas:");
		contentPane.add(lblFluxoContas, "2, 12");
		
		txtFluxoContas = new JTextField();
		contentPane.add(txtFluxoContas, "6, 12, fill, default");
		txtFluxoContas.setColumns(10);
		
		JButton btnGerarIndicadores = new JButton("Gerar Indicadores");
		contentPane.add(btnGerarIndicadores, "6, 14");
		
		JTextArea textAreaIndicador = new JTextArea();
		contentPane.add(textAreaIndicador, "2, 16, 5, 1, fill, fill");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "6, 18");
	}

}
