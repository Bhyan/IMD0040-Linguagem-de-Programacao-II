package br.ufrn.imd;

/*
 * Classe abstrata Animal.
 * @author Bryan Brito
 * @version 15.10.2018
 */
public abstract class Animal {
	protected boolean vivo = true;
	
	/*
	 * Método abstrato morrer.
	 */
	public abstract void morrer();
	
	/*
	 * Método abstrato alimentar.
	 */
	public abstract int alimentar();
	
	/*
	 * Método abstrato correr.
	 */
	public abstract void correr(int velocidade);
	
	/*
	 * Método abstrato envelhecer.
	 */
	public abstract void envelhecer(int anos);
	
}
