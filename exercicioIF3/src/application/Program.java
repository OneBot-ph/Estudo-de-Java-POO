package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		int saldo = 0, reajuste = 0;
		
		System.out.print("Imprima o saldo da conta: ");
		saldo = sc.nextInt();
		
		reajuste = saldo + (saldo * 1)/100;
		saldo = reajuste;
		
		System.out.printf("Saldo da conta: ", saldo);
		
		
		sc.close();
	}

}
