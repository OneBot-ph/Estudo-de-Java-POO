package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		double  maioraltura = 0.0, menoraltura = 0.0, media = 0, sumaltura = 0;
		int quantidadef = 0, quantidadem = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int vlvect = sc.nextInt();
		
		char[] generos = new char[vlvect];
		double[] alturas = new double[vlvect];
		
		for(int i = 0; i < vlvect; i++) {
			System.out.printf("Altura da %da pessoa: ", (i + 1));
			alturas[i] = sc.nextDouble();
			System.out.printf("genero da %da pessoa: ", (i + 1));
			generos[i] = sc.next().charAt(0);
		}
		
//--------------------------------------------------------------		
						
		menoraltura = alturas[0];
		maioraltura = alturas[0];
		
		for(int i = 0; i < vlvect; i++) {
			if (alturas[i] > maioraltura) {
				maioraltura = alturas[i];
			}
			if (alturas[i] < menoraltura) {
				menoraltura = alturas[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menoraltura);
		System.out.printf("Maior altura = %.2f%n", maioraltura);

		
//--------------------------------------------------------------		
		
		for(int i = 0; i < vlvect; i++) {
			if (generos[i] == 'f' || generos[i] == 'F') {
				sumaltura += alturas[i];
				quantidadef++;
			}else{
				quantidadem++;
			}
		}
		
		media = sumaltura / quantidadef;

		
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);

		
//--------------------------------------------------------------		
		
				
		System.out.println("Numero de homens = "+ quantidadem);
	
		
		sc.close();
	}

}
