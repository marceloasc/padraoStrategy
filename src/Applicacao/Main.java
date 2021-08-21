package Applicacao;

import Contexto.Smartphone;
import EntidadesConcretas.Especificacoes1;
import EntidadesConcretas.Especificacoes2;

public class Main {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("A", "Preto", new Especificacoes1());
		Smartphone s2 = new Smartphone("B", "Branco", new Especificacoes2());
		
	}

}
