package _1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codePart1, codePart2, amountPart1, amountPart2;
		double valuePart1, valuePart2;
		
		System.out.print("Digite o código da peça1: ");
		codePart1 = sc.nextInt();
		System.out.print("Digite a quantidade da peça1: ");
		amountPart1 = sc.nextInt();
		System.out.print("Digite o valor unitário de cada peça1: ");
		valuePart1 = sc.nextDouble();
		System.out.print("\nDigite o código da peça2: ");
		codePart2 = sc.nextInt();
		System.out.print("Digite a quantidade da peça2: ");
		amountPart2 = sc.nextInt();
		System.out.print("Digite o valor unitário de cada peça2: ");
		valuePart2 = sc.nextDouble();
		
		double pay = (amountPart1 * valuePart1) + (amountPart2 * valuePart2);
		
		System.out.printf("\nCódigo das peças: %d, %d\n", codePart1, codePart2);
		System.out.printf("VALOR A PAGAR: R$%.2f\n", pay);
		
		sc.close();
	}


}
