package application;

import java.util.Scanner;

public class _09_Older {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nDados da %da pessoa: ", i+1);
			System.out.print("\nNome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			sc.nextLine();
		}
		
		String nameOlder = "";
		int older = age[0];
		for (int i=0; i<n; i++) {
			if (age[i] > older) {
				older = age[i];
				nameOlder = name[i];
			}
		}
		
		System.out.println("\nPESSOA MAIS VELHA: " + nameOlder);
		
		
		sc.close();
	}

}
