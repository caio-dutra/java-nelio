package application;

import java.util.Scanner;

public class _04_PairNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Insira o %d° numero: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		int qtd=0;
		System.out.println("\nNUMEROS PARES:");
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				qtd++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtd);
		
		sc.close();
	}

}
