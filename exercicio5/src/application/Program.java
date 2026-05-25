package application;

import java.util.Scanner;
import java.util.Locale;	

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quant = sc.nextInt();
		
		double[] vect = new double[quant];
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print( vect[i] + ", ");	
		}
		
		System.out.println();
		
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect [i];
		}
		System.out.printf("soma: %.2f%n", soma);
		
		System.out.println();
		
		double media = soma / vect.length;
		System.out.printf("media: %.2f%n", media);
		
		sc.close();
	}
}
