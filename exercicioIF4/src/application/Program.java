package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Parts;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);

		
		double totalvalue = 0, ipi = 0;
		
//--------
		
		System.out.println("Please, enter the parts datas");
		
		Parts[]parts = new Parts[2];
		
		for(int i = 0; i < parts.length; i++) {
			System.out.println("Parts Data "+ (i+1));
			System.out.printf("Id");
			int id = sc.nextInt();
			System.out.printf("Price");
			double price = sc.nextInt();
			System.out.printf("Quantity");
			int quantity = sc.nextInt();
	
			parts[i] = new Parts (id, price, quantity);
			
		}
		

//--------		
		System.out.print("Please, enter the value IPI tax: ");
		ipi = sc.nextDouble();
		
		
		double sum = 0;
		for(int i = 0; i < parts.length; i++) {
			sum += parts[i].getPrice() * parts[i].getQuantity();
		}
		
		totalvalue = sum * (ipi/100 + 1);
		
		System.out.printf("Please, enter the value IPI tax: %.2f%n", totalvalue);
		
		sc.close();
	}

}
