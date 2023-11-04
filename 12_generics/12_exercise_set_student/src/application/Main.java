package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();
		
		System.out.print("How many students for course A?");
		int num1 = sc.nextInt();
		for (int i=1; i<=num1; i++) {
			System.out.printf("Type the code of %d° student: ", i);
			int number = sc.nextInt();
			
			a.add(number);
		}
		
		System.out.print("\nHow many students for course B?");
		int num2 = sc.nextInt();
		for (int i=1; i<=num2; i++) {
			System.out.printf("Type the code of %d° student: ", i);
			int number = sc.nextInt();
			
			b.add(number);
		}
		
		System.out.print("\nHow many students for course C?");
		int num3 = sc.nextInt();
		for (int i=1; i<=num3; i++) {
			System.out.printf("Type the code of %d° student: ", i);
			int number = sc.nextInt();
			
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<Integer>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}
