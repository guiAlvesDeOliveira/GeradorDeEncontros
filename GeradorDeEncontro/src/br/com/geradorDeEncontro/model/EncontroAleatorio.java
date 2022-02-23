package br.com.geradorDeEncontro.model;

public class EncontroAleatorio extends Encontro{

	private boolean encontroUnico;
	
	public EncontroAleatorio(String dificuldade, int qtdPlayer, int nvlPlayer, boolean encontroUnico) {
		setDificuldade(dificuldade);
		setQtdPlayer(qtdPlayer);
		setNvlPlayer(nvlPlayer);
		setEncontroUnico(encontroUnico);
	}

	public boolean isEncontroUnico() {
		return encontroUnico;
	}

	public void setEncontroUnico(boolean encontroUnico) {
		this.encontroUnico = encontroUnico;
	}
	
	
	
}
