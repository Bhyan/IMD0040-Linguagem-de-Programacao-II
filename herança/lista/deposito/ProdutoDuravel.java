/**
 * Classe pai ProdutoDuravel.
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class ProdutoDuravel extends Produto{
    private String m_material;
    private String m_durabilidade;

    /**
     * Construtor da classe ProdutoDuravel.
     * @param nome_ nome do produto.
     * @param preco_ preço do produto.
     * @param marca_ marca do produto.
     * @param descricao_ descrição do produto.
     * @param data_fabricacao_ data de fabricação do produto.
     * @param material_ material predominante do produto.
     * @param durabilidade_ durabilidade do produto.
     */
    public ProdutoDuravel(String nome_, double preco_, String marca_, String descricao_,
            String data_fabricacao_, String material_, String durabilidade_){

        super(nome_, preco_, marca_, descricao_, data_fabricacao_);
        m_material = material_;
        m_durabilidade = durabilidade_;
    }

    /**
     * Retorna o material predominante do produto.
     * @return m_material
     */
    public String getMaterial(){
        return m_material;
    }

    /**
     * Altera o material do produto.
     * @param material_
     */
    public void setMaterial(String material_){
        m_material = material_;
    }

    /**
     * Retorna a durabilidade do produto.
     * @return m_durabilidade
     */
    public String getDurabilidade(){
        return m_durabilidade;
    }

    /**
     * Altera a durabilidade do produto.
     * @param durabilidade_
     */
    public void setDurabilidade(String durabilidade_){
        m_durabilidade = durabilidade_;
    }
}
