package _3_estrutura_repeticao_while;

import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 1;

		while (x != 0 && y != 0) {
			System.out.print("\nDigite o valor da coordenada X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor da coordenada Y: ");
			y = sc.nextInt();

			System.out.println();
			if (x > 0 && y > 0) {
				System.out.println("Q1 - Primeiro quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2 - Segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3 - Terceiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4 - Quarto quadrante.");
			}
		}

	sc.close();
	}

}
