package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);

		double employeeSalary;

		System.out.print("Enter the your salary: ");
		employeeSalary = sc.nextDouble();

		Employee empSalary = new Employee(employeeSalary);
		System.out.println();
		System.out.printf("Number of minimum salarys:  %.2f%n", empSalary.quantitySalary());

		sc.close();
	}

}
