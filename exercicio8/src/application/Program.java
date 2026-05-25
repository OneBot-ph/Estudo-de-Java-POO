package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int temp = sc.nextInt();		
		
		double[] vect = new double[temp];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double numM = 0.0;
		temp = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > numM){
				numM = vect[i];
				temp = i;
			}
		}
		System.out.printf("\n\nMaior valor = %.1f%n", numM);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", temp);
		
		
		sc.close();
	}

}
