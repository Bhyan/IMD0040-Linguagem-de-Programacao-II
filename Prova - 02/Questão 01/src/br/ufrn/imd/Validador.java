package br.ufrn.imd;

/*
 * Classe Validador.
 * @author Bryan Brito
 * @version 17.10.2018
 */
public class Validador {
	private String msg;
	
	/*
	 * Construtor parametrizado.
	 * @param msg
	 */
	public Validador(String msg) {
		this.msg = msg;
	}
	
	/*
	 * Validador de string.
	 * @return true ou false
	 */
	public boolean validarString() {
		String msgAux = msg.toUpperCase();
		boolean val = true;
		
		for(int i = 0; i < msg.length(); i ++) {
			try {
				if(msg.charAt(i) >= 48 & msg.charAt(i) <= 57) throw new NumerosException("Sua String possui números!!!!");
				if(msgAux.charAt(i) == msg.charAt(i)) throw new UppercaseException("Sua String possui letras maiúsculas !!!!");
			}
			catch(UppercaseException erro) {
				System.out.println(erro.getMsg());
				val = false;
			}
			catch(NumerosException erro) {
				System.out.println(erro.getMsg());
				val = false;
			}
		}
		
		return val;
		
	}
}
