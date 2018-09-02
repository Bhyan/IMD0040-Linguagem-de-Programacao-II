public class CD extends Item{
    private String m_artist;
    private int m_numberOfTracks;

    public CD(String title_, int time_, String artist_, int track_){
        super(title_, time_);
        m_artist = artist_;
        m_numberOfTracks = track_;
    }

    public void print(){
        super.print();
        System.out.println(m_artist);
        System.out.println(m_numberOfTracks);
    }
}
