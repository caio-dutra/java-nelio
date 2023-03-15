package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar exchange rate? ");
		CurrencyConverter.dolarExchange = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dolarBuy = sc.nextDouble();
		
		double payment = CurrencyConverter.convert();
		
		System.out.printf("\nAmount to be paid in reais = %.2f\n", payment);
		
		sc.close();
	}

}
