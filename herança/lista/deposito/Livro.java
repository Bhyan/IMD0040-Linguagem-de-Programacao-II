/**
 * Classe Livro.
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class Livro extends ProdutoDuravel{
    private String m_autor;
    private int m_paginas;

    /**
     * Construtor da classe Livro.
     * @param nome_ nome do livro.
     * @param preco_ preço do livro.
     * @param marca_ marca do livro.
     * @param descricao_ descrição do livro.
     * @param data_fabricacao_ data de fabricação do livro.
     * @param material_ material predominante do livro.
     * @param durabilidade_ durabilidade do livro.
     * @param autor_ nome do autor do livro.
     * @param paginas_ número de paginas do livro.
     */
    public Livro(String nome_, double preco_, String marca_, String descricao_,
            String data_fabricacao_, String material_, String durabilidade_, String autor_,
            int paginas_){

        super(nome_, preco_, marca_, descricao_, data_fabricacao_, material_, durabilidade_);
        m_autor = autor_;
        m_paginas = paginas_;
    }


}
