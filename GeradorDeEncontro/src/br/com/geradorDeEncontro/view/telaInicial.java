package br.com.geradorDeEncontro.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class telaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEncontroAleatorio = new JButton("Encontro Aleat\u00F3rio");
		btnEncontroAleatorio.setBackground(Color.GREEN);
		btnEncontroAleatorio.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnEncontroAleatorio.setBounds(47, 37, 785, 186);
		contentPane.add(btnEncontroAleatorio);
		
		JButton btnEncontroPlanejado = new JButton("Encontro Planejado");
		btnEncontroPlanejado.setForeground(Color.WHITE);
		btnEncontroPlanejado.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnEncontroPlanejado.setBackground(Color.BLUE);
		btnEncontroPlanejado.setBounds(47, 263, 785, 186);
		contentPane.add(btnEncontroPlanejado);
	}
}
