package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;

public class InternalFrameGeraRelatorioAula extends JInternalFrame {
	private JFormattedTextField textFieldData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameGeraRelatorioAula frame = new InternalFrameGeraRelatorioAula();
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
	public InternalFrameGeraRelatorioAula() {
		setClosable(true);
		setTitle("Relat\u00F3rio de Aula");
		setBounds(100, 100, 853, 577);
		
		JLabel lblModalidade = new JLabel("Modalidade");
		
		JLabel lblHoraDoTreino = new JLabel("Hora do Treino");
		
		JLabel lblData = new JLabel("Data");
		
		JLabel lblProfessor = new JLabel("Professor");
		
		JLabel lblConvidadosParaTreino = new JLabel("Convidados para Treino");
		
		JComboBox comboBoxModalidade = new JComboBox();
		
		textFieldData = new JFormattedTextField();
		textFieldData.setColumns(10);
		
		JComboBox comboBoxProfessor = new JComboBox();
		
		JComboBox comboBoxHoraDoTreino = new JComboBox();
		comboBoxHoraDoTreino.setModel(new DefaultComboBoxModel(new String[] {"09:00", "10:00", "12:00", "16:00", "16:30", "18:00", "19:30", "20:30", "22:30"}));
		
		JLabel lblAlunosPresentes = new JLabel("Alunos Presentes");
		
		JPanel panelRelatorioDeAula = new JPanel();
		panelRelatorioDeAula.setBorder(new TitledBorder(null, "Relat\u00F3rio de Aula", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JTextPane textPaneAlunosPresentes = new JTextPane();
		textPaneAlunosPresentes.setText("");
		
		JTextPane textPane = new JTextPane();
		textPane.setText("");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(InternalFrameGeraRelatorioAula.class.getResource("/resources/checked.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblHoraDoTreino)
								.addComponent(lblModalidade)
								.addComponent(lblData)
								.addComponent(lblProfessor)
								.addComponent(lblAlunosPresentes)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblConvidadosParaTreino)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(comboBoxProfessor, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textPaneAlunosPresentes, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
							.addComponent(comboBoxModalidade, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBoxHoraDoTreino, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textFieldData, Alignment.LEADING)))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelRelatorioDeAula, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvar))
					.addGap(38))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(panelRelatorioDeAula, GroupLayout.PREFERRED_SIZE, 472, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblModalidade)
								.addComponent(comboBoxModalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHoraDoTreino)
								.addComponent(comboBoxHoraDoTreino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblData)
								.addComponent(textFieldData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblProfessor)
								.addComponent(comboBoxProfessor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAlunosPresentes)
								.addComponent(textPaneAlunosPresentes, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblConvidadosParaTreino)
									.addGap(113))
								.addComponent(textPane))))
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panelRelatorioDeAula = new GroupLayout(panelRelatorioDeAula);
		gl_panelRelatorioDeAula.setHorizontalGroup(
			gl_panelRelatorioDeAula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRelatorioDeAula.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelRelatorioDeAula.setVerticalGroup(
			gl_panelRelatorioDeAula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRelatorioDeAula.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelRelatorioDeAula.setLayout(gl_panelRelatorioDeAula);
		getContentPane().setLayout(groupLayout);

	}
}
