package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.ModalidadeController;
import model.impl.Professor;
import util.BusinessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InternalFrameCadastroModalidade extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JComboBox<Professor> comboBoxProfessor;
	private ModalidadeController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameCadastroModalidade frame = new InternalFrameCadastroModalidade();
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
	public InternalFrameCadastroModalidade() {
		setClosable(true);
		setTitle("Cadastrar Modalidade");
		setBounds(100, 100, 338, 136);
		
		JLabel lblNome = new JLabel("Nome");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.insert();
				} catch (BusinessException be) {
					JOptionPane.showMessageDialog(InternalFrameCadastroModalidade.this, be.getMessage());
				}
			}
		});
		btnSalvar.setIcon(new ImageIcon(InternalFrameCadastroModalidade.class.getResource("/resources/checked.png")));
		
		JLabel lblProfessor = new JLabel("Professor");
		
		comboBoxProfessor = new JComboBox<>();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblProfessor)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxProfessor, 0, 203, Short.MAX_VALUE)
						.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
					.addGap(12))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(199, Short.MAX_VALUE)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxProfessor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProfessor))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSalvar)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		controller = new ModalidadeController(InternalFrameCadastroModalidade.this);
		controller.populateProfessorComboBox();
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public JComboBox<Professor> getComboBoxProfessor() {
		return comboBoxProfessor;
	}

}
