package application;

import java.util.Locale;
import java.util.Scanner;

public class _05_HigherNumber {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.printf("Insira o %d° numero: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		int position=0;
		double high = vect[0];
		
		for (int i=0; i<n; i++) {
			if (vect[i] > high) {
				high = vect[i];
				position = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + high);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + position);
		
		sc.close();
	}

}
