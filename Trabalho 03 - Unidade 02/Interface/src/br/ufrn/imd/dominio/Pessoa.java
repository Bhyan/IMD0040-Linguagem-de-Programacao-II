package br.ufrn.imd.dominio;

/*
 * @author Bryan Brito
 * @version 14.10.2018
 */
public class Pessoa implements Tributavel{
	protected String nome;
	protected double salario;
	protected ContaCorrente contaCorrente;
	protected SeguroVida seguro;
	
	/*
	 * Parameterized constructor for objects of class Pessoa.
	 * @param nome
	 * @param salario
	 * @param cc
	 * @param seguro
	 */
	public Pessoa(String nome, double salario, ContaCorrente cc, SeguroVida seguro) {

		this.nome = nome;
		this.salario = salario;
		this.contaCorrente = cc;
		this.seguro = seguro;
	}
	
	/*
	 * Method get of nome.
	 */
	public String getNome() {
		return nome;
	}
	
	/*
	 * Method get of salario.
	 */
	public double getSalario() {
		return salario;
	}
	
	/*
	 * Method get of contaCorrente.
	 */
	public ContaCorrente getConta() {
		return contaCorrente;
	}
	
	/*
	 * Method get of seguro.
	 */
	public SeguroVida getSeguro() {
		return seguro;
	}
	
	/*
	 * Method set of salario.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.dominio.Tributavel#calcularTributos()
	 */
	@Override
	public double calcularTributos() {
		return salario * 0.11;
	}
}