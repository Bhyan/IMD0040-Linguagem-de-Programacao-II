/**
 * Classe pai Professor.
 *
 * @author Bryan Brito.
 * @version 2018.09.02
 */
public class Professor{
    private String m_nome;
    private String m_matricula;
    private int m_idade;

    /**
     * Construtor da classe professor.
     * @param nome_ o nome do professor.
     * @param matricula_ o número da matricula do professor.
     * @param idade_ idade do professor.
     */
    public Professor(String nome_, String matricula_, int idade_){
        m_nome = nome_;
        m_matricula = matricula_;
        m_idade = idade_;
    }

    /**
     * Retorna o nome do professor.
     * @return m_nome.
     */
    public String getNome(){
        return m_nome;
    }

    /**
     * Altera o nome do professor.
     * @param nome_ novo nome.
     */
    public void setNome(String nome_){
        m_nome = nome_;
    }

    /**
     * Retorna a matricula do professor.
     * @return m_matricula.
     */
    public String getMatricula(){
        return m_matricula;
    }

    /**
     * Altera a matricula do professor.
     * @param matricula_ nova matricula.
     */
    public void setMatricula(String matricula_){
        m_matricula = matricula_;
    }

    /**
     * Retorna a idade do professor.
     * @return m_idade.
     */
    public int getIdade(){
        return m_idade;
    }

    /**
     * Altera a idade do professor.
     * @param idade_ nova idade.
     */
    public void setIdade(int idade_){
        m_idade = idade_;
    }
}
