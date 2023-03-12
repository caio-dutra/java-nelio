package _1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex_03 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio de um círculo: ");
		raio = sc.nextDouble();
		
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("\nO valor da área desse círculo é: %.4f\n", area);
		
		
		sc.close();
	}

}
