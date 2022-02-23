package br.com.geradorDeEncontro.controller;
import br.com.geradorDeEncontro.model.Encontro;

public class CalculadoraDeDificuldade {
	
	public boolean DefineDificuldade(String dificuldade, int nvlPlayer, int qtdPlayer) {
		
		if(dificuldade != null && qtdPlayer > 0 && nvlPlayer > 0) {
			Encontro encontro = new Encontro(dificuldade, nvlPlayer, qtdPlayer);
			return true;
		}else {
			return false;
		}
	}
	
	public void CalculaExperienciaPlayer() {
		
	}
	
	public void CalclulaExperienciaMonstro() {
		
	}
}
