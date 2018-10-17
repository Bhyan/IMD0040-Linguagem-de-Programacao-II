package br.ufrn.imd;

/*
 * Classe de exception UppercaseException.
 * @author Bryan Brito
 * @version 17.10.2018
 */
public class UppercaseException extends Exception{
	private String msg;
	
	/*
	 * Construtor parametrizado.
	 * @param msg
	 */
	public UppercaseException(String msg) {
		this.msg = msg;
	}
	
	/*
	 * Método get do atributo msg.
	 */
	public String getMsg() {
		return msg;
	}
}
