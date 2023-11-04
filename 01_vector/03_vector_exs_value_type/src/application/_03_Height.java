package application;

import java.util.Locale;
import java.util.Scanner;

public class _03_Height {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nDados da %da pessoa: ", i+1);
			System.out.print("\nNome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double sumHeight=0;
		int underSixteen=0;
		for (int i=0; i<n; i++) {
			sumHeight += height[i];
			if (age[i] < 16) {
				underSixteen++;
			}
		}
		
		double avgHeight = sumHeight / n;
		double minorsPercentage = underSixteen * 100.0 / n;
//		double minorsPercentage = ((double)underSixteen / n) * 100.0;
		
		System.out.printf("\nAltura média: %.2f\n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", minorsPercentage);
		
		for (int i=0; i<n; i++) {
			if (age[i] < 16) {
				System.out.printf("%s\n", name[i]);
			}
		}
		
		sc.close();
	}

}
