package _4_estrutura_repeticao_while;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int typeFuel = 0;
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		while (typeFuel != 4) {
			System.out.print("Digite o tipo de combusível: ");
			typeFuel = sc.nextInt();
			
			if (typeFuel == 1) {
				alcohol += 1;
			}
			else if (typeFuel == 2) {
				gasoline += 1;
			}
			else if (typeFuel == 3) {
				diesel += 1;
			}
		}
		
		System.out.println("\nMUITO OBRIGADO!");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}

}
