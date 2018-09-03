/**
 * Classe filha de Professor.
 *
 * @author Bryan Brito.
 * @version 2018.09.02
 */
public class ProfessorRegime extends Professor{
    private double m_salario;

    /**
     * Construtor da classe ProfessorRegime.
     * @param nome_ o nome do professor.
     * @param matricula_ o número da matricula do professor.
     * @param idade_ idade do professor.
     */
    public ProfessorRegime(String nome_, String matricula_, int idade_, double salario_){
        super(nome_, matricula_, idade_);
        m_salario = salario_;
    }

    /**
     * Retorna o salario do professor.
     * @return m_salario.
     */
    public double getSalario(){
        return m_salario;
    }

    /**
     * Altera o valor do salario do professor.
     * @param salario_ novo salario.
     */
    public void setSalario(double salario_){
        m_salario = salario_;
    }
}
