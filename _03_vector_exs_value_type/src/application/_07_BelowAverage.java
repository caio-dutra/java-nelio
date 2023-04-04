package application;

import java.util.Locale;
import java.util.Scanner;

public class _07_BelowAverage {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		System.out.println();
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Insiria o %d° numero: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double sum=0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("\nMÉDIA DO VETOR = %.3f\n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}

		
		
		sc.close();
	}
	
}
