public class Aquecedor{
	// Valor da temperatura.
	private int m_temperatura;
	// Valor máximo de temperatura.
	private int m_max;
	// Valor mínimo da temperatura.
	private int m_min;
	// Valor de incremento na temperatura.
	private int m_increment;

	// Construtor parametrizado, inicia m_temperatura com valor 15 e m_increment com o valor 5.
	// @param max_
	// @param min_
	public Aquecedor(int min_, int max_){
		m_temperatura = 15;
		m_min = min_;
		m_max = max_;
		m_increment = 5;
	}

	// Método aquecer, aumenta a temperatura em m_increment.
	public void warmer(){
		if(m_temperatura < m_max){
			m_temperatura += m_increment;
		}
		else{
			System.out.println("Temperatura não pode ser aumentada, já se encontra no valor máximo.");
		}
	}

	// Método esfriar, diminui a temperatura em m_increment.
	public void cooler(){
		if(m_temperatura > m_min){
			m_temperatura -= m_increment;
		}
		else{
			System.out.println("Temperatura não pode ser diminuida, já se encontra no valor mínimo.");
		}
	}

	// @return m_temperatura.
	public int getTemperatura(){
		return m_temperatura;
	}

	// @param novo valor de m_increment.
	public void setIncrement(int increment_){
		if(increment_ >= 0){
			m_increment = increment_;
		}
		else{
			System.out.println("Valor de incremento inválido.");
		}
	}
}