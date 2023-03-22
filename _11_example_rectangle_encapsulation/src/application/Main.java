package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width: ");
		rectangle.setWidth(sc.nextDouble());
		System.out.print("Enter rectangle height: ");
		rectangle.setHeight(sc.nextDouble());
		
		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.println("\nWidth: " + rectangle.getWidth());
		System.out.println("Height: " + rectangle.getHeight());
		
		System.out.printf("\nAREA = %.2f\n", area);
		System.out.printf("PERIMETER = %.2f\n", perimeter);
		System.out.printf("DIAGONAL = %.2f\n", diagonal);
		
		sc.close();
	}


}
