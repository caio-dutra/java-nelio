package _3_estrutura_switch_case;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;

		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5: 
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
