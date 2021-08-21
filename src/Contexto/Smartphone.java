package Contexto;

import Interface.Especificacoes;

public class Smartphone {
	
	String modelo;
	String cor;
	
	Especificacoes especificacoes;
	
	public Smartphone(String modelo, String cor, Especificacoes especificacoes) {
		this.modelo = modelo;
		this.cor = cor;
		this.especificacoes = especificacoes;
	}

	@Override
	public String toString() {
		return "Smartphone: Modelo = " + modelo + ", Cor = " + cor + ", Especificacoes = " + especificacoes.toString();
	}
		
}

