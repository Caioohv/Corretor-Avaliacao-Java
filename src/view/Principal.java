package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.TableColumn;

import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel gabaritos;
	private JPanel correcao;
	private JPanel dados;
	private JPanel cursos;
	private JPanel alunos;
	private JPanel criaGabarito;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton radioButton_1B;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();
	private final ButtonGroup buttonGroup_12 = new ButtonGroup();
	private final ButtonGroup buttonGroup_13 = new ButtonGroup();
	private final ButtonGroup buttonGroup_14 = new ButtonGroup();
	private final ButtonGroup buttonGroup_15 = new ButtonGroup();
	private final ButtonGroup buttonGroup_16 = new ButtonGroup();
	private final ButtonGroup buttonGroup_17 = new ButtonGroup();
	private final ButtonGroup buttonGroup_18 = new ButtonGroup();
	private final ButtonGroup buttonGroup_19 = new ButtonGroup();
	private final ButtonGroup buttonGroup_20 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private String resps = "";
	/**
	 * Create the frame.
	 */
	
	
	public Principal() {
		
		//att//
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 153));
		panel.setBounds(0, 0, 322, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOsk = new JLabel("OSK");
		
		lblOsk.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOsk.setForeground(new Color(255,138,35));
		lblOsk.setHorizontalAlignment(SwingConstants.CENTER);
		lblOsk.setBounds(10, 33, 291, 64);
		lblOsk.setFont(new Font("The Bold Font", Font.PLAIN, 45));
		panel.add(lblOsk);
		
		JLabel lblCorretor = new JLabel("Corretor");
		lblCorretor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCorretor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorretor.setForeground(new Color(255,138,35));
		lblCorretor.setFont(new Font("The Bold Font", Font.PLAIN, 26));
		lblCorretor.setBounds(10, 83, 291, 35);
		panel.add(lblCorretor);
		
		JLabel lblCadastrarGabarito = new JLabel("Gabaritos");
		
		lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
		lblCadastrarGabarito.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarGabarito.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCadastrarGabarito.setFont(new Font("Teko", Font.PLAIN, 28));
		lblCadastrarGabarito.setBounds(10, 154, 291, 70);
		panel.add(lblCadastrarGabarito);
		
		JLabel lblEfetuarCorrees = new JLabel("Efetuar Corre\u00E7\u00F5es");
		
		lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
		lblEfetuarCorrees.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEfetuarCorrees.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfetuarCorrees.setFont(new Font("Teko", Font.PLAIN, 28));
		lblEfetuarCorrees.setBounds(10, 235, 291, 70);
		panel.add(lblEfetuarCorrees);
		
		JLabel lblAlunos = new JLabel("Dados");
		
		lblAlunos.setForeground(new Color(255, 255, 204));
		lblAlunos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunos.setFont(new Font("Teko", Font.PLAIN, 28));
		lblAlunos.setBounds(10, 316, 291, 70);
		panel.add(lblAlunos);
		
		JLabel lblCursos = new JLabel("Cursos");
		
		lblCursos.setForeground(new Color(255, 255, 204));
		lblCursos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCursos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCursos.setFont(new Font("Teko", Font.PLAIN, 28));
		lblCursos.setBounds(10, 397, 291, 70);
		panel.add(lblCursos);
		
		JLabel lblAlunos_1 = new JLabel("Alunos");
		
		lblAlunos_1.setForeground(new Color(255, 255, 204));
		lblAlunos_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAlunos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunos_1.setFont(new Font("Teko", Font.PLAIN, 28));
		lblAlunos_1.setBounds(10, 478, 291, 70);
		panel.add(lblAlunos_1);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSair.setHorizontalAlignment(SwingConstants.CENTER);
		lblSair.setForeground(new Color(255, 255, 204));
		lblSair.setFont(new Font("Teko", Font.PLAIN, 28));
		lblSair.setBounds(0, 600, 291, 70);
		panel.add(lblSair);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(321, 0, 762, 681);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		layeredPane.add(home, "name_6825065858400");
		home.setBackground(Color.WHITE);
		home.setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem Vindx!");
		lblBemVindo.setForeground(new Color(0, 0, 51));
		lblBemVindo.setFont(new Font("Amarillo", Font.BOLD, 35));
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setBounds(10, 568, 742, 102);
		home.add(lblBemVindo);
		
		JLabel lblFrase = new JLabel("\u201CSua mente \u00E9 para ter ideias, e n\u00E3o para guard\u00E1-las.\u201D");
		lblFrase.setForeground(new Color(0, 0, 51));
		lblFrase.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(10, 99, 742, 85);
		home.add(lblFrase);
		
		JPanel gabarito = new JPanel();
		layeredPane.add(gabarito, "name_6825074297000");
		gabarito.setBackground(new Color(255, 255, 255));
		gabarito.setLayout(null);
		
		JLabel lblGabaritos = new JLabel("Gabaritos");
		lblGabaritos.setForeground(new Color(0, 0, 51));
		lblGabaritos.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblGabaritos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblGabaritos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGabaritos.setBounds(10, 11, 742, 66);
		gabarito.add(lblGabaritos);
		
		JComboBox jcAno = new JComboBox();
		jcAno.setBounds(312, 254, 144, 20);
		gabarito.add(jcAno);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setForeground(new Color(51, 51, 51));
		lblAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno.setFont(new Font("Teko", Font.PLAIN, 24));
		lblAno.setBounds(10, 230, 742, 22);
		gabarito.add(lblAno);
		
		JComboBox jcEtapa = new JComboBox();
		jcEtapa.setBounds(312, 338, 144, 20);
		gabarito.add(jcEtapa);
		
		JLabel lblEtapa = new JLabel("Etapa:");
		lblEtapa.setForeground(new Color(51, 51, 51));
		lblEtapa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtapa.setFont(new Font("Teko", Font.PLAIN, 24));
		lblEtapa.setBounds(10, 307, 742, 31);
		gabarito.add(lblEtapa);
		
		JComboBox jcTipo = new JComboBox();
		jcTipo.setBounds(312, 426, 144, 20);
		gabarito.add(jcTipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(new Color(51, 51, 51));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Teko", Font.PLAIN, 24));
		lblTipo.setBounds(10, 395, 742, 31);
		gabarito.add(lblTipo);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.inactiveCaption);
		separator.setBounds(470, 377, -179, -8);
		gabarito.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.inactiveCaption);
		separator_1.setBounds(470, 291, -179, -8);
		gabarito.add(separator_1);
		
		Button btnContinuar = new Button("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int aa = JOptionPane.showConfirmDialog(null, "Informações:\nAno: "+jcAno.getSelectedItem()+"\nEtapa: "+jcEtapa.getSelectedItem()+"\nTipo: "+jcTipo.getSelectedItem());
				System.out.println(aa);
				System.out.println(JOptionPane.OK_OPTION);
				if(aa == 0) {
					layeredPane.removeAll();
					layeredPane.add(criaGabarito);
					layeredPane.repaint();
					layeredPane.revalidate();
				}

				//criaGabarito
			}
		});
		btnContinuar.setBounds(660, 649, 92, 22);
		gabarito.add(btnContinuar);
		
		cursos = new JPanel();
		cursos.setBackground(Color.WHITE);
		layeredPane.add(cursos, "name_11025611987200");
		cursos.setLayout(null);
		
		JLabel lblCursos_1 = new JLabel("Cursos\r\n");
		lblCursos_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCursos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCursos_1.setForeground(new Color(0, 0, 51));
		lblCursos_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblCursos_1.setBounds(10, 11, 742, 66);
		cursos.add(lblCursos_1);
		
		alunos = new JPanel();
		alunos.setBackground(Color.WHITE);
		layeredPane.add(alunos, "name_11045515110100");
		alunos.setLayout(null);
		
		JLabel lblAlunos_2 = new JLabel("Alunos\r\n");
		lblAlunos_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAlunos_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunos_2.setForeground(new Color(0, 0, 51));
		lblAlunos_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblAlunos_2.setBounds(10, 11, 742, 66);
		alunos.add(lblAlunos_2);
		
		dados = new JPanel();
		dados.setBackground(Color.WHITE);
		layeredPane.add(dados, "name_11099532125600");
		dados.setLayout(null);
		
		JLabel lblDados = new JLabel("Dados\r\n");
		lblDados.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDados.setForeground(new Color(0, 0, 51));
		lblDados.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblDados.setBounds(10, 11, 742, 66);
		dados.add(lblDados);
		
		correcao = new JPanel();
		correcao.setBackground(Color.WHITE);
		layeredPane.add(correcao, "name_11103731559500");
		correcao.setLayout(null);
		
		JLabel lblEfetuarCorrecao = new JLabel("Efetuar Corre\u00E7\u00F5es");
		lblEfetuarCorrecao.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEfetuarCorrecao.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfetuarCorrecao.setForeground(new Color(0, 0, 51));
		lblEfetuarCorrecao.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblEfetuarCorrecao.setBounds(10, 11, 742, 66);
		correcao.add(lblEfetuarCorrecao);
		
		criaGabarito = new JPanel();
		criaGabarito.setBackground(Color.WHITE);
		layeredPane.add(criaGabarito, "name_4510379899300");
		criaGabarito.setLayout(null);
		
		JLabel lblCrieSeuGabarito = new JLabel("Crie seu gabarito:\r\n");
		
		lblCrieSeuGabarito.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCrieSeuGabarito.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrieSeuGabarito.setForeground(new Color(0, 0, 51));
		lblCrieSeuGabarito.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
		lblCrieSeuGabarito.setBounds(10, 11, 742, 66);
		criaGabarito.add(lblCrieSeuGabarito);
		
		JLabel label_4 = new JLabel("1)");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(168, 156, 28, 34);
		criaGabarito.add(label_4);
		
		JRadioButton radioButton_1A = new JRadioButton("A");
		buttonGroup_1.add(radioButton_1A);
		radioButton_1A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_1A.setBackground(Color.WHITE);
		radioButton_1A.setBounds(202, 156, 35, 34);
		criaGabarito.add(radioButton_1A);
		
		radioButton_1B = new JRadioButton("B");
		buttonGroup_1.add(radioButton_1B);
		radioButton_1B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_1B.setBackground(Color.WHITE);
		radioButton_1B.setBounds(239, 156, 35, 34);
		criaGabarito.add(radioButton_1B);
		
		JRadioButton radioButton_1C = new JRadioButton("C");
		buttonGroup_1.add(radioButton_1C);
		radioButton_1C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_1C.setBackground(Color.WHITE);
		radioButton_1C.setBounds(276, 156, 35, 34);
		criaGabarito.add(radioButton_1C);
		
		JRadioButton radioButton_1D = new JRadioButton("D");
		buttonGroup_1.add(radioButton_1D);
		radioButton_1D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_1D.setBackground(Color.WHITE);
		radioButton_1D.setBounds(313, 156, 35, 34);
		criaGabarito.add(radioButton_1D);
		
		JRadioButton radioButton_2A = new JRadioButton("A");
		buttonGroup_2.add(radioButton_2A);
		radioButton_2A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_2A.setBackground(Color.WHITE);
		radioButton_2A.setBounds(202, 193, 35, 34);
		criaGabarito.add(radioButton_2A);
		
		JRadioButton radioButton_2B = new JRadioButton("B");
		buttonGroup_2.add(radioButton_2B);
		radioButton_2B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_2B.setBackground(Color.WHITE);
		radioButton_2B.setBounds(239, 193, 35, 34);
		criaGabarito.add(radioButton_2B);
		
		JRadioButton radioButton_2C = new JRadioButton("C");
		buttonGroup_2.add(radioButton_2C);
		radioButton_2C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_2C.setBackground(Color.WHITE);
		radioButton_2C.setBounds(276, 193, 35, 34);
		criaGabarito.add(radioButton_2C);
		
		JRadioButton radioButton_2D = new JRadioButton("D");
		buttonGroup_2.add(radioButton_2D);
		radioButton_2D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_2D.setBackground(Color.WHITE);
		radioButton_2D.setBounds(313, 193, 35, 34);
		criaGabarito.add(radioButton_2D);
		
		JRadioButton radioButton_3A = new JRadioButton("A");
		buttonGroup_3.add(radioButton_3A);
		radioButton_3A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_3A.setBackground(Color.WHITE);
		radioButton_3A.setBounds(202, 230, 35, 34);
		criaGabarito.add(radioButton_3A);
		
		JRadioButton radioButton_3B = new JRadioButton("B");
		buttonGroup_3.add(radioButton_3B);
		radioButton_3B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_3B.setBackground(Color.WHITE);
		radioButton_3B.setBounds(239, 230, 35, 34);
		criaGabarito.add(radioButton_3B);
		
		JRadioButton radioButton_3C = new JRadioButton("C");
		buttonGroup_3.add(radioButton_3C);
		radioButton_3C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_3C.setBackground(Color.WHITE);
		radioButton_3C.setBounds(276, 230, 35, 34);
		criaGabarito.add(radioButton_3C);
		
		JRadioButton radioButton_3D = new JRadioButton("D");
		buttonGroup_3.add(radioButton_3D);
		radioButton_3D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_3D.setBackground(Color.WHITE);
		radioButton_3D.setBounds(313, 230, 35, 34);
		criaGabarito.add(radioButton_3D);
		
		JRadioButton radioButton_4A = new JRadioButton("A");
		buttonGroup_4.add(radioButton_4A);
		radioButton_4A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_4A.setBackground(Color.WHITE);
		radioButton_4A.setBounds(202, 267, 35, 34);
		criaGabarito.add(radioButton_4A);
		
		JRadioButton radioButton_4B = new JRadioButton("B");
		buttonGroup_4.add(radioButton_4B);
		radioButton_4B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_4B.setBackground(Color.WHITE);
		radioButton_4B.setBounds(239, 267, 35, 34);
		criaGabarito.add(radioButton_4B);
		
		JRadioButton radioButton_4C = new JRadioButton("C");
		buttonGroup_4.add(radioButton_4C);
		radioButton_4C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_4C.setBackground(Color.WHITE);
		radioButton_4C.setBounds(276, 267, 35, 34);
		criaGabarito.add(radioButton_4C);
		
		JRadioButton radioButton_4D = new JRadioButton("D");
		buttonGroup_4.add(radioButton_4D);
		radioButton_4D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_4D.setBackground(Color.WHITE);
		radioButton_4D.setBounds(313, 267, 35, 34);
		criaGabarito.add(radioButton_4D);
		
		JRadioButton radioButton_5A = new JRadioButton("A");
		buttonGroup_5.add(radioButton_5A);
		radioButton_5A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_5A.setBackground(Color.WHITE);
		radioButton_5A.setBounds(202, 304, 35, 34);
		criaGabarito.add(radioButton_5A);
		
		JRadioButton radioButton_5B = new JRadioButton("B");
		buttonGroup_5.add(radioButton_5B);
		radioButton_5B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_5B.setBackground(Color.WHITE);
		radioButton_5B.setBounds(239, 304, 35, 34);
		criaGabarito.add(radioButton_5B);
		
		JRadioButton radioButton_5C = new JRadioButton("C");
		buttonGroup_5.add(radioButton_5C);
		radioButton_5C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_5C.setBackground(Color.WHITE);
		radioButton_5C.setBounds(276, 304, 35, 34);
		criaGabarito.add(radioButton_5C);
		
		JRadioButton radioButton_5D = new JRadioButton("D");
		buttonGroup_5.add(radioButton_5D);
		radioButton_5D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_5D.setBackground(Color.WHITE);
		radioButton_5D.setBounds(313, 304, 35, 34);
		criaGabarito.add(radioButton_5D);
		
		JRadioButton radioButton_6A = new JRadioButton("A");
		buttonGroup_6.add(radioButton_6A);
		radioButton_6A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_6A.setBackground(Color.WHITE);
		radioButton_6A.setBounds(202, 341, 35, 34);
		criaGabarito.add(radioButton_6A);
		
		JRadioButton radioButton_6B = new JRadioButton("B");
		buttonGroup_6.add(radioButton_6B);
		radioButton_6B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_6B.setBackground(Color.WHITE);
		radioButton_6B.setBounds(239, 341, 35, 34);
		criaGabarito.add(radioButton_6B);
		
		JRadioButton radioButton_6C = new JRadioButton("C");
		buttonGroup_6.add(radioButton_6C);
		radioButton_6C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_6C.setBackground(Color.WHITE);
		radioButton_6C.setBounds(276, 341, 35, 34);
		criaGabarito.add(radioButton_6C);
		
		JRadioButton radioButton_6D = new JRadioButton("D");
		buttonGroup_6.add(radioButton_6D);
		radioButton_6D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_6D.setBackground(Color.WHITE);
		radioButton_6D.setBounds(313, 341, 35, 34);
		criaGabarito.add(radioButton_6D);
		
		JRadioButton radioButton_7A = new JRadioButton("A");
		buttonGroup_7.add(radioButton_7A);
		radioButton_7A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_7A.setBackground(Color.WHITE);
		radioButton_7A.setBounds(202, 378, 35, 34);
		criaGabarito.add(radioButton_7A);
		
		JRadioButton radioButton_7B = new JRadioButton("B");
		buttonGroup_7.add(radioButton_7B);
		radioButton_7B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_7B.setBackground(Color.WHITE);
		radioButton_7B.setBounds(239, 378, 35, 34);
		criaGabarito.add(radioButton_7B);
		
		JRadioButton radioButton_7C = new JRadioButton("C");
		buttonGroup_7.add(radioButton_7C);
		radioButton_7C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_7C.setBackground(Color.WHITE);
		radioButton_7C.setBounds(276, 378, 35, 34);
		criaGabarito.add(radioButton_7C);
		
		JRadioButton radioButton_7D = new JRadioButton("D");
		buttonGroup_7.add(radioButton_7D);
		radioButton_7D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_7D.setBackground(Color.WHITE);
		radioButton_7D.setBounds(313, 378, 35, 34);
		criaGabarito.add(radioButton_7D);
		
		JRadioButton radioButton_8A = new JRadioButton("A");
		buttonGroup_8.add(radioButton_8A);
		radioButton_8A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_8A.setBackground(Color.WHITE);
		radioButton_8A.setBounds(202, 415, 35, 34);
		criaGabarito.add(radioButton_8A);
		
		JRadioButton radioButton_8B = new JRadioButton("B");
		buttonGroup_8.add(radioButton_8B);
		radioButton_8B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_8B.setBackground(Color.WHITE);
		radioButton_8B.setBounds(239, 415, 35, 34);
		criaGabarito.add(radioButton_8B);
		
		JRadioButton radioButton_8C = new JRadioButton("C");
		buttonGroup_8.add(radioButton_8C);
		radioButton_8C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_8C.setBackground(Color.WHITE);
		radioButton_8C.setBounds(276, 415, 35, 34);
		criaGabarito.add(radioButton_8C);
		
		JRadioButton radioButton_8D = new JRadioButton("D");
		buttonGroup_8.add(radioButton_8D);
		radioButton_8D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_8D.setBackground(Color.WHITE);
		radioButton_8D.setBounds(313, 415, 35, 34);
		criaGabarito.add(radioButton_8D);
		
		JRadioButton radioButton_9A = new JRadioButton("A");
		buttonGroup_9.add(radioButton_9A);
		radioButton_9A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_9A.setBackground(Color.WHITE);
		radioButton_9A.setBounds(202, 452, 35, 34);
		criaGabarito.add(radioButton_9A);
		
		JRadioButton radioButton_9B = new JRadioButton("B");
		buttonGroup_9.add(radioButton_9B);
		radioButton_9B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_9B.setBackground(Color.WHITE);
		radioButton_9B.setBounds(239, 452, 35, 34);
		criaGabarito.add(radioButton_9B);
		
		JRadioButton radioButton_9C = new JRadioButton("C");
		buttonGroup_9.add(radioButton_9C);
		radioButton_9C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_9C.setBackground(Color.WHITE);
		radioButton_9C.setBounds(276, 452, 35, 34);
		criaGabarito.add(radioButton_9C);
		
		JRadioButton radioButton_9D = new JRadioButton("D");
		buttonGroup_9.add(radioButton_9D);
		radioButton_9D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_9D.setBackground(Color.WHITE);
		radioButton_9D.setBounds(313, 452, 35, 34);
		criaGabarito.add(radioButton_9D);
		
		JRadioButton radioButton_10A = new JRadioButton("A");
		buttonGroup_10.add(radioButton_10A);
		radioButton_10A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_10A.setBackground(Color.WHITE);
		radioButton_10A.setBounds(202, 489, 35, 34);
		criaGabarito.add(radioButton_10A);
		
		JRadioButton radioButton_10B = new JRadioButton("B");
		buttonGroup_10.add(radioButton_10B);
		radioButton_10B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_10B.setBackground(Color.WHITE);
		radioButton_10B.setBounds(239, 489, 35, 34);
		criaGabarito.add(radioButton_10B);
		
		JRadioButton radioButton_10C = new JRadioButton("C");
		buttonGroup_10.add(radioButton_10C);
		radioButton_10C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_10C.setBackground(Color.WHITE);
		radioButton_10C.setBounds(276, 489, 35, 34);
		criaGabarito.add(radioButton_10C);
		
		JRadioButton radioButton_10D = new JRadioButton("D");
		buttonGroup_10.add(radioButton_10D);
		radioButton_10D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_10D.setBackground(Color.WHITE);
		radioButton_10D.setBounds(313, 489, 35, 34);
		criaGabarito.add(radioButton_10D);
		
		JRadioButton radioButton_11A = new JRadioButton("A");
		buttonGroup_11.add(radioButton_11A);
		radioButton_11A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_11A.setBackground(Color.WHITE);
		radioButton_11A.setBounds(450, 156, 35, 34);
		criaGabarito.add(radioButton_11A);
		
		JRadioButton radioButton_11B = new JRadioButton("B");
		buttonGroup_11.add(radioButton_11B);
		radioButton_11B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_11B.setBackground(Color.WHITE);
		radioButton_11B.setBounds(487, 156, 35, 34);
		criaGabarito.add(radioButton_11B);
		
		JRadioButton radioButton_11C = new JRadioButton("C");
		buttonGroup_11.add(radioButton_11C);
		radioButton_11C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_11C.setBackground(Color.WHITE);
		radioButton_11C.setBounds(524, 156, 35, 34);
		criaGabarito.add(radioButton_11C);
		
		JRadioButton radioButton_11D = new JRadioButton("D");
		buttonGroup_11.add(radioButton_11D);
		radioButton_11D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_11D.setBackground(Color.WHITE);
		radioButton_11D.setBounds(561, 156, 35, 34);
		criaGabarito.add(radioButton_11D);
		
		JRadioButton radioButton_12A = new JRadioButton("A");
		buttonGroup_12.add(radioButton_12A);
		radioButton_12A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_12A.setBackground(Color.WHITE);
		radioButton_12A.setBounds(450, 193, 35, 34);
		criaGabarito.add(radioButton_12A);
		
		JRadioButton radioButton_12B = new JRadioButton("B");
		buttonGroup_12.add(radioButton_12B);
		radioButton_12B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_12B.setBackground(Color.WHITE);
		radioButton_12B.setBounds(487, 193, 35, 34);
		criaGabarito.add(radioButton_12B);
		
		JRadioButton radioButton_12C = new JRadioButton("C");
		buttonGroup_12.add(radioButton_12C);
		radioButton_12C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_12C.setBackground(Color.WHITE);
		radioButton_12C.setBounds(524, 193, 35, 34);
		criaGabarito.add(radioButton_12C);
		
		JRadioButton radioButton_12D = new JRadioButton("D");
		buttonGroup_12.add(radioButton_12D);
		radioButton_12D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_12D.setBackground(Color.WHITE);
		radioButton_12D.setBounds(561, 193, 35, 34);
		criaGabarito.add(radioButton_12D);
		
		JRadioButton radioButton_13A = new JRadioButton("A");
		buttonGroup_13.add(radioButton_13A);
		radioButton_13A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_13A.setBackground(Color.WHITE);
		radioButton_13A.setBounds(450, 230, 35, 34);
		criaGabarito.add(radioButton_13A);
		
		JRadioButton radioButton_13B = new JRadioButton("B");
		buttonGroup_13.add(radioButton_13B);
		radioButton_13B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_13B.setBackground(Color.WHITE);
		radioButton_13B.setBounds(487, 230, 35, 34);
		criaGabarito.add(radioButton_13B);
		
		JRadioButton radioButton_13C = new JRadioButton("C");
		buttonGroup_13.add(radioButton_13C);
		radioButton_13C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_13C.setBackground(Color.WHITE);
		radioButton_13C.setBounds(524, 230, 35, 34);
		criaGabarito.add(radioButton_13C);
		
		JRadioButton radioButton_13D = new JRadioButton("D");
		buttonGroup_13.add(radioButton_13D);
		radioButton_13D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_13D.setBackground(Color.WHITE);
		radioButton_13D.setBounds(561, 230, 35, 34);
		criaGabarito.add(radioButton_13D);
		
		JRadioButton radioButton_14A = new JRadioButton("A");
		buttonGroup_14.add(radioButton_14A);
		radioButton_14A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_14A.setBackground(Color.WHITE);
		radioButton_14A.setBounds(450, 267, 35, 34);
		criaGabarito.add(radioButton_14A);
		
		JRadioButton radioButton_14B = new JRadioButton("B");
		buttonGroup_14.add(radioButton_14B);
		radioButton_14B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_14B.setBackground(Color.WHITE);
		radioButton_14B.setBounds(487, 267, 35, 34);
		criaGabarito.add(radioButton_14B);
		
		JRadioButton radioButton_14C = new JRadioButton("C");
		buttonGroup_14.add(radioButton_14C);
		radioButton_14C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_14C.setBackground(Color.WHITE);
		radioButton_14C.setBounds(524, 267, 35, 34);
		criaGabarito.add(radioButton_14C);
		
		JRadioButton radioButton_14D = new JRadioButton("D");
		buttonGroup_14.add(radioButton_14D);
		radioButton_14D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_14D.setBackground(Color.WHITE);
		radioButton_14D.setBounds(561, 267, 35, 34);
		criaGabarito.add(radioButton_14D);
		
		JRadioButton radioButton_15A = new JRadioButton("A");
		buttonGroup_15.add(radioButton_15A);
		radioButton_15A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_15A.setBackground(Color.WHITE);
		radioButton_15A.setBounds(450, 304, 35, 34);
		criaGabarito.add(radioButton_15A);
		
		JRadioButton radioButton_15B = new JRadioButton("B");
		buttonGroup_15.add(radioButton_15B);
		radioButton_15B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_15B.setBackground(Color.WHITE);
		radioButton_15B.setBounds(487, 304, 35, 34);
		criaGabarito.add(radioButton_15B);
		
		JRadioButton radioButton_15C = new JRadioButton("C");
		buttonGroup_15.add(radioButton_15C);
		radioButton_15C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_15C.setBackground(Color.WHITE);
		radioButton_15C.setBounds(524, 304, 35, 34);
		criaGabarito.add(radioButton_15C);
		
		JRadioButton radioButton_15D = new JRadioButton("D");
		buttonGroup_15.add(radioButton_15D);
		radioButton_15D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_15D.setBackground(Color.WHITE);
		radioButton_15D.setBounds(561, 304, 35, 34);
		criaGabarito.add(radioButton_15D);
		
		JRadioButton radioButton_16A = new JRadioButton("A");
		buttonGroup_16.add(radioButton_16A);
		radioButton_16A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_16A.setBackground(Color.WHITE);
		radioButton_16A.setBounds(450, 341, 35, 34);
		criaGabarito.add(radioButton_16A);
		
		JRadioButton radioButton_16B = new JRadioButton("B");
		buttonGroup_16.add(radioButton_16B);
		radioButton_16B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_16B.setBackground(Color.WHITE);
		radioButton_16B.setBounds(487, 341, 35, 34);
		criaGabarito.add(radioButton_16B);
		
		JRadioButton radioButton_16C = new JRadioButton("C");
		buttonGroup_16.add(radioButton_16C);
		radioButton_16C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_16C.setBackground(Color.WHITE);
		radioButton_16C.setBounds(524, 341, 35, 34);
		criaGabarito.add(radioButton_16C);
		
		JRadioButton radioButton_16D = new JRadioButton("D");
		buttonGroup_16.add(radioButton_16D);
		radioButton_16D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_16D.setBackground(Color.WHITE);
		radioButton_16D.setBounds(561, 341, 35, 34);
		criaGabarito.add(radioButton_16D);
		
		JRadioButton radioButton_17A = new JRadioButton("A");
		buttonGroup_17.add(radioButton_17A);
		radioButton_17A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_17A.setBackground(Color.WHITE);
		radioButton_17A.setBounds(450, 378, 35, 34);
		criaGabarito.add(radioButton_17A);
		
		JRadioButton radioButton_17B = new JRadioButton("B");
		buttonGroup_17.add(radioButton_17B);
		radioButton_17B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_17B.setBackground(Color.WHITE);
		radioButton_17B.setBounds(487, 378, 35, 34);
		criaGabarito.add(radioButton_17B);
		
		JRadioButton radioButton_17C = new JRadioButton("C");
		buttonGroup_17.add(radioButton_17C);
		radioButton_17C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_17C.setBackground(Color.WHITE);
		radioButton_17C.setBounds(524, 378, 35, 34);
		criaGabarito.add(radioButton_17C);
		
		JRadioButton radioButton_17D = new JRadioButton("D");
		buttonGroup_17.add(radioButton_17D);
		radioButton_17D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_17D.setBackground(Color.WHITE);
		radioButton_17D.setBounds(561, 378, 35, 34);
		criaGabarito.add(radioButton_17D);
		
		JRadioButton radioButton_18A = new JRadioButton("A");
		buttonGroup_18.add(radioButton_18A);
		radioButton_18A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_18A.setBackground(Color.WHITE);
		radioButton_18A.setBounds(450, 415, 35, 34);
		criaGabarito.add(radioButton_18A);
		
		JRadioButton radioButton_18B = new JRadioButton("B");
		buttonGroup_18.add(radioButton_18B);
		radioButton_18B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_18B.setBackground(Color.WHITE);
		radioButton_18B.setBounds(487, 415, 35, 34);
		criaGabarito.add(radioButton_18B);
		
		JRadioButton radioButton_18C = new JRadioButton("C");
		buttonGroup_18.add(radioButton_18C);
		radioButton_18C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_18C.setBackground(Color.WHITE);
		radioButton_18C.setBounds(524, 415, 35, 34);
		criaGabarito.add(radioButton_18C);
		
		JRadioButton radioButton_18D = new JRadioButton("D");
		buttonGroup_18.add(radioButton_18D);
		radioButton_18D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_18D.setBackground(Color.WHITE);
		radioButton_18D.setBounds(561, 415, 35, 34);
		criaGabarito.add(radioButton_18D);
		
		JRadioButton radioButton_19A = new JRadioButton("A");
		buttonGroup_19.add(radioButton_19A);
		radioButton_19A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_19A.setBackground(Color.WHITE);
		radioButton_19A.setBounds(450, 452, 35, 34);
		criaGabarito.add(radioButton_19A);
		
		JRadioButton radioButton_19B = new JRadioButton("B");
		buttonGroup_19.add(radioButton_19B);
		radioButton_19B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_19B.setBackground(Color.WHITE);
		radioButton_19B.setBounds(487, 452, 35, 34);
		criaGabarito.add(radioButton_19B);
		
		JRadioButton radioButton_19C = new JRadioButton("C");
		buttonGroup_19.add(radioButton_19C);
		radioButton_19C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_19C.setBackground(Color.WHITE);
		radioButton_19C.setBounds(524, 452, 35, 34);
		criaGabarito.add(radioButton_19C);
		
		JRadioButton radioButton_19D = new JRadioButton("D");
		buttonGroup_19.add(radioButton_19D);
		radioButton_19D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_19D.setBackground(Color.WHITE);
		radioButton_19D.setBounds(561, 452, 35, 34);
		criaGabarito.add(radioButton_19D);
		
		JRadioButton radioButton_20A = new JRadioButton("A");
		buttonGroup_20.add(radioButton_20A);
		radioButton_20A.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_20A.setBackground(Color.WHITE);
		radioButton_20A.setBounds(450, 489, 35, 34);
		criaGabarito.add(radioButton_20A);
		
		JRadioButton radioButton_20B = new JRadioButton("B");
		buttonGroup_20.add(radioButton_20B);
		radioButton_20B.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_20B.setBackground(Color.WHITE);
		radioButton_20B.setBounds(487, 489, 35, 34);
		criaGabarito.add(radioButton_20B);
		
		JRadioButton radioButton_20C = new JRadioButton("C");
		buttonGroup_20.add(radioButton_20C);
		radioButton_20C.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_20C.setBackground(Color.WHITE);
		radioButton_20C.setBounds(524, 489, 35, 34);
		criaGabarito.add(radioButton_20C);
		
		JRadioButton radioButton_20D = new JRadioButton("D");
		buttonGroup_20.add(radioButton_20D);
		radioButton_20D.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		radioButton_20D.setBackground(Color.WHITE);
		radioButton_20D.setBounds(561, 489, 35, 34);
		criaGabarito.add(radioButton_20D);
		
		JLabel label = new JLabel("2)");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label.setBackground(Color.WHITE);
		label.setBounds(168, 193, 28, 34);
		criaGabarito.add(label);
		
		JLabel label_1 = new JLabel("3)");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(168, 230, 28, 34);
		criaGabarito.add(label_1);
		
		JLabel label_2 = new JLabel("4)");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(168, 267, 28, 34);
		criaGabarito.add(label_2);
		
		JLabel label_3 = new JLabel("5)");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(168, 304, 28, 34);
		criaGabarito.add(label_3);
		
		JLabel label_5 = new JLabel("6)");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(168, 341, 28, 34);
		criaGabarito.add(label_5);
		
		JLabel label_6 = new JLabel("7)");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(168, 378, 28, 34);
		criaGabarito.add(label_6);
		
		JLabel label_7 = new JLabel("8)");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(168, 415, 28, 34);
		criaGabarito.add(label_7);
		
		JLabel label_8 = new JLabel("9)");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(168, 452, 28, 34);
		criaGabarito.add(label_8);
		
		JLabel label_9 = new JLabel("10)");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(168, 489, 28, 34);
		criaGabarito.add(label_9);
		
		JLabel label_10 = new JLabel("11)");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(416, 156, 28, 34);
		criaGabarito.add(label_10);
		
		JLabel label_11 = new JLabel("12)");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(416, 193, 28, 34);
		criaGabarito.add(label_11);
		
		JLabel label_12 = new JLabel("13)");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(416, 230, 28, 34);
		criaGabarito.add(label_12);
		
		JLabel label_13 = new JLabel("14)");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(416, 267, 28, 34);
		criaGabarito.add(label_13);
		
		JLabel label_14 = new JLabel("15)");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(416, 304, 28, 34);
		criaGabarito.add(label_14);
		
		JLabel label_15 = new JLabel("16)");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(416, 341, 28, 34);
		criaGabarito.add(label_15);
		
		JLabel label_16 = new JLabel("17)");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(416, 378, 28, 34);
		criaGabarito.add(label_16);
		
		JLabel label_17 = new JLabel("18)");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(416, 415, 28, 34);
		criaGabarito.add(label_17);
		
		JLabel label_18 = new JLabel("19)");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(416, 452, 28, 34);
		criaGabarito.add(label_18);
		
		JLabel label_19 = new JLabel("20)");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(416, 489, 28, 34);
		criaGabarito.add(label_19);
		
		Button btnGerarGabarito = new Button("Criar");
		btnGerarGabarito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resps = "";
				
				////////// RESPS 1 A 5
				if(radioButton_1A.isSelected()) {
					resps = resps + "A";
				}
				if(radioButton_1B.isSelected()) {
					resps = resps + "B";
				}
				if(radioButton_1C.isSelected()) {
					resps = resps + "C";
				}
				if(radioButton_1D.isSelected()) {
					resps = resps + "D";
				}
				
				if(radioButton_2A.isSelected()) {
					resps = resps + "A";
				}
				if(radioButton_2B.isSelected()) {
					resps = resps + "B";
				}
				if(radioButton_2C.isSelected()) {
					resps = resps + "C";
				}
				if(radioButton_2D.isSelected()) {
					resps = resps + "D";
				}
				
				if(radioButton_3A.isSelected()) {
					resps = resps + "A";
				}
				if(radioButton_3B.isSelected()) {
					resps = resps + "B";
				}
				if(radioButton_3C.isSelected()) {
					resps = resps + "C";
				}
				if(radioButton_3D.isSelected()) {
					resps = resps + "D";
				}
				
				if(radioButton_4A.isSelected()) {
					resps = resps + "A";
				}
				if(radioButton_4B.isSelected()) {
					resps = resps + "B";
				}
				if(radioButton_4C.isSelected()) {
					resps = resps + "C";
				}
				if(radioButton_4D.isSelected()) {
					resps = resps + "D";
				}
				
				if(radioButton_5A.isSelected()) {
					resps = resps + "A";
				}
				if(radioButton_5B.isSelected()) {
					resps = resps + "B";
				}
				if(radioButton_5C.isSelected()) {
					resps = resps + "C";
				}
				if(radioButton_5D.isSelected()) {
					resps = resps + "D";
				}
		////////// RESPS 6 A 10
						if(radioButton_6A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_6B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_6C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_6D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_7A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_7B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_7C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_7D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_8A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_8B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_8C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_8D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_9A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_9B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_9C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_9D.isSelected()) {
							resps = resps + "D";
						}
						
				////////// RESPS 10 A 15
						if(radioButton_10A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_10B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_10C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_10D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_11A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_11B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_11C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_11D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_12A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_12B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_12C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_12D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_13A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_13B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_13C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_13D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_14A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_14B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_14C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_14D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_15A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_15B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_15C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_15D.isSelected()) {
							resps = resps + "D";
						}
							
						if(radioButton_15A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_15B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_15C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_15D.isSelected()) {
							resps = resps + "D";
						}
						///////// 16 a 20
						
						
						
						
						if(radioButton_16A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_16B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_16C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_16D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_17A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_17B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_17C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_17D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_18A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_18B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_18C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_18D.isSelected()) {
							resps = resps + "D";
						}
						
						if(radioButton_19A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_19B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_19C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_19D.isSelected()) {
							resps = resps + "D";
						}
						if(radioButton_20A.isSelected()) {
							resps = resps + "A";
						}
						if(radioButton_20B.isSelected()) {
							resps = resps + "B";
						}
						if(radioButton_20C.isSelected()) {
							resps = resps + "C";
						}
						if(radioButton_20D.isSelected()) {
							resps = resps + "D";
						}
						
						int aa = JOptionPane.showConfirmDialog(null, "Informações:\n\nRespostas: "+resps);
						System.out.println(aa);
						System.out.println(JOptionPane.OK_OPTION);
						if(aa == 0) {
							JOptionPane.showMessageDialog(null, "Inserido!");
							layeredPane.removeAll();
							layeredPane.add(home);
							layeredPane.repaint();
							layeredPane.revalidate();
						}
						
				
			}
		});
		btnGerarGabarito.setBounds(293, 562, 151, 34);
		criaGabarito.add(btnGerarGabarito);
		
		javax.swing.table.TableColumn tc = new javax.swing.table.TableColumn();
		tc.setHeaderValue("Coluna1");
		javax.swing.table.TableColumn tc2 = new javax.swing.table.TableColumn();
		tc.setHeaderValue("Coluna2");
		
		lblOsk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
				lblAlunos.setForeground(new Color(255, 255, 204));
				lblAlunos_1.setForeground(new Color(255, 255, 204));
				lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
				lblCorretor.setForeground(new Color(255,138,35));
				lblCursos.setForeground(new Color(255, 255, 204));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255,138,35));
				lblSair.setForeground(new Color(255, 255, 204));
			}
		});
		
		lblEfetuarCorrees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEfetuarCorrees.setForeground(new Color(255,138,35));
				
				lblAlunos.setForeground(new Color(255, 255, 204));
				lblAlunos_1.setForeground(new Color(255, 255, 204));
				lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
				lblCorretor.setForeground(new Color(255, 255, 204));
				lblCursos.setForeground(new Color(255, 255, 204));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255, 255, 204));
				lblSair.setForeground(new Color(255, 255, 204));
					
			}
		});
		
		lblCadastrarGabarito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
				lblAlunos.setForeground(new Color(255, 255, 204));
				lblAlunos_1.setForeground(new Color(255, 255, 204));
				lblCadastrarGabarito.setForeground(new Color(255,138,35));
				lblCorretor.setForeground(new Color(255, 255, 204));
				lblCursos.setForeground(new Color(255, 255, 204));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255, 255, 204));
				lblSair.setForeground(new Color(255, 255, 204));
				
				layeredPane.removeAll();
				layeredPane.add(gabarito);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				lblGabaritos.setForeground(new Color(0,0,51));
			}
		});
		
		lblAlunos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
				lblAlunos.setForeground(new Color(255,138,35));
				lblAlunos_1.setForeground(new Color(255, 255, 204));
				lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
				lblCorretor.setForeground(new Color(255, 255, 204));				
				lblCursos.setForeground(new Color(255, 255, 204));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255, 255, 204));
				lblSair.setForeground(new Color(255, 255, 204));
			}
		});
		
		lblCursos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
				lblAlunos.setForeground(new Color(255, 255, 204));
				lblAlunos_1.setForeground(new Color(255, 255, 204));
				lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
				lblCorretor.setForeground(new Color(255, 255, 204));				
				lblCursos.setForeground(new Color(255,138,35));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255, 255, 204));
				lblSair.setForeground(new Color(255, 255, 204));
			}
		});
		
		lblAlunos_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEfetuarCorrees.setForeground(new Color(255, 255, 204));
				lblAlunos.setForeground(new Color(255, 255, 204));
				lblAlunos_1.setForeground(new Color(255,138,35));
				lblCadastrarGabarito.setForeground(new Color(255, 255, 204));
				lblCorretor.setForeground(new Color(255, 255, 204));				
				lblCursos.setForeground(new Color(255, 255, 204));
				lblGabaritos.setForeground(new Color(255, 255, 204));
				lblOsk.setForeground(new Color(255, 255, 204));
				lblSair.setForeground(new Color(255, 255, 204));
			}
		});
		
	}
	
}
