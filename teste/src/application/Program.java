package application;

import java.util.Scanner;
import entities.Pacote;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor numerico: ");
		Pacote a = new Pacote();
		a.x = sc.nextInt();
		
		System.out.print("Valor = "+ a.soma());
		
		sc.close();
	}

}
