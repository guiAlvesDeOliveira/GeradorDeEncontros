package br.com.geradorDeEncontro.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import DAO.MonstroDAO;
import DTO.MonstroDTO;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaCadastroMonstro extends JFrame {

	private JPanel contentPane;
	private JTextField txtFNome;
	private JTextField txtFTipo;
	private JTextField txtFClasseArmadura;
	private JTextField txtFQtdDadoVida;
	private JTextField txtFVidaExtra;
	private JTextField txtFForca;
	private JTextField txtFDestreza;
	private JTextField txtFConstituicao;
	private JTextField txtFInteligencia;
	private JTextField txtFSabedoria;
	private JTextField txtFCarisma;
	private JTextField txtFTesteResistencia;
	private JTextField txtFPericias;
	private JTextField txtFResistencia;
	private JTextField txtFVulnerabilidade;
	private JTextField txtFImunidade;
	private JTextField txtFImunidadeCondicao;
	private JTextField txtFSentidos;
	private JTextField txtFLingua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastroMonstro frame = new telaCadastroMonstro();
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
	public telaCadastroMonstro() {
		setTitle("Cadastro de Monstro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(10, 11, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbTamanho = new JLabel("Tamanho");
		lbTamanho.setBounds(148, 11, 77, 14);
		contentPane.add(lbTamanho);
		
		JLabel lbTipo = new JLabel("Tipo");
		lbTipo.setBounds(428, 11, 46, 14);
		contentPane.add(lbTipo);
		
		JLabel lbClasseArmadura = new JLabel("Classe de Armadura");
		lbClasseArmadura.setBounds(290, 11, 128, 14);
		contentPane.add(lbClasseArmadura);
		
		JLabel lbDadoDeVida = new JLabel("Tipo Dado De Vida");
		lbDadoDeVida.setBounds(615, 11, 163, 14);
		contentPane.add(lbDadoDeVida);
		
		txtFNome = new JTextField();
		txtFNome.setBounds(10, 36, 128, 20);
		contentPane.add(txtFNome);
		txtFNome.setColumns(10);
		
		JComboBox cmbTamanho = new JComboBox();
		cmbTamanho.setModel(new DefaultComboBoxModel(new String[] {"tiny", "small", "medium", "huge", "gargantuan"}));
		cmbTamanho.setBounds(148, 36, 122, 20);
		contentPane.add(cmbTamanho);
		
		JComboBox cmbDadoDeVida = new JComboBox();
		cmbDadoDeVida.setModel(new DefaultComboBoxModel(new String[] {"d4", "d6", "d8", "d10", "d12", "d20", "d100"}));
		cmbDadoDeVida.setBounds(615, 36, 115, 20);
		contentPane.add(cmbDadoDeVida);
		
		txtFTipo = new JTextField();
		txtFTipo.setBounds(428, 36, 177, 20);
		contentPane.add(txtFTipo);
		txtFTipo.setColumns(10);
		
		txtFClasseArmadura = new JTextField();
		txtFClasseArmadura.setBounds(290, 36, 128, 20);
		contentPane.add(txtFClasseArmadura);
		txtFClasseArmadura.setColumns(10);
		
		JLabel lbQtdDadosVida = new JLabel("Quantidade de Dados de Vida");
		lbQtdDadosVida.setBounds(10, 67, 177, 14);
		contentPane.add(lbQtdDadosVida);
		
		txtFQtdDadoVida = new JTextField();
		txtFQtdDadoVida.setBounds(10, 92, 163, 20);
		contentPane.add(txtFQtdDadoVida);
		txtFQtdDadoVida.setColumns(10);
		
		JLabel lbVidaExtra = new JLabel("Vida Extra");
		lbVidaExtra.setBounds(197, 67, 73, 14);
		contentPane.add(lbVidaExtra);
		
		txtFVidaExtra = new JTextField();
		txtFVidaExtra.setBounds(197, 92, 86, 20);
		contentPane.add(txtFVidaExtra);
		txtFVidaExtra.setColumns(10);
		
		JPanel panelAtributos = new JPanel();
		panelAtributos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAtributos.setBounds(10, 123, 273, 176);
		contentPane.add(panelAtributos);
		panelAtributos.setLayout(null);
		
		JLabel lbForca = new JLabel("Forca");
		lbForca.setBounds(10, 11, 46, 14);
		panelAtributos.add(lbForca);
		
		txtFForca = new JTextField();
		txtFForca.setBounds(10, 36, 86, 20);
		panelAtributos.add(txtFForca);
		txtFForca.setColumns(10);
		
		txtFDestreza = new JTextField();
		txtFDestreza.setBounds(153, 36, 86, 20);
		panelAtributos.add(txtFDestreza);
		txtFDestreza.setColumns(10);
		
		JLabel lbDestreza = new JLabel("Destreza");
		lbDestreza.setBounds(153, 11, 46, 14);
		panelAtributos.add(lbDestreza);
		
		JLabel lbConstituicao = new JLabel("Constituicao");
		lbConstituicao.setBounds(10, 67, 86, 14);
		panelAtributos.add(lbConstituicao);
		
		JLabel lbSabedoria = new JLabel("Sabedoria");
		lbSabedoria.setBounds(10, 121, 86, 14);
		panelAtributos.add(lbSabedoria);
		
		txtFConstituicao = new JTextField();
		txtFConstituicao.setBounds(10, 92, 86, 20);
		panelAtributos.add(txtFConstituicao);
		txtFConstituicao.setColumns(10);
		
		txtFInteligencia = new JTextField();
		txtFInteligencia.setBounds(153, 92, 86, 20);
		panelAtributos.add(txtFInteligencia);
		txtFInteligencia.setColumns(10);
		
		JLabel lbInteligencia = new JLabel("Inteligencia");
		lbInteligencia.setBounds(153, 67, 86, 14);
		panelAtributos.add(lbInteligencia);
		
		txtFSabedoria = new JTextField();
		txtFSabedoria.setBounds(10, 146, 86, 20);
		panelAtributos.add(txtFSabedoria);
		txtFSabedoria.setColumns(10);
		
		txtFCarisma = new JTextField();
		txtFCarisma.setBounds(153, 146, 86, 20);
		panelAtributos.add(txtFCarisma);
		txtFCarisma.setColumns(10);
		
		JLabel lbCarisma = new JLabel("Carisma");
		lbCarisma.setBounds(153, 121, 86, 14);
		panelAtributos.add(lbCarisma);
		
		JLabel lbTesteResistencia = new JLabel("Teste de Resistencia");
		lbTesteResistencia.setBounds(290, 67, 128, 14);
		contentPane.add(lbTesteResistencia);
		
		txtFTesteResistencia = new JTextField();
		txtFTesteResistencia.setBounds(290, 92, 128, 20);
		contentPane.add(txtFTesteResistencia);
		txtFTesteResistencia.setColumns(10);
		
		JLabel lbPericias = new JLabel("Pericias");
		lbPericias.setBounds(428, 67, 46, 14);
		contentPane.add(lbPericias);
		
		txtFPericias = new JTextField();
		txtFPericias.setBounds(428, 92, 302, 20);
		contentPane.add(txtFPericias);
		txtFPericias.setColumns(10);
		
		JLabel lbResistencia = new JLabel("Resistencia");
		lbResistencia.setBounds(429, 123, 108, 14);
		contentPane.add(lbResistencia);
		
		txtFResistencia = new JTextField();
		txtFResistencia.setBounds(428, 148, 109, 20);
		contentPane.add(txtFResistencia);
		txtFResistencia.setColumns(10);
		
		JLabel lbVulnerabilidade = new JLabel("Vulnerabilidade");
		lbVulnerabilidade.setBounds(290, 123, 108, 14);
		contentPane.add(lbVulnerabilidade);
		
		txtFVulnerabilidade = new JTextField();
		txtFVulnerabilidade.setBounds(290, 148, 128, 20);
		contentPane.add(txtFVulnerabilidade);
		txtFVulnerabilidade.setColumns(10);
		
		JLabel lbImunidade = new JLabel("Imunidade");
		lbImunidade.setBounds(547, 123, 108, 14);
		contentPane.add(lbImunidade);
		
		txtFImunidade = new JTextField();
		txtFImunidade.setBounds(547, 148, 108, 20);
		contentPane.add(txtFImunidade);
		txtFImunidade.setColumns(10);
		
		JLabel lbImunidadeCondicao = new JLabel("Imunidade De Condi\u00E7\u00E3o");
		lbImunidadeCondicao.setBounds(290, 179, 146, 14);
		contentPane.add(lbImunidadeCondicao);
		
		txtFImunidadeCondicao = new JTextField();
		txtFImunidadeCondicao.setBounds(290, 204, 128, 20);
		contentPane.add(txtFImunidadeCondicao);
		txtFImunidadeCondicao.setColumns(10);
		
		JLabel lbSentidos = new JLabel("Sentidos");
		lbSentidos.setBounds(428, 179, 108, 14);
		contentPane.add(lbSentidos);
		
		txtFSentidos = new JTextField();
		txtFSentidos.setBounds(428, 204, 109, 20);
		contentPane.add(txtFSentidos);
		txtFSentidos.setColumns(10);
		
		JLabel lbLingua = new JLabel("Lingua");
		lbLingua.setBounds(547, 179, 46, 14);
		contentPane.add(lbLingua);
		
		txtFLingua = new JTextField();
		txtFLingua.setBounds(547, 204, 108, 20);
		contentPane.add(txtFLingua);
		txtFLingua.setColumns(10);
		
		JLabel lbDificuldade = new JLabel("Dificuldade");
		lbDificuldade.setBounds(290, 235, 128, 14);
		contentPane.add(lbDificuldade);
		
		JComboBox cmbDificuldade = new JComboBox();
		cmbDificuldade.setModel(new DefaultComboBoxModel(new String[] {"1/4", "1/2", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		cmbDificuldade.setBounds(290, 260, 128, 22);
		contentPane.add(cmbDificuldade);
		
		JLabel lbAcoes = new JLabel("A\u00E7\u00F5es");
		lbAcoes.setBounds(10, 310, 163, 14);
		contentPane.add(lbAcoes);
		
		JTextPane txtPAcoes = new JTextPane();
		txtPAcoes.setToolTipText("");
		txtPAcoes.setBounds(10, 330, 273, 114);
		contentPane.add(txtPAcoes);
		
		JLabel lbMagias = new JLabel("Magias");
		lbMagias.setBounds(290, 310, 273, 14);
		contentPane.add(lbMagias);
		
		JTextPane txtPMagia = new JTextPane();
		txtPMagia.setText("");
		txtPMagia.setBounds(290, 330, 273, 114);
		contentPane.add(txtPMagia);
		
		JLabel lbAcoesLendarias = new JLabel("A\u00E7\u00F5es Lend\u00E1rias");
		lbAcoesLendarias.setBounds(573, 310, 157, 14);
		contentPane.add(lbAcoesLendarias);
		
		JTextPane txtPAcoesLendarias = new JTextPane();
		txtPAcoesLendarias.setBounds(573, 330, 157, 114);
		contentPane.add(txtPAcoesLendarias);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int classeDeArmadura, qtdDadosVida, vidaExtra, forca, destreza, constituicao, inteligencia, sabedoria, carisma;
				//dificuldade;
				float dificuldade;
				String nome, tamanho, tipo, dadoDeVida, testeResistencia, pericias, vulnerabilidades, resistencia, imunidade, imunidadeCondicao,
				sentidos, lingua, acoes, magias, acoesLendarias, dificuldadeConvertida;
				
				nome = txtFNome.getText();
				tamanho = cmbTamanho.getSelectedItem().toString();
				tipo = txtFTipo.getText();
				dadoDeVida = cmbDadoDeVida.getSelectedItem().toString();
				testeResistencia = txtFTesteResistencia.getText();
				pericias = txtFPericias.getText();
				vulnerabilidades = txtFVulnerabilidade.getText();
				resistencia = txtFResistencia.getText();
				imunidade = txtFImunidade.getText();
				imunidadeCondicao = txtFImunidadeCondicao.getText();
				sentidos = txtFSentidos.getText();
				lingua = txtFLingua.getText();
				acoes = txtPAcoes.getText();
				magias = txtPMagia.getText();
				acoesLendarias = txtPAcoesLendarias.getText();
				
				classeDeArmadura = Integer.parseInt(txtFClasseArmadura.getText());
				qtdDadosVida = Integer.parseInt(txtFQtdDadoVida.getText());
				vidaExtra = Integer.parseInt(txtFVidaExtra.getText());
				forca = Integer.parseInt(txtFForca.getText());
				destreza = Integer.parseInt(txtFDestreza.getText());
				constituicao = Integer.parseInt(txtFConstituicao.getText());
				inteligencia = Integer.parseInt(txtFInteligencia.getText());
				sabedoria = Integer.parseInt(txtFSabedoria.getText());
				carisma = Integer.parseInt(txtFCarisma.getText());
				if (cmbDificuldade.getSelectedItem() == "1/4" || cmbDificuldade.getSelectedItem()== "1/2") {
					if (cmbDificuldade.getSelectedItem() == "1/4") {
						dificuldadeConvertida = "0.25f";
					}else {
						dificuldadeConvertida = "0.5f";
					}
				}else {
					dificuldadeConvertida = cmbDificuldade.getSelectedItem().toString();
				}
				dificuldade = Float.parseFloat(dificuldadeConvertida);
				
				MonstroDTO objMonstroDTO = new MonstroDTO();
				objMonstroDTO.setNome(nome);
				objMonstroDTO.setTamanho(tamanho);
				objMonstroDTO.setTipo(tipo);
				objMonstroDTO.setDadoDeVida(dadoDeVida);
				objMonstroDTO.setTesteResistencia(testeResistencia);
				objMonstroDTO.setPericias(pericias);
				objMonstroDTO.setVulnerabilidades(vulnerabilidades);
				objMonstroDTO.setResistencia(resistencia);
				objMonstroDTO.setImunidade(imunidade);
				objMonstroDTO.setImunidadeCondicao(imunidadeCondicao);
				objMonstroDTO.setSentidos(sentidos);
				objMonstroDTO.setLingua(lingua);
				objMonstroDTO.setAcoes(acoesLendarias);
				objMonstroDTO.setMagias(magias);
				objMonstroDTO.setAcoesLendarias(acoesLendarias);
				objMonstroDTO.setClasseDeArmadura(classeDeArmadura);
				objMonstroDTO.setQtdDadosVida(qtdDadosVida);
				objMonstroDTO.setVidaExtra(vidaExtra);
				objMonstroDTO.setForca(forca);
				objMonstroDTO.setDestreza(destreza);
				objMonstroDTO.setConstituicao(constituicao);
				objMonstroDTO.setInteligencia(inteligencia);
				objMonstroDTO.setSabedoria(sabedoria);
				objMonstroDTO.setCarisma(carisma);
				objMonstroDTO.setDificuldade(dificuldade);
				
				MonstroDAO objMonstroDAO = new MonstroDAO();
				objMonstroDAO.cadastrarMonstro(objMonstroDTO);
				
			}
		});
		btnCadastrar.setBounds(290, 467, 169, 35);
		contentPane.add(btnCadastrar);
		
		
		}

	
}
