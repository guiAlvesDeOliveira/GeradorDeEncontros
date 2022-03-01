package br.com.geradorDeEncontro.controller;

import java.util.Random;

public interface IRoladorDeDados {

	public default int rolarD4() {
		Random rolar = new Random();
		int dado = rolar.nextInt(4) + 1;
		return dado;
	};
	
	public default int rolarD6() {
		Random rolar = new Random();
		int dado = rolar.nextInt(6) + 1;
		return dado;
	};
	
	public default int rolarD8() {
		Random rolar = new Random();
		int dado = rolar.nextInt(8) + 1;
		return dado;
	};
	
	public default int roldarD10() {
		Random rolar = new Random();
		int dado = rolar.nextInt(10) + 1;
		return dado;
	};
	
	public default int rolarD12() {
		Random rolar = new Random();
		int dado = rolar.nextInt(12) + 1;
		return dado;
	};
	
	public default int rolarD20() {
		Random rolar = new Random();
		int dado = rolar.nextInt(20) + 1;
		return dado;
	};
	
	public default int rolarD100() {
		Random rolar = new Random();
		int dado = rolar.nextInt(100) + 1;
		return dado;
	};

	
	
}
