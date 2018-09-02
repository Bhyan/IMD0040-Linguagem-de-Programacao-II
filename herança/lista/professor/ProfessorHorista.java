/**
 * Classe filha de Professor.
 *
 * @author Bryan Brito.
 * @version 2018.09.02
 */
public class ProfessorHorista extends Professor{
    private int m_total_horas;
    private String m_salario_hora;
    
    /**
     * Construtor da classe ProfessorHorista.
     * @param nome_ o nome do professor.
     * @param matricula_ o número da matricula do professor.
     * @param idade_ idade do professor.
     * @param total_horas_ total de horas aula ministradas.
     * @param salario_hora_ valor pago por hora aula.
     */
    public ProfessorHorista(String nome_, String matricula_, int idade_, int total_horas_,
            String salario_hora_){

        super(nome_, matricula_, idade_);
        m_total_horas = total_horas_;
        m_salario_hora = salario_hora_;
    }

    /**
     * Retorna a quantidade de horas aula ministrada.
     * @return m_total_horas.
     */
    public int getTotalHoras(){
        return m_total_horas;
    }

    /**
     * Altera a quantidade de horas aula ministrada.
     * @param total_horas_ nova quantidade de horas aula.
     */
    public void setTotalHoras(int total_horas_){
        m_total_horas = total_horas_;
    }

    /**
     * Retorna a o valor hora aula.
     * @return m_salario_hora.
     */
    public String getSalarioHora(){
        return m_salario_hora;
    }

    /**
     * Altera o valor hora aula.
     * @param salario_hora_ novo valor hora aula.
     */
    public void setSalarioHora(String salario_hora_){
        m_salario_hora = salario_hora_;
    }

    /**
     * Retorna o valor do salário a ser pago.
     * @return m_total_horas * m_salario_hora.
     */
    public int salario(){
        return m_total_horas * Integer.parseInt(m_salario_hora);
    }
}
