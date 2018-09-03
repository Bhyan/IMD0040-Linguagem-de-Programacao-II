/**
 * Classe pai Produto
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class Produto{
    private String m_nome;
    private double m_preco;
    private String m_marca;
    private String m_descricao;
    private String m_data_fabricacao;

    /**
     * Construtor da classe Produto.
     * @param nome_ nome do produto.
     * @param preco_ preço do produto.
     * @param marca_ marca do produto.
     * @param descricao_ descrição do produto.
     * @param data_fabricacao_ data de fabricação do produto.
     */
    public Produto(String nome_, double preco_, String marca_, String descricao_,
            String data_fabricacao_){
        m_nome = nome_;
        m_preco = preco_;
        m_marca = marca_;
        m_descricao = descricao_;
        m_data_fabricacao = data_fabricacao_;
    }

    /**
     * Retorna o nome do produto.
     * @return m_nome
     */
    public String getNome(){
        return m_nome;
    }

    /**
     * Altera o nome do produto.
     * @param nome_ novo nome.
     */
    public void setNome(String nome_){
        m_nome = nome_;
    }

    /**
     * Retorna o preço do produto.
     * @return m_preco
     */
    public double getPreco(){
        return m_preco;
    }

    /**
     * Altera o preço do produto.
     * @param preco_ novo preço do produto.
     */
    public void setPreco(double preco_){
        m_preco = preco_;
    }

    /**
     * Retorna a marca do produto.
     * @return m_marca
     */
    public String getMarca(){
        return m_marca;
    }

    /**
     * Altera a marca do produto.
     * @param marca_
     */
    public void setMarca(String marca_){
        m_marca = marca_;
    }

    /**
     * Retorna a descrição do produto.
     * @return m_descricao
     */
    public String getDescricao(){
        return m_descricao;
    }

    /**
     * Altera a descrição do produto.
     * @param descricao_ nova descrição do produto.
     */
    public void setDescricao(String descricao_){
        m_descricao = descricao_;
    }

    /**
     * Retorna a data de fabricação do produto.
     * @return m_data_fabricacao
     */
    public String getData(){
        return m_data_fabricacao;
    }

    /**
     * Altera a data de fabricação do produto.
     * @param data_fabricacao_ nova data de fabricação.
     */
    public void setData(String data_fabricacao_){
        m_data_fabricacao = data_fabricacao_;
    }
}
