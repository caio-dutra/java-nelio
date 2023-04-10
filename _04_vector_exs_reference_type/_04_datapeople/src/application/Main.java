package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdWomen=0, qtdMen=0;
		double high, minor, sum=0.0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("\nAltura da %da pessoa: ", i+1);
			double height = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i+1);
			char gender = sc.next().toUpperCase().charAt(0);
			
			vect[i] = new Person(height, gender);
		}
		
		high = minor = vect[0].getHeight();
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getHeight() > high) {
				high = vect[i].getHeight();
			} else if (vect[i].getHeight() < minor) {
				minor = vect[i].getHeight();
			}
			
			if (vect[i].getGender() == 'F') {
				sum += vect[i].getHeight();
				qtdWomen++;
			} else if (vect[i].getGender() == 'M') {
				qtdMen++;
			}
		}
		
		double avg = sum / qtdWomen;
		
		System.out.printf("\nMenor altura: %.2f\n", minor);
		System.out.printf("Maior altura: %.2f\n", high);
		System.out.printf("Média das alturas das mulheres: %.2f\n", avg);
		System.out.printf("Número de homens: %d", qtdMen);
		
		
		
		sc.close();
	}

}
