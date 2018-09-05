public class Carro extends Veiculo{
    private int m_chassi;
    private boolean m_quatroPortas;

    public Carro(String marca_, String modelo_, int ano_, int chassi_, boolean quatroPortas_){
        super(marca_, modelo_, ano_);
        m_chassi = chassi_;
        m_quatroPortas = quatroPortas_;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Chassi: " + m_chassi);
        System.out.println("Quatro portas: " + m_quatroPortas);
    }
}
