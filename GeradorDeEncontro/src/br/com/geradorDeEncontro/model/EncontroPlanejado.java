package br.com.geradorDeEncontro.model;

public class EncontroPlanejado extends Encontro{

	private boolean encontroUnico;
	private String terreno;
	
	public EncontroPlanejado(String dificuldade, int qtdPlayer, int nvlPlayer, String terreno, boolean encontroUnico) {
		setDificuldade(dificuldade);;
		setQtdPlayer(qtdPlayer);
		setNvlPlayer(nvlPlayer);
		setTerreno(terreno);
		setEncontroUnico(encontroUnico);
	}
	
	public boolean isEncontroUnico() {
		return encontroUnico;
	}


	public void setEncontroUnico(boolean encontroUnico) {
		this.encontroUnico = encontroUnico;
	}


	public String getTerreno() {
		return terreno;
	}


	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}


	
}
