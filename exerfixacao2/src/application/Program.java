package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account name: ");
		sc.nextLine();
		String holder = sc.next();
		
		System.out.print("Is the initial deposit (y/n)? ");
		char result = sc.next().charAt(0);
		
		double amount = 0.0;
		if (result == 'y' || result == 'Y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			account = new Account(holder, number, amount);
		}else{
			account = new Account(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println("Updated account data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawvalue = sc.nextDouble();
		account.withdraw(withdrawvalue);
		System.out.println("Updated account data:");
		System.out.print(account);
		
		sc.close();
	}
}
