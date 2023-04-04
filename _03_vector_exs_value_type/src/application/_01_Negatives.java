package application;

import java.util.Scanner;

public class _01_Negatives {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		int[] vect = new int[n];
		
		System.out.println();
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Insiria o %d° numero: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNÚMEROS NEGATIVOS:");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
	
}
