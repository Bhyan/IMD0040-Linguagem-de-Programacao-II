package br.ufrn.imd.dominio;

/*
 * @author Bryan Brito
 * @version 15.10.2018
 */
public class GeradorImpostoRenda {
	protected double totalTributo;
	
	/*
	 * 
	 */
	public GeradorImpostoRenda(double tributoSalario, double tributoConta, double tributoSeguro) {
		this.totalTributo = tributoSalario + tributoConta + tributoSeguro;
	}
	
	public double calcularValorTotalTributo() {
		return totalTributo;
	}
}
