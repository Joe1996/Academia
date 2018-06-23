package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DesktopPaneUI;

import com.sun.xml.internal.ws.api.Component;

import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setTitle("Inicio");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeTelas.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 463);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeCadastrar.png"));
		mnCadastrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrarAluno = new JMenuItem("Aluno");
		mntmCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroAluno aluno = new InternalFrameCadastroAluno();
				desktopPane.add(aluno);
				aluno.setVisible(true);
			}
		});
		mntmCadastrarAluno.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmCadastrarAluno.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeWhiteBelt1.png"));
		mnCadastrar.add(mntmCadastrarAluno);
		
		JMenuItem mntmProfessor = new JMenuItem("Professor");
		mntmProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroProfessor cadastroProfessor = new InternalFrameCadastroProfessor();
				desktopPane.add(cadastroProfessor);
				cadastroProfessor.setVisible(true);
			}
		});
		mntmProfessor.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmProfessor.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeBlackBelt1.png"));
		mnCadastrar.add(mntmProfessor);
		
		JMenuItem mntmModalidade = new JMenuItem("Modalidade");
		mntmModalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroModalidade cadastroModalidade = new InternalFrameCadastroModalidade();
				desktopPane.add(cadastroModalidade);
				cadastroModalidade.setVisible(true);
			}
		});
		mntmModalidade.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeModalidade.png"));
		mntmModalidade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmModalidade);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Fornecedores");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktopPane, "Função Indisponível no Momento", "Atenção", JOptionPane.WARNING_MESSAGE);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeFornecedor.png"));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmNewMenuItem);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInternalMessageDialog(desktopPane, "Função Indisponível no Momento", "Atenção", JOptionPane.WARNING_MESSAGE);
			}
		});
		mntmProdutos.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeProdutos.png"));
		mntmProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmProdutos);
		
		JMenuItem mntmAcadmia = new JMenuItem("Acad\u00EAmia");
		mntmAcadmia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroAcademia academia = new InternalFrameCadastroAcademia();
				desktopPane.add(academia);
				academia.setVisible(true);
			}
		});
		mntmAcadmia.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeAcademia.png"));
		mntmAcadmia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmAcadmia);
		
		JMenu mnGradeDeAulas = new JMenu("Grade de Aulas");
		mnGradeDeAulas.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\IconeGradeDeAulas.png"));
		mnGradeDeAulas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnGradeDeAulas);
		
		JMenuItem mntmMostrar = new JMenuItem("Mostrar/Editar");
		mntmMostrar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\writing.png"));
		mntmMostrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnGradeDeAulas.add(mntmMostrar);
		
		JMenu mnPlanoDeAula = new JMenu("Plano de Aula");
		mnPlanoDeAula.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\blackboard.png"));
		mnPlanoDeAula.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnPlanoDeAula);
		
		JMenuItem mntmPreencher = new JMenuItem("Preencher");
		mntmPreencher.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\pencil-case.png"));
		mntmPreencher.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnPlanoDeAula.add(mntmPreencher);
		
		JMenu mnMensalidades = new JMenu("Mensalidades");
		mnMensalidades.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\change.png"));
		mnMensalidades.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMensalidades);
		
		JMenuItem mntmValoresMensalidade = new JMenuItem("Valores");
		mntmValoresMensalidade.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\payment.png"));
		mntmValoresMensalidade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMensalidades.add(mntmValoresMensalidade);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Plano de Pagamentos");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\planning1.png"));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMensalidades.add(mntmNewMenuItem_1);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		mnRelatrios.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\planning.png"));
		mnRelatrios.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmMostrar_1 = new JMenuItem("Mostrar");
		mntmMostrar_1.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\src\\img\\writing.png"));
		mnRelatrios.add(mntmMostrar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	public JDesktopPane getDesktopPane() {
		return desktopPane;
	}
}
