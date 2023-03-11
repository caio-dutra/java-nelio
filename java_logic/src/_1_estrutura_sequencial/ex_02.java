package _1_estrutura_sequencial;

import java.util.Scanner;

public class ex_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite osegundo valor inteiro: ");
		y = sc.nextInt();
		
		int soma = x + y;
	
		System.out.printf("\nA soma dos dois valores = %d", soma);
		
		sc.close();
	}

}
