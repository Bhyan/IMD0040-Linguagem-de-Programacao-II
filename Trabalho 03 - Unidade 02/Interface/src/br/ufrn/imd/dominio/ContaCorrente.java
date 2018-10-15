package br.ufrn.imd.dominio;

/*
 * @author Bryan Brito
 * @version 14.10.2018
 */
public class ContaCorrente implements Tributavel{
	protected String agencia;
	protected String numero;
	protected double saldo;
	
	/*
	 * Default constructor for objects of the class ContaCorrente.
	 */
	public ContaCorrente() {
		agencia = "";
		numero = "";
		saldo = 0.0;
	}
	
	/*
	 * Parameterized constructor for objects of class ContaCorrente.
	 * @param agencia
	 * @param numero
	 * @param saldo
	 */
	public ContaCorrente(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/*
	 * Method cash out.
	 * @param valor
	 */
	public void sacar(double valor) {
		if(valor > 0 && saldo >= valor ) {
			saldo -= valor;
		}
		else if(valor <= 0) {
			System.out.println("Valor menor ou igual a zero.");
		}
		else if(valor > saldo) {
			System.out.println("Valor de saque maior que saldo.");
		}
	}
	
	/*
	 * Method deposit.
	 * @param valor
	 */
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor menor ou igual a zero.");
		}
	}
	
	/*
	 * Method transference.
	 * @param valor
	 * @param cc
	 */
	public boolean transferencia(double valor, ContaCorrente cc) {
		if(saldo >= valor) {
			sacar(valor);
			cc.depositar(valor);
			return true;
		}
		else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	/*
	 * Method get of agencia.
	 */
	public String getAgencia() {
		return agencia;
	}
	
	/*
	 * Method get of numero.
	 */
	public String getNumero() {
		return numero;
	}
	
	/*
	 * Method get of saldo.
	 */
	public double gerSaldo() {
		return saldo;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.dominio.Tributavel#calcularTributos()
	 */
	@Override
	public double calcularTributos(){
		return saldo * 0.055;
	}

}
