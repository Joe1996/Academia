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

public class InternalFrameCadastroGradeAula extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tableHorarioAtual;

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
		setBounds(100, 100, 1101, 535);
		
		JPanel panelHorarioAtual = new JPanel();
		panelHorarioAtual.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hor\u00E1rio Atual", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelEditarHorario = new JPanel();
		panelEditarHorario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Editar Hor\u00E1rio", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelHorarioAtual, GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(panelEditarHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(panelEditarHorario, GroupLayout.PREFERRED_SIZE, 288, Short.MAX_VALUE)
					.addGap(85)
					.addComponent(panelHorarioAtual, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblHorario = new JLabel("Hor\u00E1rio");
		
		JLabel label_1 = new JLabel("10:00");
		
		JLabel label_2 = new JLabel("12:00");
		
		JLabel label_3 = new JLabel("16:00");
		
		JLabel label_4 = new JLabel("16:30");
		
		JLabel label_5 = new JLabel("18:00");
		
		JLabel label_6 = new JLabel("19:30");
		
		JLabel label_7 = new JLabel("20:30");
		
		JLabel label_8 = new JLabel("22:30");
		
		JLabel lblTerafeira = new JLabel("Quarta-Feira");
		lblTerafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox_9 = new JComboBox();
		
		JComboBox comboBox_10 = new JComboBox();
		
		JComboBox comboBox_11 = new JComboBox();
		
		JComboBox comboBox_12 = new JComboBox();
		
		JComboBox comboBox_13 = new JComboBox();
		
		JComboBox comboBox_14 = new JComboBox();
		
		JComboBox comboBox_15 = new JComboBox();
		
		JComboBox comboBox_16 = new JComboBox();
		
		JComboBox comboBox_17 = new JComboBox();
		
		JLabel label = new JLabel("09:00");
		
		JLabel lblQuartafeira = new JLabel("Quinta-Feira");
		lblQuartafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox_18 = new JComboBox();
		
		JComboBox comboBox_19 = new JComboBox();
		
		JComboBox comboBox_20 = new JComboBox();
		
		JComboBox comboBox_21 = new JComboBox();
		
		JComboBox comboBox_22 = new JComboBox();
		
		JComboBox comboBox_23 = new JComboBox();
		
		JComboBox comboBox_24 = new JComboBox();
		
		JComboBox comboBox_25 = new JComboBox();
		
		JComboBox comboBox_26 = new JComboBox();
		
		JLabel lblQuintafeira = new JLabel("Sexta-Feira");
		lblQuintafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox_27 = new JComboBox();
		
		JComboBox comboBox_28 = new JComboBox();
		
		JComboBox comboBox_29 = new JComboBox();
		
		JComboBox comboBox_30 = new JComboBox();
		
		JComboBox comboBox_31 = new JComboBox();
		
		JComboBox comboBox_32 = new JComboBox();
		
		JComboBox comboBox_33 = new JComboBox();
		
		JComboBox comboBox_34 = new JComboBox();
		
		JComboBox comboBox_35 = new JComboBox();
		
		JLabel lblSegundafeira = new JLabel("Ter\u00E7a-Feira");
		lblSegundafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboBox_3 = new JComboBox();
		
		JComboBox comboBox_4 = new JComboBox();
		
		JComboBox comboBox_5 = new JComboBox();
		
		JComboBox comboBox_6 = new JComboBox();
		
		JComboBox comboBox_7 = new JComboBox();
		
		JComboBox comboBox_8 = new JComboBox();
		
		JLabel lblSextafeira = new JLabel("S\u00E1bado");
		lblSextafeira.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox_36 = new JComboBox();
		
		JComboBox comboBox_37 = new JComboBox();
		
		JComboBox comboBox_38 = new JComboBox();
		
		JComboBox comboBox_39 = new JComboBox();
		
		JComboBox comboBox_40 = new JComboBox();
		
		JComboBox comboBox_41 = new JComboBox();
		
		JComboBox comboBox_42 = new JComboBox();
		
		JComboBox comboBox_43 = new JComboBox();
		
		JComboBox comboBox_44 = new JComboBox();
		
		JLabel label_9 = new JLabel("Segunda-Feira");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox_45 = new JComboBox();
		
		JComboBox comboBox_46 = new JComboBox();
		
		JComboBox comboBox_47 = new JComboBox();
		
		JComboBox comboBox_48 = new JComboBox();
		
		JComboBox comboBox_49 = new JComboBox();
		
		JComboBox comboBox_50 = new JComboBox();
		
		JComboBox comboBox_51 = new JComboBox();
		
		JComboBox comboBox_52 = new JComboBox();
		
		JComboBox comboBox_53 = new JComboBox();
		GroupLayout gl_panelEditarHorario = new GroupLayout(panelEditarHorario);
		gl_panelEditarHorario.setHorizontalGroup(
			gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEditarHorario.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(lblHorario, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(lblSegundafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblTerafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblQuartafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblQuintafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblSextafeira, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label)
									.addGap(146)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_27, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_36, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_28, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_37, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_29, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_38, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_21, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_30, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_39, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_22, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_31, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_40, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_14, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_23, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_32, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_41, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_15, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_24, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_33, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_42, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_16, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_25, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_34, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_43, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_17, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_26, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_35, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(comboBox_44, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_45, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_46, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_47, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_48, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_49, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_50, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_51, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_52, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_53, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_panelEditarHorario.setVerticalGroup(
			gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEditarHorario.createSequentialGroup()
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHorario)
								.addComponent(lblSegundafeira)
								.addComponent(lblTerafeira)
								.addComponent(lblQuartafeira)
								.addComponent(lblQuintafeira)
								.addComponent(lblSextafeira))
							.addGap(6))
						.addGroup(Alignment.TRAILING, gl_panelEditarHorario.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label_9)
							.addGap(6)))
					.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label))
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_1))
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_2))
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_3))
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_4))
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_5))
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_6))
								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_7))
								.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelEditarHorario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelEditarHorario.createSequentialGroup()
									.addGap(3)
									.addComponent(label_8))
								.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelEditarHorario.createSequentialGroup()
							.addComponent(comboBox_45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_46, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_47, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_48, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_49, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_51, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_52, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_53, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelEditarHorario.setLayout(gl_panelEditarHorario);
		
		tableHorarioAtual = new JTable();
		tableHorarioAtual.setEnabled(false);
		tableHorarioAtual.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
				{"", null, null, null, null, null, null},
			},
			new String[] {
				"Hor\u00E1rio", "Segunda-Feira", "Ter\u00E7a-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "S\u00E1bado"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		GroupLayout gl_panelHorarioAtual = new GroupLayout(panelHorarioAtual);
		gl_panelHorarioAtual.setHorizontalGroup(
			gl_panelHorarioAtual.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHorarioAtual.createSequentialGroup()
					.addContainerGap()
					.addComponent(tableHorarioAtual, GroupLayout.PREFERRED_SIZE, 681, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelHorarioAtual.setVerticalGroup(
			gl_panelHorarioAtual.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHorarioAtual.createSequentialGroup()
					.addContainerGap()
					.addComponent(tableHorarioAtual, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panelHorarioAtual.setLayout(gl_panelHorarioAtual);
		getContentPane().setLayout(groupLayout);

	}
}
