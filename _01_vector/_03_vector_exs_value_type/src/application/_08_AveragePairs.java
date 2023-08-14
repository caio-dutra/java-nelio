package application;

import java.util.Scanner;

public class _08_AveragePairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];

		System.out.println();
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Insiria o %d° numero: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		int sum=0;
		int qtPair=0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				qtPair++;
			}
		}
		
		if (sum == 0) {
			System.out.println("\nNENHUM NÚMERO PAR");
		} else {
			double avg = sum / qtPair;
			System.out.printf("\nMÉDIA DOS PARES = %.1f\n", avg);
		}
		
		sc.close();
	}

}
