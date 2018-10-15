package br.ufrn.imd.controle;
import java.util.ArrayList;

import br.ufrn.imd.dominio.GeradorImpostoRenda;
import br.ufrn.imd.dominio.Pessoa;

/*
 * @author Bryan Brito
 * @version 15.10.2018
 */
public class DAOPessoa {
	ArrayList <Pessoa> pessoas = new ArrayList <Pessoa> ();
	
	/*
	 * Cadastre of people.
	 * @param pessoa
	 */
	public void cadastraPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	/*
	 * List people.
	 */
	public void listaPessoa() {
		for(Pessoa pessoa: pessoas) {
			GeradorImpostoRenda imposto = new GeradorImpostoRenda(pessoa.calcularTributos(), pessoa.getConta().calcularTributos(), pessoa.getSeguro().calcularTributos());
			System.out.println("***********************************************************");
			System.out.println("Nome...: " + pessoa.getNome() + " Salário.: " + pessoa.getSalario());
			System.out.println("Agência: " + pessoa.getConta().getAgencia() + " Conta.: " + pessoa.getConta().getNumero() + "       Saldo.: " + pessoa.getConta().gerSaldo());
			System.out.println("Seguro.: " + pessoa.getSeguro().getNumero() + "     Beneficiário.: " + pessoa.getSeguro().getBeneficiado());
			System.out.println("***********************************************************");
			System.out.println("IRPF...: " + imposto.calcularValorTotalTributo());
		}
	}
}
