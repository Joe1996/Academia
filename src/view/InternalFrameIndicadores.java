package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InternalFrameIndicadores extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameIndicadores frame = new InternalFrameIndicadores();
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
	public InternalFrameIndicadores() {
		setTitle("Indicadores");
		setClosable(true);
		setBounds(100, 100, 629, 516);
		
		JLabel lblAlunosCadastrados = new JLabel("Alunos Cadastrados:");
		
		JLabel lblSexoMasculino = new JLabel("Sexo Masculino:");
		
		JLabel lblSexoFeminino = new JLabel("Sexo Feminino:");
		
		JLabel label = new JLabel("");
		
		JLabel lblDesistentes = new JLabel("Desistentes:");
		
		JLabel lblPlanoMensal = new JLabel("Plano Mensal:");
		
		JLabel lblPlanoSemestral = new JLabel("Plano Semestral:");
		
		JLabel lblPlanoAnual = new JLabel("Plano Anual:");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPlanoAnual)
						.addComponent(lblPlanoSemestral)
						.addComponent(lblPlanoMensal)
						.addComponent(lblDesistentes)
						.addComponent(label)
						.addComponent(lblSexoFeminino)
						.addComponent(lblSexoMasculino)
						.addComponent(lblAlunosCadastrados))
					.addContainerGap(503, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAlunosCadastrados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSexoMasculino)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSexoFeminino)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblDesistentes))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPlanoMensal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPlanoSemestral)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPlanoAnual)
					.addContainerGap(341, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}
