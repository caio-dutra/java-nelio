package _1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex_05 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, hour;
		double valueHour;
		
		System.out.print("Número do funcionário: ");
		code = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		hour = sc.nextInt();
		System.out.print("Valor/hora: ");
		valueHour = sc.nextDouble();
		
		double salary = valueHour * hour;
		
		System.out.println("\nNúmero: " + code);
		System.out.printf("Salário: R$%.2f\n", salary);
		
		sc.close();
	}

}
