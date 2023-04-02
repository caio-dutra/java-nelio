package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("\nEnter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);
		
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			acc = new Account(accountHolder, accountNumber, initialDeposit);
		} else {
			acc = new Account(accountHolder, accountNumber);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		
		System.out.println("\nUpdated account data:");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		
		System.out.println("\nUpdated account data:");
		System.out.println(acc);
		
		sc.close();
	}

}
