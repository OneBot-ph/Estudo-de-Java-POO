package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);

		double avg = 0.0, sum = 0.0;

		System.out.print("Quantos elementos vai ter o vetor? ");
		int temp = sc.nextInt();
		
		double[] vect = new double[temp];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		avg = sum / vect.length;
	
	    System.out.printf("\nMEDIA DO VETOR = %.3f\n", avg);
			
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] < avg) {
				System.out.printf("%.1f%n",vect[i]);
			}
		
		}
		
		
		sc.close();
	}

}
