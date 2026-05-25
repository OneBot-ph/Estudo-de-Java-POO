package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.People;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double sum = 0.0, avg = 0.0, calculator; ;
		int  sumyears = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quant = sc.nextInt();
		People [] vect = new People[quant];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa: ");
			sc.nextLine();
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("Years Old: ");
			int yearsOld = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			vect[i] = new People(name, yearsOld, height);
			
		}
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}		
		avg = sum / vect.length;

		System.out.printf("height average: %.2f%n", avg);
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getyearsOld() < 16) {
				sumyears++;
			}
		}
		calculator = (sumyears * 100) / vect.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", calculator);
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getyearsOld() < 16) {
				System.out.print(vect[i].getName() + " ");
			}
		}
		
		
		sc.close();
	}
}
