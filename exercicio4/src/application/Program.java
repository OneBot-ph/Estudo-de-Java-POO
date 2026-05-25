package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce ira digitar? ");
		int n = sc.nextInt();
		
		while(n > 10) {
			System.out.print("digite um numero menor ou igual a 10: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int [n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = number;
		}
		
		System.out.println();
		
		System.out.println("Numeros negativos");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
