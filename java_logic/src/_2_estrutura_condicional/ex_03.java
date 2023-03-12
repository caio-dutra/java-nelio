package _2_estrutura_condicional;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		
		if ((A % B == 0) || (B % A == 0)) {
			System.out.println("\nSÃO MULTIPLOS");
		}
		else {
			System.out.println("\nNÃO SÃO MULTIPLOS");
		}
		
		sc.close();
	}

}
