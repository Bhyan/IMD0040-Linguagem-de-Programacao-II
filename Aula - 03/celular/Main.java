public class Main{
	public static void main(String[] args){
		Celular cel = new Celular();
		Celular cel2 = new Celular(1500);

		System.out.println("Celular 01.");
		System.out.println("Seu saldo é: " + cel.getCredito());
		System.out.println("Recarga de 500 centavos efetuada.");
		cel.topUp(500);
		System.out.println("Seu saldo é: " + cel.getCredito());
		System.out.println("Ligação de 1500 centavos efetuada.");
		cel.ligacao(1500);
		cel.mensagem();
		System.out.println("Seu saldo é: " + cel.getCredito() + "\n");

		System.out.println("Celular 02.");
		System.out.println("Seu saldo é: " + cel2.getCredito());
		System.out.println("Recarga de 500 centavos efetuada.");
		cel2.topUp(500);
		System.out.println("Seu saldo é: " + cel2.getCredito());
		System.out.println("Ligação de 1500 centavos efetuada.");
		cel2.ligacao(1500);
		cel2.mensagem();
		cel2.mensagem();
		System.out.println("Seu saldo é: " + cel2.getCredito());
	}
}