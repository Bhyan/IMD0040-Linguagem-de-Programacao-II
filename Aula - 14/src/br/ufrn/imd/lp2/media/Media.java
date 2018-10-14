package br.ufrn.imd.lp2.media;

/*
 * @author Bryan Brito
 * @version 14.10.2018
 */
public class Media {
	private int m_nota1;
	private int m_nota2;
	private int m_nota3;
	
	/*
	 * Constructor for objects of class media.
	 * @param nota1_
	 * @param nota2_
	 * @param nota3_
	 */
	public Media(int nota1_, int nota2_, int nota3_) {
		m_nota1 = nota1_;
		m_nota2 = nota2_;
		m_nota3 = nota3_;
	}
	
	/*
	 * Calculates the weighted average of three values.
	 * @return weighted average
	 */
	public int calcularMedia() {
		return (m_nota1 + m_nota2 + m_nota3) / 3;
	}
}