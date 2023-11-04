package _5_estrutura_repeticao_for;

import java.util.Scanner;

public class ex_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro N para calcular fatorial: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		
		System.out.println("\nFatorial do valor " + n + " = " + fat);
		
		
		sc.close();
	}
	
}
