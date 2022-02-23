package br.com.geradorDeEncontro.model;

public abstract class Encontro {

	private String dificuldade; 
	private int qtdPlayer;
	private int nvlPlayer;
	private int experienciaPlayer;
	private int experienciaMaxima;

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
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

	public int getExperienciaPlayer() {
		return experienciaPlayer;
	}

	public void setExperienciaPlayer(int experienciaPlayer) {
		this.experienciaPlayer = experienciaPlayer;
	}

	public int getExperienciaMaxima() {
		return experienciaMaxima;
	}

	public void setExperienciaMaxima(int experienciaMaxima) {
		this.experienciaMaxima = experienciaMaxima;
	}

	public void setNvlPlayer(int nvlPlayer) {
		this.nvlPlayer = nvlPlayer;
	}

	//Define a experiencia por nivel de cada jogador
	public void expPlayer() {
		if (this.getDificuldade() == "facil") {
			switch (getNvlPlayer()) {
			case 1:
				experienciaPlayer = 25;
				break;
			case 2:
				experienciaPlayer = 50;
				break;
			case 3:
				experienciaPlayer = 75;
				break;
			case 4:
				experienciaPlayer = 125;
				break;
			case 5:
				experienciaPlayer = 250;
				break;
			case 6:
				experienciaPlayer = 300;
				break;
			case 7:
				experienciaPlayer = 350;
				break;
			case 8:
				experienciaPlayer = 450;
				break;
			case 9:
				experienciaPlayer = 550;
				break;
			case 10:
				experienciaPlayer = 600;
				break;
			case 11:
				experienciaPlayer = 800;
				break;
			case 12:
				experienciaPlayer = 1000;
				break;
			case 13:
				experienciaPlayer = 1100;
				break;
			case 14:
				experienciaPlayer = 1250;
				break;
			case 15:
				experienciaPlayer = 1400;
				break;
			case 16:
				experienciaPlayer = 1600;
				break;
			case 17:
				experienciaPlayer = 2000;
				break;
			case 18:
				experienciaPlayer = 2100;
				break;
			case 19:
				experienciaPlayer = 2400;
				break;
			case 20:
				experienciaPlayer = 2800;
				break;
			}
		}else if (this.getDificuldade() == "medio") {
			switch (getNvlPlayer()) {
			case 1:
				experienciaPlayer = 50;
				break;
			case 2:
				experienciaPlayer = 100;
				break;
			case 3:
				experienciaPlayer = 150;
				break;
			case 4:
				experienciaPlayer = 250;
				break;
			case 5:
				experienciaPlayer = 500;
				break;
			case 6:
				experienciaPlayer = 600;
				break;
			case 7:
				experienciaPlayer = 750;
				break;
			case 8:
				experienciaPlayer = 900;
				break;
			case 9:
				experienciaPlayer = 1100;
				break;
			case 10:
				experienciaPlayer = 1200;
				break;
			case 11:
				experienciaPlayer = 1500;
				break;
			case 12:
				experienciaPlayer = 2000;
				break;
			case 13:
				experienciaPlayer = 2200;
				break;
			case 14:
				experienciaPlayer = 2500;
				break;
			case 15:
				experienciaPlayer = 2800;
				break;
			case 16:
				experienciaPlayer = 3200;
				break;
			case 17:
				experienciaPlayer = 3900;
				break;
			case 18:
				experienciaPlayer = 4200;
				break;
			case 19:
				experienciaPlayer = 4900;
				break;
			case 20:
				experienciaPlayer = 5700;
				break;
			}
		}else if (this.getDificuldade() == "dificil") {
				switch (getNvlPlayer()) {
				case 1:
					experienciaPlayer = 75;
					break;
				case 2:
					experienciaPlayer = 150;
					break;
				case 3:
					experienciaPlayer = 225;
					break;
				case 4:
					experienciaPlayer = 375;
					break;
				case 5:
					experienciaPlayer = 750;
					break;
				case 6:
					experienciaPlayer = 900;
					break;
				case 7:
					experienciaPlayer = 1100;
					break;
				case 8:
					experienciaPlayer = 1400;
					break;
				case 9:
					experienciaPlayer = 1600;
					break;
				case 10:
					experienciaPlayer = 1900;
					break;
				case 11:
					experienciaPlayer = 2400;
					break;
				case 12:
					experienciaPlayer = 3000;
					break;
				case 13:
					experienciaPlayer = 3400;
					break;
				case 14:
					experienciaPlayer = 3800;
					break;
				case 15:
					experienciaPlayer = 4300;
					break;
				case 16:
					experienciaPlayer = 4800;
					break;
				case 17:
					experienciaPlayer = 5900;
					break;
				case 18:
					experienciaPlayer = 6300;
					break;
				case 19:
					experienciaPlayer = 7300;
					break;
				case 20:
					experienciaPlayer = 8500;
					break;
				}
			}else if (this.getDificuldade()=="mortal") {
				switch (getNvlPlayer()) {
				case 1:
					experienciaPlayer = 100;
					break;
				case 2:
					experienciaPlayer = 200;
					break;
				case 3:
					experienciaPlayer = 400;
					break;
				case 4:
					experienciaPlayer = 500;
					break;
				case 5:
					experienciaPlayer = 1100;
					break;
				case 6:
					experienciaPlayer = 1400;
					break;
				case 7:
					experienciaPlayer = 1700;
					break;
				case 8:
					experienciaPlayer = 2100;
					break;
				case 9:
					experienciaPlayer = 2400;
					break;
				case 10:
					experienciaPlayer = 2800;
					break;
				case 11:
					experienciaPlayer = 3600;
					break;
				case 12:
					experienciaPlayer = 4500;
					break;
				case 13:
					experienciaPlayer = 5100;
					break;
				case 14:
					experienciaPlayer = 5700;
					break;
				case 15:
					experienciaPlayer = 6500;
					break;
				case 16:
					experienciaPlayer = 7200;
					break;
				case 17:
					experienciaPlayer = 8800;
					break;
				case 18:
					experienciaPlayer = 9500;
					break;
				case 19:
					experienciaPlayer = 10900;
					break;
				case 20:
					experienciaPlayer = 12700;
					break;
			}
			
		}
	}

	//Define a dificuldade maxima do encontro
	public void expMaxima() {
		
		experienciaMaxima = getExperienciaPlayer() * getQtdPlayer();
	}
	
	
	
}
