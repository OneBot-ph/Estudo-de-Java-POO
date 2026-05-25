package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int temp = sc.nextInt();
		
		int[] vectA = new int[temp];
		int[] vectB = new int[temp];
		int[] vectC = new int[temp];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vectA.length; i++) {
			System.out.print("Valor do numero " + (i + 1) + " ");
			vectA[i] = sc.nextInt();		
		}
		
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vectB.length; i++) {
			System.out.print("Valor do numero " + (i + 1) + " ");
			vectB[i] = sc.nextInt();		
		}
		
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vectC.length; i++) {
			System.out.println("Valor :" + vectC[i]);
		}

		sc.close();
	}
}
