public class DVD extends Item{
    private String m_director;

    public DVD(String title_, int time_, String director_){
        super(title_, time_);
        m_director = director_;
    }

    public void print(){
        super.print();
        System.out.println(m_director);
    }
}
