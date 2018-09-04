/**
 * Classe ProdutoNaoDuravel.
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class ProdutoNaoDuravel extends Produto{
    private String m_data_validade;
    private String m_genero; // Alimento, produto de limpeza, roupa, etc.

    /**
     * Construtor da classe ProdutoDuravel.
     * @param nome_ nome do produto.
     * @param preco_ preço do produto.
     * @param marca_ marca do produto.
     * @param descricao_ descrição do produto.
     * @param data_fabricacao_ data de fabricação do produto.
     * @param data_validade_ data de validade do produto.
     * @param genero_ tipo do produto.
     */
    public ProdutoNaoDuravel(String nome_, double preco_, String marca_, String descricao_,
            String data_fabricacao_, String data_validade_, String genero_){
    
        super(nome_, preco_, marca_, descricao_, data_fabricacao_);
        m_data_validade = data_validade_;
        m_genero = genero_;
    }

    /**
     * Retorna a data de validade do produto.
     * @return m_data_validade
     */
    public String getDataValidade(){
        return m_data_validade;
    }

    /**
     * Altera a data de validade do produto.
     * @param data_validade_
     */
    public void setDataValidade(String data_validade_){
        m_data_validade = data_validade_;
    }

    /**
     * Retorna o gênero do produto.
     * @return m_genero
     */
    public String getGenero(){
        return m_genero;
    }

    /**
     * Altera o tipo do produto.
     * @param genero_
     */
    public void setGenero(String genero_){
        m_genero = genero_;
    }
}
