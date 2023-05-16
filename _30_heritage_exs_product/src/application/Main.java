package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			if (option == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("price: ");
				Double price = sc.nextDouble();
				
				Product product = new Product(name, price);
				list.add(product);
			} else if (option == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			} else if (option == 'u') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt);
				
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
	}

}
