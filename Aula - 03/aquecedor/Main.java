public class Main{
	public static void main(String[] args){
		Aquecedor aq = new Aquecedor(15, 50);

		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.cooler();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.warmer();
		System.out.println("Temperatura: " + aq.getTemperatura() + "º.");
		aq.setIncrement(-10);
		aq.setIncrement(10);
	}
}