package br.com.geradorDeEncontro.controller;
import br.com.geradorDeEncontro.model.EncontroAleatorio;
import br.com.geradorDeEncontro.model.EncontroPlanejado;

public class CriadorDeEncontro{
	
	//Cria encontro planejado
	public boolean criaEncontro(String dificuldade, int nvlPlayer, int qtdPlayer, String terreno, boolean encontroUnico) { 
		if(dificuldade != null && qtdPlayer > 0 && nvlPlayer > 0) {
			EncontroPlanejado encontro = new EncontroPlanejado(dificuldade, nvlPlayer, qtdPlayer, terreno, encontroUnico);
			encontro.expPlayer();
			encontro.expMaxima();
			return true;
		}else {
			return false;
		}
	}
	
	//Cria encontro aleatorio
	public boolean criaEncontro(String dificuldade, int nvlPlayer, int qtdPlayer, boolean encontroUnico) { 
		if(dificuldade != null && qtdPlayer > 0 && nvlPlayer > 0) {
			EncontroAleatorio encontro = new EncontroAleatorio(dificuldade, nvlPlayer, qtdPlayer, encontroUnico);
			encontro.expPlayer();
			encontro.expMaxima();
			return true;
		}else {
			return false;
		}
	}
}
