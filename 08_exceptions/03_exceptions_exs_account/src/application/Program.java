package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptionsd.WithdrawException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		try {
			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println(acc);
		}
		catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}		
		
		sc.close();
	}

}
