package _2_estrutura_condicional;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("\nNEGATIVO");
		}
		else {
			System.out.println("\nPOSITIVO");
		}
		
		sc.close();
	}

}
