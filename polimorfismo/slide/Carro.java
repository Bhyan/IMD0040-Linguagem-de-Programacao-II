/**
 * Classe Carro.
 *
 * @author Bryan Brito
 * @version 03.09.2018
 */
public class Carro extends Veiculo{
    private int m_chassi;
    private boolean m_quatroPortas;

    /**
     * Construtor da classe Carro.
     * @param marca_ Marca do carro.
     * @param modelo_ Modelo do carro.
     * @param ano_ Ano do carro.
     * @param chassi_ Número do chassi do carro.
     * @param quatroPortas_ Se o carro e quatro portas ou não.
     */
    public Carro(String marca_, String modelo_, int ano_, int chassi_, boolean quatroPortas_){
        super(marca_, modelo_, ano_);
        m_chassi = chassi_;
        m_quatroPortas = quatroPortas_;
    }

    /**
     * Mostra os dados do carro.
     */
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Chassi: " + m_chassi);
        System.out.println("Quatro portas: " + m_quatroPortas);
    }
}
