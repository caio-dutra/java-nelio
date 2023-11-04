package _2_estrutura_condicional;

import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.print("Digite o valor de x do plano cartesiano: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de y do plano cartesiano: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("\nOrigem");
		}
		else if (x == 0 && y != 0) {
			System.out.println("\nEixo y");
		}
		else if (y == 0 && x != 0) {
			System.out.println("\nEixo x");
		}
		else if (x > 0 && y > 0) {
			System.out.println("\nQ1");
		}
		else if (y > 0 && x < 0) {
			System.out.println("\nQ2");
		}
		else if (y < 0 && x < 0) {
			System.out.println("\nQ3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("\nQ4");
		}
		
		sc.close();
	}
	
}
