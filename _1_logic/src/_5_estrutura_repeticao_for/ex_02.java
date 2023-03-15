package _5_estrutura_repeticao_for;

import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		
		System.out.print("Digite a quantidade de valores a serem lidos: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Valores: ");
			int values = sc.nextInt();
			
			if (values >= 10 && values <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println();
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
