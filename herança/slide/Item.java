public class Item{
    private String m_title;
    private int m_playingTime;
    private boolean m_gotIt;
    private String m_comment;

    public Item(String theTitle_, int time_){
        m_title = theTitle_;
        m_playingTime = time_;
        m_gotIt = false;
        m_comment = " ";
    }

    public void setComment(String comment_){
        m_comment = comment_;
    }

    public String getComment(){
        return m_comment;
    }

    public void setOwn(boolean gotIt_){
        m_gotIt = gotIt_;
    }

    public boolean getOwn(){
        return m_gotIt;
    }

    public void print(){
        System.out.println(m_title);
        System.out.println(m_playingTime);
        System.out.println(m_gotIt);
        System.out.println(m_comment);
    }
}
