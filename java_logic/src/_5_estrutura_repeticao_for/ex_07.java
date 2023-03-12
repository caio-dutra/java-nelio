package _5_estrutura_repeticao_for;

import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número positivo N: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		
		sc.close();
	}

}
