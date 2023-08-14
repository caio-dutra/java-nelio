package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
						
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("\nEmployee #%d:", i+1);
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			while (hasId(employees, id)) {
				System.out.print("Id already taken! try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			employees.add(emp);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt(); 
		
//		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		Integer pos = position(employees, idSalary);

//		emp <--> pos

		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employees.get(pos).increaseSalary(percentage);
		}
		
		System.out.println("\nList of employees: ");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
