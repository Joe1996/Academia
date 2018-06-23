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

public class FrameGerarRelatorioAula extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNomeAula;
	private JTextField txtHoraTreino;
	private JTextField txtData;
	private JTextField txtProfessor;
	private JTextField txtAtividadeRealizada;
	private JTextField txtAlunosPresentes;
	private JTextField txtConvidadosTreino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					FrameGerarRelatorioAula frame = new FrameGerarRelatorioAula();
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
	public FrameGerarRelatorioAula() {
		setTitle("Gerar Relat\u00F3rio de Aula");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 575);
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
				RowSpec.decode("default:grow"),
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
		
		JLabel lblNomeAula = new JLabel("Nome da Aula:");
		contentPane.add(lblNomeAula, "2, 2");
		
		txtNomeAula = new JTextField();
		contentPane.add(txtNomeAula, "4, 2, 19, 1, fill, default");
		txtNomeAula.setColumns(10);
		
		JLabel lblHoraTreino = new JLabel("Hora do Treino:");
		contentPane.add(lblHoraTreino, "2, 4");
		
		txtHoraTreino = new JTextField();
		contentPane.add(txtHoraTreino, "4, 4, 19, 1, fill, default");
		txtHoraTreino.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		contentPane.add(lblData, "2, 6");
		
		txtData = new JTextField();
		contentPane.add(txtData, "4, 6, 19, 1, fill, default");
		txtData.setColumns(10);
		
		JLabel lblProfessor = new JLabel("Professor:");
		contentPane.add(lblProfessor, "2, 8");
		
		txtProfessor = new JTextField();
		contentPane.add(txtProfessor, "4, 8, 19, 1, fill, default");
		txtProfessor.setColumns(10);
		
		JLabel lblAtividadeRealizada = new JLabel("Atividade Realizada:");
		contentPane.add(lblAtividadeRealizada, "2, 10");
		
		txtAtividadeRealizada = new JTextField();
		contentPane.add(txtAtividadeRealizada, "4, 10, 19, 1, fill, default");
		txtAtividadeRealizada.setColumns(10);
		
		JLabel lblAlunosPresentes = new JLabel("Alunos Presentes:");
		contentPane.add(lblAlunosPresentes, "2, 12");
		
		txtAlunosPresentes = new JTextField();
		contentPane.add(txtAlunosPresentes, "4, 12, 19, 1, fill, default");
		txtAlunosPresentes.setColumns(10);
		
		JLabel lblConvidadosTreino = new JLabel("Convidados de Treino:");
		contentPane.add(lblConvidadosTreino, "2, 14");
		
		txtConvidadosTreino = new JTextField();
		contentPane.add(txtConvidadosTreino, "4, 14, 19, 1, fill, default");
		txtConvidadosTreino.setColumns(10);
		
		JButton btnGerarRelatorio = new JButton("Gerar Relat\u00F3rio");
		contentPane.add(btnGerarRelatorio, "22, 16");
		
		JTextArea textAreaRelatorio = new JTextArea();
		contentPane.add(textAreaRelatorio, "2, 20, 21, 11, fill, fill");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "22, 32");
	}

}
