package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("\nDados da %da pessoa: ", i+1);
			System.out.print("\nNome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vect[i] = new Person(name, age, height);
		}
		
		double sumHeight=0;
		int underSixteen=0;
		for (int i = 0; i < vect.length; i++) {
			sumHeight += vect[i].getHeight();
			if (vect[i].getAge() < 18) {
				underSixteen++;
			}
		}
		
		double avgHeight = sumHeight / n;
		double minorsPercentage = ((double)underSixteen / n) * 100.0;
		
		System.out.printf("\nAltura média: %.2f\n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", minorsPercentage);
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}
		
		
		sc.close();
	}

}
