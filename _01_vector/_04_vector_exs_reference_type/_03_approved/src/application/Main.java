package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Student[] vect = new Student[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("\nDigite nome, primeira e segunda nota do %do aluno: \n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Nota1: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota2: ");
			double nota2 = sc.nextDouble();
			
			vect[i] = new Student(name, nota1, nota2);
		}
		
		System.out.println("\nALUNOS APROVADOS:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].avgStud() >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
