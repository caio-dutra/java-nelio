package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.PayTaxer;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PayTaxer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			if (option == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double annualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				
				PayTaxer individual = new Individual(name, annualIncome, healthExpenses);
				list.add(individual);
			} else if (option == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double annualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				PayTaxer company = new Company(name, annualIncome, numberEmployees);
				list.add(company);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (PayTaxer payment : list) {
			System.out.println(payment);
		}

		Double sum = 0.0;
		for (PayTaxer payment : list) {
			sum += payment.tax();
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}
