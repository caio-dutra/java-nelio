package _2_estrutura_condicional;

import java.util.Scanner;

public class ex_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int init, end;
		
		System.out.print("Digite a hora inicial do jogo: ");
		init = sc.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		end = sc.nextInt();
		
		if (init == end) {
			System.out.printf("\nO JOGO DUROU 24 HORAS(S)");
		}
		else if (end < init) {
			int duration = (24 - init) + end;
			System.out.printf("\nO JOGO DUROU %d HORA(S)", duration);
		}
		else {
			int duration = end - init;
			System.out.printf("\nO JOGO DUROU %d HORA(S)", duration);
		}
		
		sc.close();
	}


}
