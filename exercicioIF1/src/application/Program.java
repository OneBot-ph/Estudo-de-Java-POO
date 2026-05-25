
package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		int years = 0, months = 0, days = 0, totaldays;
//----------
		
		System.out.println("Please, enter the date: ");
		
		System.out.printf("Years: ");
		years = sc.nextInt();
		System.out.println("Month: ");
		months = sc.nextInt();
		System.out.println("Days: ");
		days = sc.nextInt();
		
//----------

		totaldays= (years * 365) + (months * 30) + days;
		
		System.out.println("Days: "+ totaldays);
		
		sc.close();
	}

}
