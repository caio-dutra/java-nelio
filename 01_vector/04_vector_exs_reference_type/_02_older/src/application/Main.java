package application;

import java.util.Scanner;

import entities.Person;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("\nDados da %da pessoa: ", i+1);
			System.out.print("\nNome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			vect[i] = new Person(name, age);
		}
		
		String nameOlder = "";
		int older = vect[0].getAge();
		for (int i=0; i<n; i++) {
			if (vect[i].getAge() > older) {
				older = vect[i].getAge();
				nameOlder = vect[i].getName();
			}
		}
		
		System.out.println("\nPESSOA MAIS VELHA: " + nameOlder);		
		
		sc.close();
	}

}
