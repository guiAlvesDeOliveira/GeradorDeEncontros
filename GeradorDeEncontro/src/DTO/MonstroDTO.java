package DTO;

public class MonstroDTO {

	private int id, classeDeArmadura, qtdDadosVida, vidaExtra, forca, destreza, constituicao, inteligencia, sabedoria, carisma;
	private float dificuldade;
	private String nome, tamanho, tipo, dadoDeVida, testeResistencia, pericias, vulnerabilidades, resistencia, imunidade, imunidadeCondicao,
		sentidos, lingua, acoes, magias, acoesLendarias;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClasseDeArmadura() {
		return classeDeArmadura;
	}
	public void setClasseDeArmadura(int classeDeArmadura) {
		this.classeDeArmadura = classeDeArmadura;
	}
	public int getQtdDadosVida() {
		return qtdDadosVida;
	}
	public void setQtdDadosVida(int qtdDadosVida) {
		this.qtdDadosVida = qtdDadosVida;
	}
	public int getVidaExtra() {
		return vidaExtra;
	}
	public void setVidaExtra(int vidaExtra) {
		this.vidaExtra = vidaExtra;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	public float getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(float dificuldade) {
		this.dificuldade = dificuldade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDadoDeVida() {
		return dadoDeVida;
	}
	public void setDadoDeVida(String dadoDeVida) {
		this.dadoDeVida = dadoDeVida;
	}
	public String getTesteResistencia() {
		return testeResistencia;
	}
	public void setTesteResistencia(String testeResistencia) {
		this.testeResistencia = testeResistencia;
	}
	public String getPericias() {
		return pericias;
	}
	public void setPericias(String pericias) {
		this.pericias = pericias;
	}
	public String getVulnerabilidades() {
		return vulnerabilidades;
	}
	public void setVulnerabilidades(String vulnerabilidades) {
		this.vulnerabilidades = vulnerabilidades;
	}
	public String getResistencia() {
		return resistencia;
	}
	public void setResistencia(String resistencia) {
		this.resistencia = resistencia;
	}
	public String getImunidade() {
		return imunidade;
	}
	public void setImunidade(String imunidade) {
		this.imunidade = imunidade;
	}
	public String getImunidadeCondicao() {
		return imunidadeCondicao;
	}
	public void setImunidadeCondicao(String imunidadeCondicao) {
		this.imunidadeCondicao = imunidadeCondicao;
	}
	public String getSentidos() {
		return sentidos;
	}
	public void setSentidos(String sentidos) {
		this.sentidos = sentidos;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public String getAcoes() {
		return acoes;
	}
	public void setAcoes(String acoes) {
		this.acoes = acoes;
	}
	public String getMagias() {
		return magias;
	}
	public void setMagias(String magias) {
		this.magias = magias;
	}
	public String getAcoesLendarias() {
		return acoesLendarias;
	}
	public void setAcoesLendarias(String acoesLendarias) {
		this.acoesLendarias = acoesLendarias;
	}
	
	
	public void acertaDificuldade() {
		int condicao = Math.round(dificuldade);
		
		switch (condicao) {
		case 1: 
			dificuldade = 200;
			break;
		case 2:
			dificuldade = 450;
			break;
		case 3:
			dificuldade = 700;
			break;
		case 4:
			dificuldade = 1100;
			break;
		case 5:
			dificuldade = 1800;
			break;
		case 6:
			dificuldade = 2300;
			break;
		case 7:
			dificuldade = 2900;
			break;
		case 8:
			dificuldade = 3900;
			break;
		case 9:
			dificuldade = 5000;
			break;
		case 10:
			dificuldade = 5900;
			break;
		case 11:
			dificuldade = 7200;
			break;
		case 12:
			dificuldade = 8400;
			break;
		case 13:
			dificuldade = 10000;
			break;
		case 14:
			dificuldade = 11500;
			break;
		case 15:
			dificuldade = 13000;
			break;
		case 16:
			dificuldade = 15000;
			break;
		case 17:
			dificuldade = 18000;
			break;
		case 18:
			dificuldade = 20000;
			break;
		case 19:
			dificuldade = 22000;
			break;
		case 20:
			dificuldade = 25000;
			break;
		case 21:
			dificuldade = 33000;
			break;
		case 22:
			dificuldade = 41000;
			break;
		case 23:
			dificuldade = 50000;
			break;
		case 24:
			dificuldade = 62000;
			break;
		case 25:
			dificuldade = 75000;
			break;
		case 26:
			dificuldade = 90000;
			break;
		case 27:
			dificuldade = 105000;
			break;
		case 28:
			dificuldade = 120000;
			break;
		case 29:
			dificuldade = 135000;
			break;
		case 30:
			dificuldade = 155000;
			break;
		default:
			if (dificuldade == 0.125f) {
				dificuldade = 25;
			}else if (dificuldade == 0.25f) {
				dificuldade = 50;
			}else if (dificuldade == 0.5f) {
				dificuldade = (int) 100;
			}
		}
	}
	
	
	
}
