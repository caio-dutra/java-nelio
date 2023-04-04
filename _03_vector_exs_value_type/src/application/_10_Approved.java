package application;

import java.util.Locale;
import java.util.Scanner;

public class _10_Approved {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] name = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] avg = new double[n];

		for (int i=0; i<n; i++) {
			System.out.printf("\nDigite nome, primeira e segunda nota do %do aluno: \n", i+1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Nota1: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Nota2: ");
			nota2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		for (int i=0; i<n; i++) {
			avg[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		System.out.println("\nALUNOS APROVADOS:");
		for (int i=0; i<n; i++) {
			if (avg[i] >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
