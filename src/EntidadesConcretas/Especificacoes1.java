package EntidadesConcretas;

import Interface.Especificacoes;

public class Especificacoes1 implements Especificacoes {
	
	private int ram;
	private int memoria;


	public Especificacoes1() {
	}

	@Override
	public void opcoes() {
		this.ram = 6;
		this.memoria = 128;
	}

	@Override
	public String toString() {
		return " RAM: " + ram  + ", Memoria: " + memoria;
	}

}
