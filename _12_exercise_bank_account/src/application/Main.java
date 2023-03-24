package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char letter = sc.next().toLowerCase().charAt(0);
		
		Account acc = new Account(accountHolder, accountNumber);
		
		if (letter == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			
			acc.deposit(balance);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
	}

}
