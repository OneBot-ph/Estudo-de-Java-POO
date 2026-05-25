package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		double avg, sum = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int temp = sc.nextInt();
		
		int [] vect = new int[temp];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		temp = 0;
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				temp++;
			}
		}
		
		if(sum == 0) {
			System.out.printf("Nenhum Numero Par");
		}else {
			avg = sum / temp;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		}
		
		sc.close();
	}

}
