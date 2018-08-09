public class Celular{
    // Valor de crédito no celular.
    private int m_credito;

    // Contrutor sem parâmetro.
    public Celular(){
        m_credito = 1000;
    }

    // Construtor parametrizado.
    // @param valor de crédito inicial, caso o valor for menor que zero, o 
    // objeto é iniciado com zero.
    public Celular(int credito_){
        if(credito_ >= 0){
            m_credito = credito_;
        }
        else{
            System.out.println("Valor " + credito_ + " não é um valor de credito valido.");
            m_credito = 0;
        }
    }

    // @return m_credito.
    public int getCredito(){
        return m_credito;
    }

    // Método altera valor de crédito do celular.
    // @param novo valor de crédito.
    public void setCredito(int credito_){
        m_credito = credito_;
    }

    // Método recarregar do celular.
    // @param valor da recarga, caso valor igual ou menor a zero a recarga não e efetuada.
    public void topUp(int valor_){
        if(valor_ > 0){
            m_credito += valor_;
        }
        else{
            System.out.println("Valor " + valor_ + " não é um valor valido para recarga.");
        }
    }

    // Método que efetua a ligação.
    // @param valor do preço da chamada, caso menor que o saldo, chamada não é efetuada.
    public void ligacao(int valor_){
        if(valor_ <= m_credito){
            System.out.println("Ligação feita.");
            m_credito -= valor_;
            System.out.println("Seu saldo é: " + getCredito());
        }
        else{
            System.out.println("Você não possui credito suficiente para efetuar essa ligação.");
        }
    }

    // Método que envia mensagem.
    public void mensagem(){
        if(m_credito >= 10){
            System.out.println("Mensagem enviada.");
            m_credito -= 10;
        }
        else{
            System.out.println("Você não tem crédito suficiente para enviar mensagem.");
        }
    }
}
