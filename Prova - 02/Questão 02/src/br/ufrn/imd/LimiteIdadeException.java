package br.ufrn.imd;

public class LimiteIdadeException extends Exception{
	private String msg;
	
	public LimiteIdadeException(String msg){
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg(){
		return msg;
	}
}
