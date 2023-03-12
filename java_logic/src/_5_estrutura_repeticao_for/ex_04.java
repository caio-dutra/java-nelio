package _5_estrutura_repeticao_for;

import java.util.Scanner;

public class ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de divisões: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o Numerador: ");
			double a = sc.nextDouble();
			System.out.print("Informe o Denominador: ");
			double b = sc.nextDouble();
			
			System.out.println();
			if (b != 0) {
				double divisao = a / b;
				System.out.println(divisao);
			} else {
				System.out.println("Divisão impossível.");
			}
			System.out.println();
			
		}
		
		sc.close();
	}
	
}
