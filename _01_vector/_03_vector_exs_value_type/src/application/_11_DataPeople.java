package application;

import java.util.Locale;
import java.util.Scanner;

public class _11_DataPeople {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdWomen=0, qtdMen=0;
		double high, minor, sum=0.0;
				
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] height = new double[n];
		char[] gender = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nAltura da %da pessoa: ", i+1);
			height[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i+1);
			gender[i] = sc.next().toUpperCase().charAt(0);
		}
		
		high = minor = height[0];
		for (int i=0; i<n; i++) {
			if (height[i] > high) {
				high = height[i];
			} else if (height[i] < minor) {
				minor = height[i];
			}
			
			if (gender[i] == 'F') {
				sum += height[i];
				qtdWomen++;
			} else if (gender[i] == 'M') {
				qtdMen++;
			}
		}
		
		double avg = sum / qtdWomen;
		
		System.out.printf("\nMenor altura: %.2f\n", minor);
		System.out.printf("Maior altura: %.2f\n", high);
		System.out.printf("Média das alturas das mulheres: %.2f\n", avg);
		System.out.printf("Número de homens: %d", qtdMen);
		
		sc.close();
	}

}
