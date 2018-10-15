package br.ufrn.imd.dominio;

/*
 * @author Bryan Brito
 * @version 14.10.2018
 */
public class SeguroVida implements Tributavel{
	protected int numero;
	protected String beneficiado;
	protected double valor;
	protected double taxa;
	
	/*
	 * Default constructor for objects of the class SeguroVida.
	 */
	public SeguroVida() {
		numero = 0;
		beneficiado = "";
		valor = 0;
		taxa = 0;		
	}
	
	/*
	 * Parameterized constructor for objects of class SeguroVida.
	 * @param numero
	 * @param beneficiado
	 * @param valor
	 * @param taxa
	 */
	public SeguroVida(int numero, String beneficiado, double valor, double taxa) {
		this.numero = numero;
		this.beneficiado = beneficiado;
		this.valor = valor;
		this.taxa = taxa;
	}
	
	/*
	 * Method get of numero.
	 */
	public int getNumero() {
		return numero;
	}
	
	/*
	 * Method get of beneficiado.
	 */
	public String getBeneficiado() {
		return beneficiado;
	}
	
	/*
	 * Method get of valor.
	 */
	public double getValor() {
		return valor;
	}
	
	/*
	 * Method get of taxa.
	 */
	public double getTaxa() {
		return taxa;
	}
	
	/*
	 * Method set of beneficiado.
	 */
	public void setBeneficiado(String beneficiado) {
		this.beneficiado = beneficiado;
	}
	
	/*
	 * Method set of valor.
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/*
	 * Method set of taxa.
	 */
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.ufrn.imd.dominio.Tributavel#calcularTributos()
	 */
	@Override
	public double calcularTributos() {
		return 36.0;
	}
}
