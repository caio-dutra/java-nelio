package _1_estrutura_sequencial;

import java.util.Scanner;

public class ex_04 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();
		System.out.print("Digite o valor de D: ");
		D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("\nA diferença do produto de A e B pelo produto de C e D é igual a: %d", diferenca);
		
		sc.close();
	}

}
