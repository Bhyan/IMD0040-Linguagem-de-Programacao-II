package br.ufrn.imd.dominio;

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
