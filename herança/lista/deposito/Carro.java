/**
 * Classe Carro.
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class Carro extends ProdutoDuravel{
    private String m_modelo;
    private int m_ano;
    private String m_cor;

    /**
     * Construtor da classe Carro.
     * @param nome_ nome do carro.
     * @param preco_ preço do carro.
     * @param marca_ marca do carro.
     * @param descricao_ descrição do carro.
     * @param data_fabricacao_ data de fabricação do carro.
     * @param material_ material predominante do carro.
     * @param durabilidade_ durabilidade do carro.
     * @param modelo_ modelo do carro.
     * @param ano_ ano do carro.
     * @param cor_ cor do carro.
     */
    public Carro(String nome_, double preco_, String marca_, String descricao_,
            String data_fabricacao_, String material_, String durabilidade_, String modelo_,
            int ano_, String cor_){

        super(nome_, preco_, marca_, descricao_, data_fabricacao_, material_, durabilidade_);
        m_modelo = modelo_;
        m_ano = ano_;
        m_cor = cor_;
    }

    /**
     * Retorna o modelo do carro.
     * @return m_modelo
     */
    public String getModelo(){
        return m_modelo;
    }

    /**
     * Altera o modelo do carro.
     * @param modelo_
     */
    public void setModelo(String modelo_){
        m_modelo = modelo_;
    }

    /**
     * Retorna o ano do carro.
     * @return m_ano
     */
    public int getAno(){
        return m_ano;
    }

    /**
     * Altera o ano do carro.
     * @param ano_
     */
    public void setAno(int ano_){
        m_ano = ano_;
    }

    /**
     * Retorna a cor do carro.
     * @return m_cor
     */
    public String getCor(){
        return m_cor;
    }

    /**
     * Altera a cor do carro.
     * @param cor_
     */
    public void setCor(String cor_){
        m_cor = cor_;
    }
}
