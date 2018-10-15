package br.ufrn.imd.visao;

import br.ufrn.imd.controle.DAOPessoa;
import br.ufrn.imd.dominio.ContaCorrente;
import br.ufrn.imd.dominio.Pessoa;
import br.ufrn.imd.dominio.SeguroVida;

public class Principal {

	public static void main(String[] args) {
		DAOPessoa pessoa = new DAOPessoa();
		
		SeguroVida seguro = new SeguroVida(1, "Maria", 150.0, 30.0);
		ContaCorrente cc = new ContaCorrente("1020-5", "100.231-1", 150.0);
		Pessoa joao = new Pessoa("Roberto", 500.0, cc, seguro);
		
		pessoa.cadastraPessoa(joao);

		seguro = new SeguroVida(1, "João", 150.0, 30.0);
		cc = new ContaCorrente("2105-4", "123.564-9", 300.0);
		Pessoa maria = new Pessoa("Madona", 1000.0, cc, seguro);
		
		pessoa.cadastraPessoa(maria);
		
		seguro = new SeguroVida(1, "Maria", 150.0, 30.0);
		cc = new ContaCorrente("1023-5", "100.233-1", 200.0);
		Pessoa jesus = new Pessoa("Jesus", 700.0, cc, seguro);
		
		pessoa.cadastraPessoa(jesus);
		
		pessoa.listaPessoa();

	}

}
