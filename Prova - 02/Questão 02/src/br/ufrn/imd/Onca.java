package br.ufrn.imd;
import java.util.Random;

/*
 * Classe Onça
 * @author Bryan Brito
 * @version 15.10.2018
 */
public class Onca extends Animal{
	private int MAX_IDADE = 25;
	protected int idade;
	protected int velocidade;
	
	/*
	 * Construtor padrão da classe Onça.
	 */
	public Onca(){
		this.idade = 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#morrer()
	 */
	public void morrer(){
		super.vivo = false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.Animal#alimentar()
	 */
	public int alimentar(){
		Random rand = new Random();
		int alimento = rand.nextInt(8) + 1;
		
		if(idade >= 12 & idade <= 22){
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
			if(idade > MAX_IDADE) throw new LimiteIdadeException("Onça excedeu sua idade máxima!!");
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
