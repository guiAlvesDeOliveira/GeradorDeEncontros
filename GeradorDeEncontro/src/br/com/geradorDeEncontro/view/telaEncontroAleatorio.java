package br.com.geradorDeEncontro.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class telaEncontroAleatorio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFQtdPlayer;
	private JTextField txtFNvlPlayer;
	private ButtonGroup bgDificuldade = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaEncontroAleatorio frame = new telaEncontroAleatorio();
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
	public telaEncontroAleatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDificuldade = new JPanel();
		panelDificuldade.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelDificuldade.setBounds(37, 119, 180, 91);
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
		lblDificuldade.setBounds(37, 94, 87, 14);
		contentPane.add(lblDificuldade);
		
		JLabel lblQtdPlayers = new JLabel("Quantidade de Players");
		lblQtdPlayers.setBounds(37, 26, 127, 14);
		contentPane.add(lblQtdPlayers);
		
		txtFQtdPlayer = new JTextField();
		txtFQtdPlayer.setColumns(10);
		txtFQtdPlayer.setBounds(37, 51, 127, 20);
		contentPane.add(txtFQtdPlayer);
		
		JLabel lblNvlPlayers = new JLabel("Nivel dos Players");
		lblNvlPlayers.setBounds(206, 26, 127, 14);
		contentPane.add(lblNvlPlayers);
		
		txtFNvlPlayer = new JTextField();
		txtFNvlPlayer.setColumns(10);
		txtFNvlPlayer.setBounds(206, 51, 127, 20);
		contentPane.add(txtFNvlPlayer);
		
		JButton btnGerarEncontro = new JButton("Gerar Encontro");
		btnGerarEncontro.setBounds(37, 221, 230, 48);
		contentPane.add(btnGerarEncontro);
		
		JTextPane textPane = new JTextPane();
		textPane.setVisible(false);
		textPane.setBounds(37, 288, 719, 190);
		contentPane.add(textPane);
		
		JCheckBox chbxEncontroUnico = new JCheckBox("Encontro Unico");
		chbxEncontroUnico.setBounds(236, 152, 97, 23);
		contentPane.add(chbxEncontroUnico);
		
		bgDificuldade.add(rdbtnFacil);
		bgDificuldade.add(rdbtnMedio);
		bgDificuldade.add(rdbtnDificil);
		bgDificuldade.add(rdbtnMortal);
		
		
		
		
		if (rdbtnFacil.isEnabled()) {
			
		}else if(rdbtnMedio.isEnabled()) {
			
		}else if(rdbtnDificil.isEnabled()) {
			
		}else if(rdbtnMortal.isEnabled()) {
			
		}
		
		
	}
}
