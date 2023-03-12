package _2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Digite um valor qualquer: ");
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 25) {
			System.out.println("\nINTERVALO [0,25]");
		}
		else if (x > 25 && x <= 50) {
			System.out.println("\nINTERVALO [25,50]");
		}
		else if (x > 50 && x <= 75) {
			System.out.println("\nINTERVALO [50,75]");
		}
		else if (x > 75 && x <= 100) {
			System.out.println("\nINTERVALO [75,100]");
		}
		else {
			System.out.println("\nFORA DE INTERVALO");
		}
		
		sc.close();
	}
	
}
