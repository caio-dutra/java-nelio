package _2_estrutura_condicional;

import java.util.Scanner;

public class ex_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code, amount;
		double value;
		
		System.out.print("Digite o código do produto: ");
		code = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		amount = sc.nextInt();
		
		if (code == 1) {
			value = 4.00 * amount;
			System.out.printf("\nTOTAL: R$%.2f\n", value);
		}
		else if (code == 2) {
			value = 4.50 * amount;
			System.out.printf("\nTOTAL: R$%.2f\n", value);
		}
		else if (code == 3) {
			value = 5.00 * amount;
			System.out.printf("\nTOTAL: R$%.2f\n", value);
		}
		else if (code == 4) {
			value = 2.00 * amount;
			System.out.printf("\nTOTAL: R$%.2f\n", value);
		}
		else if (code == 5) {
			value = 1.50 * amount;
			System.out.printf("\nTOTAL: R$%.2f\n", value);
		}
		
		sc.close();
	}
	
}
