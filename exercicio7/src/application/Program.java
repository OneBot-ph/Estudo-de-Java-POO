package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int temp = sc.nextInt();
		
		int[] vect = new int[temp];
		
		for (int i = 0; i <  vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int numPar = 0;
		System.out.println("\nNUMEROS PARES: ");
		for (int i = 0; i <  vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect [i]);
				numPar++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + numPar);
		
		sc.close(); 
	}

}
