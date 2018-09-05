/**
 * Classe DVD
 *
 * @author Bryan Brito
 * @version 03.09.2018
 */
public class DVD extends Item{
    private String m_director;

    /**
     * Construtor da classe DVD.
     * @param title_ Titulo do dvd.
     * @param time_ Duração do dvd.
     * @param director_
     */
    public DVD(String title_, int time_, String director_){
        super(title_, time_);
        m_director = director_;
    }

    /**
     * Mostra os dados do objeto dvd.
     */
    public void print(){
        super.print();
        System.out.println(m_director);
    }
}
