package _3_estrutura_repeticao_while;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password = 0;

		while (password != 2002) {
			System.out.print("Digite a senha: ");
			password = sc.nextInt();
		}

		System.out.println("\nAcesso permitido.");

		sc.close();
	}

}
