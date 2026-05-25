package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		int maioridade, posicaomaior = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int temp = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[temp];
		int[] idade = new int[temp];
		
		for(int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", (i +1));
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		maioridade = idade[0];
		
		for(int i = 0; i < nome.length; i++) {
			if(idade[i] > maioridade) {
				maioridade = idade[i];
				posicaomaior = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: "+ nome[posicaomaior]);
		
		sc.close();
	}
}
