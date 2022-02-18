package br.com.geradorDeEncontro.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class telaEncontroPlanejado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFQtdPlayer;
	private JTextField txtFNvlPlayer;
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaEncontroPlanejado frame = new telaEncontroPlanejado();
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
	public telaEncontroPlanejado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtFQtdPlayer = new JTextField();
		txtFQtdPlayer.setBounds(56, 61, 127, 20);
		contentPane.add(txtFQtdPlayer);
		txtFQtdPlayer.setColumns(10);
		
		JLabel lblQtdPlayers = new JLabel("Quantidade de Players");
		lblQtdPlayers.setBounds(56, 36, 127, 14);
		contentPane.add(lblQtdPlayers);
		
		JPanel panelDificuldade = new JPanel();
		panelDificuldade.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelDificuldade.setBounds(56, 117, 180, 91);
		contentPane.add(panelDificuldade);
		panelDificuldade.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnFacil = new JRadioButton("Facil");
		panelDificuldade.add(rdbtnFacil);
		
		JRadioButton rdbtnMedio = new JRadioButton("Medio");
		panelDificuldade.add(rdbtnMedio);
		
		JRadioButton rdbtnDificil = new JRadioButton("Dificil");
		panelDificuldade.add(rdbtnDificil);
		
		JRadioButton rdbtnMortal = new JRadioButton("Mortal");
		panelDificuldade.add(rdbtnMortal);
		
		JLabel lblDificuldade = new JLabel("Dificuldade");
		lblDificuldade.setBounds(66, 92, 87, 14);
		contentPane.add(lblDificuldade);
		
		JButton btnGerarEncontro = new JButton("Gerar Encontro");
		btnGerarEncontro.setBounds(56, 226, 230, 48);
		contentPane.add(btnGerarEncontro);
		
		JPanel panelTerrenos = new JPanel();
		panelTerrenos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTerrenos.setBounds(469, 36, 306, 223);
		contentPane.add(panelTerrenos);
		panelTerrenos.setLayout(new BoxLayout(panelTerrenos, BoxLayout.X_AXIS));
		
		JRadioButton rdbtnCidade = new JRadioButton("Cidade");
		panelTerrenos.add(rdbtnCidade);
		
		JRadioButton rdbtnPantano = new JRadioButton("Pantano");
		panelTerrenos.add(rdbtnPantano);
		
		JRadioButton rdbtnFloresta = new JRadioButton("Floresta");
		panelTerrenos.add(rdbtnFloresta);
		
		JRadioButton rdbtnPlanice = new JRadioButton("Planice");
		panelTerrenos.add(rdbtnPlanice);
		
		JLabel lblNvlPlayers = new JLabel("Nivel dos Players");
		lblNvlPlayers.setBounds(225, 36, 127, 14);
		contentPane.add(lblNvlPlayers);
		
		txtFNvlPlayer = new JTextField();
		txtFNvlPlayer.setColumns(10);
		txtFNvlPlayer.setBounds(225, 61, 127, 20);
		contentPane.add(txtFNvlPlayer);
		
		JTextPane textPane = new JTextPane();
		textPane.setVisible(false);
		textPane.setBounds(56, 298, 719, 190);
		contentPane.add(textPane);
		
		JCheckBox chbxEncontroUnico = new JCheckBox("Encontro Unico");
		chbxEncontroUnico.setBounds(255, 117, 97, 23);
		contentPane.add(chbxEncontroUnico);
		
		bg.add(rdbtnFacil);
		bg.add(rdbtnMedio);
		bg.add(rdbtnDificil);
		bg.add(rdbtnMortal);
		
	}
}
