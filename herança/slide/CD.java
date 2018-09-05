/**
 * Classe CD
 *
 * @author Bryan Brito
 * @version 03.09.2010
 *
 */
public class CD extends Item{
    private String m_artist;
    private int m_numberOfTracks;

    /**
     * Construtor classe CD.
     * @param title_ Titulo do cd.
     * @param time_ Duração do cd.
     * @param artist_ 
     * @param track_ Número de faixas.
     */
    public CD(String title_, int time_, String artist_, int track_){
        super(title_, time_);
        m_artist = artist_;
        m_numberOfTracks = track_;
    }

    /**
     * Mostra os dados do objeto cd.
     */
    public void print(){
        super.print();
        System.out.println(m_artist);
        System.out.println(m_numberOfTracks);
    }
}
