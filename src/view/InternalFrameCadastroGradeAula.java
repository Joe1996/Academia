package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class InternalFrameCadastroGradeAula extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameCadastroGradeAula frame = new InternalFrameCadastroGradeAula();
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
	public InternalFrameCadastroGradeAula() {
		setClosable(true);
		setTitle("Grade de Aula");
		setBounds(100, 100, 904, 481);
		
		JPanel panelEditarHorario = new JPanel();
		panelEditarHorario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Editar Hor\u00E1rio", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\checked.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelEditarHorario, GroupLayout.PREFERRED_SIZE, 872, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(787, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(panelEditarHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalvar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblHorario = new JLabel("Hor\u00E1rio");
		
		JLabel label10h = new JLabel("10:00");
		
		JLabel label12h = new JLabel("12:00");
		
		JLabel label16h = new JLabel("16:00");
		
		JLabel label1630h = new JLabel("16:30");
		
		JLabel label18h = new JLabel("18:00");
		
		JLabel label1930h = new JLabel("19:30");
		
		JLabel label2030h = new JLabel("20:30");
		
		JLabel label2230h = new JLabel("22:30");
		
		JLabel lblTerafeira = new JLabel("Quarta-Feira");
		lblTerafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxTerca9h = new JComboBox();
		
		JComboBox comboBoxTerca10h = new JComboBox();
		
		JComboBox comboBoxTerca12h = new JComboBox();
		
		JComboBox comboBoxTerca16h = new JComboBox();
		
		JComboBox comboBoxTerca1630h = new JComboBox();
		
		JComboBox comboBoxTerca18 = new JComboBox();
		
		JComboBox comboBoxTerca1930h = new JComboBox();
		
		JComboBox comboBoxTerca2030h = new JComboBox();
		
		JComboBox comboBoxTerca2230h = new JComboBox();
		
		JLabel label9h = new JLabel("09:00");
		
		JLabel lblQuartafeira = new JLabel("Quinta-Feira");
		lblQuartafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxQuarta9h = new JComboBox();
		
		JComboBox comboBoxQuarta10h = new JComboBox();
		
		JComboBox comboBoxQuarta12h = new JComboBox();
		
		JComboBox comboBoxQuarta16h = new JComboBox();
		
		JComboBox comboBoxQuarta1630h = new JComboBox();
		
		JComboBox comboBoxQuarta18 = new JComboBox();
		
		JComboBox comboBoxQuarta1930h = new JComboBox();
		
		JComboBox comboBoxQuarta2030h = new JComboBox();
		
		JComboBox comboBoxQuarta2230h = new JComboBox();
		
		JLabel lblQuintafeira = new JLabel("Sexta-Feira");
		lblQuintafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxQuinta9h = new JComboBox();
		
		JComboBox comboBoxQuinta10h = new JComboBox();
		
		JComboBox comboBoxQuinta12h = new JComboBox();
		
		JComboBox comboBoxQuinta16h = new JComboBox();
		
		JComboBox comboBoxQuinta1630h = new JComboBox();
		
		JComboBox comboBoxQuinta18h = new JComboBox();
		
		JComboBox comboBoxQuinta1930h = new JComboBox();
		
		JComboBox comboBoxQuinta2030h = new JComboBox();
		
		JComboBox comboBoxQuinta2230h = new JComboBox();
		
		JLabel lblSegundafeira = new JLabel("Ter\u00E7a-Feira");
		lblSegundafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxSegunda9h = new JComboBox();
		
		JComboBox comboBoxSegunda10h = new JComboBox();
		
		JComboBox comboBoxSegunda12h = new JComboBox();
		
		JComboBox comboBoxSegunda16h = new JComboBox();
		
		JComboBox comboBoxSegunda1630h = new JComboBox();
		
		JComboBox comboBoxSegunda18h = new JComboBox();
		
		JComboBox comboBoxSegunda1930h = new JComboBox();
		
		JComboBox comboBoxSegunda2030h = new JComboBox();
		
		JLabel lblSextafeira = new JLabel("S\u00E1bado");
		lblSextafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxSexta9h = new JComboBox();
		
		JComboBox comboBoxSexta1630h = new JComboBox();
		
		JComboBox comboBoxSexta18h = new JComboBox();
		
		JComboBox comboBoxSexta1930h = new JComboBox();
		
		JComboBox comboBoxSexta2030h = new JComboBox();
		
		JComboBox comboBoxSexta2230h = new JComboBox();
		
		JComboBox comboBoxSabado9h = new JComboBox();
		
		JComboBox comboBoxSabado10h = new JComboBox();
		
		JLabel label_9 = new JLabel("Segunda-Feira");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBoxSexta10h = new JComboBox();
		
		JComboBox comboBoxSexta12h = new JComboBox();
		
		JComboBox comboBoxSexta16h = new JComboBox();
		
		JComboBox comboBoxSabado12h = new JComboBox();
		
		JComboBox comboBoxSabado16h = new JComboBox();
		
		JComboBox comboBoxSabado1630h = new JComboBox();
		
		JComboBox comboBoxSabado18h = new JComboBox();
		
		JComboBox comboBoxSabado1930h = new JComboBox();
		
		JComboBox comboBoxSegunda2230h = new JComboBox();
		
		JComboBox comboBoxSabado2230h = new JComboBox();
		
		JComboBox comboBoxSabado2030h = new JComboBox();
		GroupLayout gl_panelEditarHorario = new GroupLayout(panelEditarHorario);
		gl_panelEditarHorario.setHorizontalGroup(
			gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEditarHorario.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label2230h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label2030h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label1930h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label18h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label1630h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label16h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label12h, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label10h, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label9h, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBoxSegunda2230h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda2030h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda1930h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda18h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda1630h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda16h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda12h, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda10h, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSegunda9h, Alignment.LEADING, 0, 127, Short.MAX_VALUE)
								.addComponent(label_9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(lblHorario))
					.addGap(6)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxTerca1930h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuarta1930h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuinta1930h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSexta1930h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSabado1930h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxTerca18, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuarta18, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuinta18h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSexta18h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSabado18h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxTerca1630h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuarta1630h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuinta1630h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSexta1630h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSabado1630h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxTerca16h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuarta16h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuinta16h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSexta16h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSabado16h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxTerca12h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuarta12h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxQuinta12h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSexta12h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSabado12h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxTerca9h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxTerca10h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxQuarta9h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuarta10h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxQuinta9h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuinta10h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(comboBoxSexta10h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxSabado10h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(comboBoxSexta9h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxSabado9h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(lblSegundafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTerafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblQuartafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblQuintafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSextafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(comboBoxTerca2230h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxQuarta2230h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxQuinta2230h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxSexta2230h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(comboBoxTerca2030h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxQuarta2030h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxQuinta2030h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxSexta2030h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxSabado2030h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxSabado2230h, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
					.addGap(133))
		);
		gl_panelEditarHorario.setVerticalGroup(
			gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEditarHorario.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHorario)
						.addComponent(label_9)
						.addComponent(lblSegundafeira)
						.addComponent(lblTerafeira)
						.addComponent(lblQuartafeira)
						.addComponent(lblQuintafeira)
						.addComponent(lblSextafeira))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label9h)
						.addComponent(comboBoxSegunda9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado9h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label10h)
						.addComponent(comboBoxSegunda10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado10h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label12h)
						.addComponent(comboBoxSegunda12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado12h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label16h)
						.addComponent(comboBoxSegunda16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado16h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label1630h)
						.addComponent(comboBoxSegunda1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado1630h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label18h)
						.addComponent(comboBoxSegunda18h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta18h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta18h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado18h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
						.addComponent(label1930h)
						.addComponent(comboBoxSegunda1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTerca1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuarta1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuinta1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSexta1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSabado1930h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
								.addComponent(label2030h)
								.addComponent(comboBoxSegunda2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxTerca2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuarta2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuinta2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxSexta2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(9)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.BASELINE)
								.addComponent(label2230h)
								.addComponent(comboBoxSegunda2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxTerca2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuarta2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxQuinta2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxSexta2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBoxSabado2030h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(comboBoxSabado2230h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelEditarHorario.setLayout(gl_panelEditarHorario);
		getContentPane().setLayout(groupLayout);

	}
}
