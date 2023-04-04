package application;

import java.util.Locale;
import java.util.Scanner;

public class _02_SumVector {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		double[] vect = new double[n];
		
		System.out.println();
		for (int i=0; i<vect.length; i++) {
			
			System.out.printf("Insiria o %d° numero: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double sum=0;
		System.out.print("\nVALORES: ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + "  ");
			sum += vect[i];
		}
		
		System.out.printf("\nSOMA = %.2f", sum);
		System.out.printf("MÉDIA = %.2f", sum/vect.length);
				
		
		sc.close();
	}

}
