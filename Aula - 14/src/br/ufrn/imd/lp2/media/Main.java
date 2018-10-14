package br.ufrn.imd.lp2.media;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		int nota3 = scan.nextInt();
		
		Media m = new Media(nota1, nota2, nota3);
		
		System.out.println(m.calcularMedia());
		
		scan.close();
	}

}