package EntidadesConcretas;

import Interface.Especificacoes;

public class Especificacoes2 implements Especificacoes {
	
	int ram;
	int memoria;
	
	
	public Especificacoes2() {
	}

	@Override
	public void opcoes() {
		ram = 8;
		memoria = 256;
		
	}

	@Override
	public String toString() {
		return " RAM: " + ram + ", Memoria: " + memoria;
	}
	
}
