package br.ufrn.imd;

/*
 * Classe de exception NumerosException.
 * @author Bryan Brito
 * @version 17.10.2018
 */
public class NumerosException extends Exception{
	private String msg;
	
	/*
	 * Construtor parametrizado.
	 * @param msg
	 */
	public NumerosException(String msg) {
		this.msg = msg;
	}
	
	/*
	 * Método get do atributo msg.
	 */
	public String getMsg() {
		return msg;
	}

}
