package _1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex_07 {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159;
		
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();
		
		double triangle = (A * C) / 2;
		double circle = pi * Math.pow(C, 2);
		double trapeze = (A + B) * C / 2;
		double square = B * B;
		double rectangle = A * B;
		
		System.out.printf("\nTRIÂNGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapeze);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETÂNGULO: %.3f\n", rectangle);
		
		sc.close();
	}

}
