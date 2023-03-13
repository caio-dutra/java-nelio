package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter your name: ");
		student.name = sc.nextLine();
		System.out.print("Enter the first trimester grade: ");
		student.trimester1 = sc.nextDouble();
		System.out.print("Enter the second trimester grade: ");
		student.trimester2 = sc.nextDouble();
		System.out.print("Enter the third trimester grade: ");
		student.trimester3 = sc.nextDouble();
		System.out.println();
		
		student.finalGrade();
		
		System.out.println(student);
		
		sc.close();
	}

}
