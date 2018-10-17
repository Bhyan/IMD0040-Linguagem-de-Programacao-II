package br.ufrn.imd;

public class Simulacao {

	public static void main(String[] args) {
		Javali java = new Javali();
		Onca onca = new Onca();
		
		while(java.getVivo() & onca.getVivo()){
			java.envelhecer(1);
			onca.envelhecer(1);
			
			java.correr(java.alimentar());
			onca.correr(onca.alimentar());
			
			if(java.getVelocidade() > onca.getVelocidade()){
				java.envelhecer(2);
				onca.envelhecer(1);
			}
			else{
				java.morrer();
			}
		}
		
		System.out.println("Idade Javali: " + java.getIdade());
		System.out.println("Idade Onça: " + onca.getIdade());
	}

}
