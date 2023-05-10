package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birth = sc.next();
		
		Client client = new Client(name, email, LocalDate.parse(birth, fmt));
		
		System.out.println("\nEnter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		
		/**
		 * OR -> Order order = new Order(LocalDateTime.now(), 
		 * 				OrderStatus.valueOf(status), 
		 * 				new Client(name, email, LocalDate.parse(birth, fmt));
		 */
		
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Enter #%d item data:", i+1);
			
			System.out.print("\n\nProduct name: ");
			name = sc.nextLine();
			
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			
			Product product = new Product(name, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();
	}

}
