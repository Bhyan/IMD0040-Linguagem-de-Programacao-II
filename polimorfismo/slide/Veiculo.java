public class Veiculo{
    private String m_marca;
    private String m_modelo;
    private int m_ano;

    public Veiculo(String marca_, String modelo_, int ano_){
        m_marca = marca_;
        m_modelo = modelo_;
        m_ano = ano_;
    }

    public void buzinar(){
        System.out.println("Buzina veiculo.");
    }

    public void imprimirDados(){
        System.out.println("Marca: " + m_marca);
        System.out.println("Modelo: " + m_modelo);
        System.out.println("Ano: " + m_ano);
    }
}
