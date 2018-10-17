package br.ufrn.imd;

public class Teste {

	public static void main(String[] args) {
		Validador val = new Validador("teste");
		Validador val2 = new Validador("Teste1");
		
		if(val.validarString()) {
			System.out.println("Sua String foi validada!!!!");
		}
		
		if(val2.validarString()) {
			System.out.println("Sua String foi validada!!!!");
		}
	}

}
