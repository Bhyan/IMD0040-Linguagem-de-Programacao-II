/**
 * Classe Item.
 *
 * @author Bryan Brito
 * @version 03.09.2018
 */
public class Item{
    private String m_title;
    private int m_playingTime;
    private boolean m_gotIt;
    private String m_comment;

    /**
     * Construtor da classe Item.
     * @param title_ Titulo do item.
     * @param time_ Duração do item.
     */
    public Item(String title_, int time_){
        m_title = title_;
        m_playingTime = time_;
        m_gotIt = false;
        m_comment = " ";
    }

    /**
     * Altera o comentário do item.
     * @param comment_ Novo comentário.
     */
    public void setComment(String comment_){
        m_comment = comment_;
    }

    /**
     * Retorna o comentário do item.
     * @return m_comment
     */
    public String getComment(){
        return m_comment;
    }

    public void setOwn(boolean gotIt_){
        m_gotIt = gotIt_;
    }

    public boolean getOwn(){
        return m_gotIt;
    }

    /**
     * Mostra as informações do item.
     */
    public void print(){
        System.out.println(m_title);
        System.out.println(m_playingTime);
        System.out.println(m_gotIt);
        System.out.println(m_comment);
    }
}
