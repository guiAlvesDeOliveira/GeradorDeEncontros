package br.com.geradorDeEncontro.model;

public class Encontro {

	private int dificuldade; // 1- Facil, 2 - Medio, 3 - Dificil, 4 - Mortal 
	private int qtdPlayer;
	private int nvlPlayer;
	
	public Encontro(int dificuldade, int qtdPlayer, int nvlPlayer) {
		super();
		this.dificuldade = dificuldade;
		this.qtdPlayer = qtdPlayer;
		this.nvlPlayer = nvlPlayer;
	}
	

	public Encontro() {
		super();
	}


	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getQtdPlayer() {
		return qtdPlayer;
	}

	public void setQtdPlayer(int qtdPlayer) {
		this.qtdPlayer = qtdPlayer;
	}

	public int getNvlPlayer() {
		return nvlPlayer;
	}

	public void setNvlPlayer(int nvlPlayer) {
		this.nvlPlayer = nvlPlayer;
	}
	
	
	
}
