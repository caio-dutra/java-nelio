package _5_estrutura_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de média ponderadas a se calcular: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite o primeiro valor: ");
			double a = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double b = sc.nextDouble();
			System.out.print("Digite o terceiro valor: ");
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.println();
			System.out.printf("MÉDIA PONDERADA = %.1f%n", media);
			System.out.println();
		}
		
		sc.close();
	}

}
