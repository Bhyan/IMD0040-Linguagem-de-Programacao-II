package br.ufrn.imd.dominio;

/*
 * Classe ListaErro
 * @author Bryan Brito
 * @version 16.10.2018
 */
public class ListaErro extends Exception{
	private String msg;
	
	public ListaErro(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
