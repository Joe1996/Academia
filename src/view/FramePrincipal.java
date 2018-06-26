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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeTelas.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 531);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeCadastrar.png"));
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
		mntmCadastrarAluno.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeWhiteBelt1.png"));
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
		mntmProfessor.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeBlackBelt1.png"));
		mnCadastrar.add(mntmProfessor);
		
		JMenuItem mntmModalidade = new JMenuItem("Modalidade");
		mntmModalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroModalidade cadastroModalidade = new InternalFrameCadastroModalidade();
				desktopPane.add(cadastroModalidade);
				cadastroModalidade.setVisible(true);
			}
		});
		mntmModalidade.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeModalidade.png"));
		mntmModalidade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmModalidade);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Fornecedores");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktopPane, "Função Indisponível no Momento", "Atenção", JOptionPane.WARNING_MESSAGE);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeFornecedor.png"));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmNewMenuItem);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInternalMessageDialog(desktopPane, "Função Indisponível no Momento", "Atenção", JOptionPane.WARNING_MESSAGE);
			}
		});
		mntmProdutos.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeProdutos.png"));
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
		mntmAcadmia.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeAcademia.png"));
		mntmAcadmia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnCadastrar.add(mntmAcadmia);
		
		JMenu mnGradeDeAulas = new JMenu("Grade de Aulas");
		mnGradeDeAulas.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\IconeGradeDeAulas.png"));
		mnGradeDeAulas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnGradeDeAulas);
		
		JMenuItem mntmMostrar = new JMenuItem("Mostrar/Editar");
		mntmMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameCadastroGradeAula aula = new InternalFrameCadastroGradeAula();
				desktopPane.add(aula);
				aula.setVisible(true);
			}
		});
		mntmMostrar.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\writing.png"));
		mntmMostrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnGradeDeAulas.add(mntmMostrar);
		
		JMenu mnPlanoDeAula = new JMenu("Plano de Aula");
		mnPlanoDeAula.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\blackboard.png"));
		mnPlanoDeAula.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnPlanoDeAula);
		
		JMenuItem mntmPreencher = new JMenuItem("Preencher");
		mntmPreencher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameGeraRelatorioAula aula = new InternalFrameGeraRelatorioAula();
				desktopPane.add(aula);
				aula.setVisible(true);
			}
		});
		mntmPreencher.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\pencil-case.png"));
		mntmPreencher.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnPlanoDeAula.add(mntmPreencher);
		
		JMenu mnMensalidades = new JMenu("Mensalidades");
		mnMensalidades.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\change.png"));
		mnMensalidades.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMensalidades);
		
		JMenuItem mntmValoresMensalidade = new JMenuItem("Valores");
		mntmValoresMensalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InternalFrameMensalidade frameMensalidade = new InternalFrameMensalidade();
				desktopPane.add(frameMensalidade);
				frameMensalidade.setVisible(true);
			}
		});
		mntmValoresMensalidade.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\payment.png"));
		mntmValoresMensalidade.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMensalidades.add(mntmValoresMensalidade);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Plano de Pagamentos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternalFrameCadastroPlano cadastroPlano = new InternalFrameCadastroPlano();
				desktopPane.add(cadastroPlano);
				cadastroPlano.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\planning1.png"));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMensalidades.add(mntmNewMenuItem_1);
		
		JMenu mnIndicadores = new JMenu("Indicadores");
		mnIndicadores.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\planning.png"));
		mnIndicadores.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnIndicadores);
		
		JMenuItem mntmMostrar_1 = new JMenuItem("Mostrar");
		mntmMostrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternalFrameIndicadores frameIndicadores = new InternalFrameIndicadores();
				desktopPane.add(frameIndicadores);
				frameIndicadores.setVisible(true);
			}
		});
		mntmMostrar_1.setIcon(new ImageIcon("C:\\Users\\EduardoCordova\\git\\Academia\\resources\\writing.png"));
		mnIndicadores.add(mntmMostrar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		
		JPanel panelUsuarioLogado = new JPanel();
		panelUsuarioLogado.setBorder(new TitledBorder(null, "Usu\u00E1rio Logado", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panelDataHora = new JPanel();
		panelDataHora.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Data e Hora", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel labelData = new JLabel("Data");
		
		JLabel labelHora = new JLabel("Hora");
		GroupLayout gl_panelDataHora = new GroupLayout(panelDataHora);
		gl_panelDataHora.setHorizontalGroup(
			gl_panelDataHora.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelDataHora.createSequentialGroup()
					.addContainerGap(91, Short.MAX_VALUE)
					.addComponent(labelData)
					.addGap(31)
					.addComponent(labelHora)
					.addGap(96))
		);
		gl_panelDataHora.setVerticalGroup(
			gl_panelDataHora.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDataHora.createSequentialGroup()
					.addGroup(gl_panelDataHora.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelData)
						.addComponent(labelHora))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panelDataHora.setLayout(gl_panelDataHora);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelUsuarioLogado, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(panelDataHora, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(175, Short.MAX_VALUE))
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelDataHora, 0, 0, Short.MAX_VALUE)
						.addComponent(panelUsuarioLogado, GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)))
		);
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblValor = new JLabel("valor");
		GroupLayout gl_panelUsuarioLogado = new GroupLayout(panelUsuarioLogado);
		gl_panelUsuarioLogado.setHorizontalGroup(
			gl_panelUsuarioLogado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUsuarioLogado.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblValor)
					.addContainerGap(262, Short.MAX_VALUE))
		);
		gl_panelUsuarioLogado.setVerticalGroup(
			gl_panelUsuarioLogado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUsuarioLogado.createSequentialGroup()
					.addGroup(gl_panelUsuarioLogado.createParallelGroup(Alignment.LEADING)
						.addComponent(lblValor)
						.addComponent(lblNome))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelUsuarioLogado.setLayout(gl_panelUsuarioLogado);
		contentPane.setLayout(gl_contentPane);
	}
	public JDesktopPane getDesktopPane() {
		return desktopPane;
	}
}
