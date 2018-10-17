package br.ufrn.imd;
import java.util.Random;

/*
 * Classe Javali
 * @author Bryan Brito
 * @version 15.10.2018
 */
public class Javali extends Animal{
	private int MAX_IDADE = 10;
	protected int idade;
	protected int velocidade;
	
	/*
	 * Construtor padrão da classe Javali.
	 */
	public Javali(){
		this.idade = 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#morrer()
	 */
	public void morrer(){
		vivo = false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#alimentar()
	 */
	public int alimentar(){
		Random rand = new Random();
		int alimento = rand.nextInt(8) + 1;
		
		if(idade >= 3 & idade <= 8){
			return alimento * idade;
		}
		else{
			return alimento;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#envelhecer(int)
	 */
	public void envelhecer(int anos){
		try{
			idade += anos;
			if(idade > MAX_IDADE) throw new LimiteIdadeException("Javali excedeu sua idade máxima!!");
		}
		catch(LimiteIdadeException erro){
			System.out.println(erro.getMsg());
			vivo = false;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#correr(int)
	 */
	public void correr(int velocidade){
		this.velocidade = velocidade;
	}
	
	/*
	 * Método get do atributo vivo.
	 */
	public boolean getVivo(){
		return vivo;
	}
	
	/*
	 * Método get do atributo idade.
	 */
	public int getIdade(){
		return idade;
	}
	
	/*
	 * Método get do atributo velocidade.
	 */
	public int getVelocidade(){
		return velocidade;
	}

}
