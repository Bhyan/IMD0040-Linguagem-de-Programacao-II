import java.util.Vector;
/**
 * Classe Deposito.
 *
 * @author Bryan Brito
 * @version 2018.09.03
 */
public class Deposito{
    private Vector<Produto> m_produtos;

    public Deposito(){}

    public void adicionarProduto(Produto produto_){
        m_produtos.add(produto_);
    }
    
}
