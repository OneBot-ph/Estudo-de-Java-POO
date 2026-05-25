package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollar will be bougth? ");
		double dollar = sc.nextDouble();
		
		double a = CurrencyConverter.Converter(price, dollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", a);
		
		sc.close();
	}

}
