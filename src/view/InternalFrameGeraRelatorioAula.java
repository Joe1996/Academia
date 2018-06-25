package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class InternalFrameGeraRelatorioAula extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

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
		setTitle("Relat\u00F3rio de Aula");
		setBounds(100, 100, 746, 440);
		
		JLabel lblModalidade = new JLabel("Modalidade");
		
		JLabel lblHoraDoTreino = new JLabel("Hora do Treino");
		
		JLabel lblData = new JLabel("Data");
		
		JLabel lblProfessor = new JLabel("Professor");
		
		JLabel lblAlunosPresentes = new JLabel("Alunos Presentes");
		
		JLabel lblConvidadosParaTreino = new JLabel("Convidados para Treino");
		
		JComboBox comboBox = new JComboBox();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblConvidadosParaTreino)
						.addComponent(lblAlunosPresentes)
						.addComponent(lblProfessor)
						.addComponent(lblData)
						.addComponent(lblHoraDoTreino)
						.addComponent(lblModalidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField)
							.addComponent(comboBox, 0, 161, Short.MAX_VALUE))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(441, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModalidade)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHoraDoTreino)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblData)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProfessor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAlunosPresentes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblConvidadosParaTreino)
					.addContainerGap(285, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
