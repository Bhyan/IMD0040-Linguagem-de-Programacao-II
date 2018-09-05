/**
 * Classe Veiculo.
 *
 * @author Bryan Brito
 * @version 03.09.2018
 */
public class Veiculo{
    private String m_marca;
    private String m_modelo;
    private int m_ano;

    /**
     * Construtor da classe Veiculo.
     * @param marca_ Marca do veiculo.
     * @param modelo_ Modelo do veiculo.
     * @param ano_ Ano do veiculo.
     */
    public Veiculo(String marca_, String modelo_, int ano_){
        m_marca = marca_;
        m_modelo = modelo_;
        m_ano = ano_;
    }

    /**
     * Buzina do veiculo.
     */
    public void buzinar(){
        System.out.println("Buzina veiculo.");
    }

    /**
     * Mostra os dados do veiculo.
     */
    public void imprimirDados(){
        System.out.println("Marca: " + m_marca);
        System.out.println("Modelo: " + m_modelo);
        System.out.println("Ano: " + m_ano);
    }
}
