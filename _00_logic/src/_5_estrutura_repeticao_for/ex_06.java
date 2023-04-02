package _5_estrutura_repeticao_for;

import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro N: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
