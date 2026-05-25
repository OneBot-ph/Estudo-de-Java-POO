package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee employee;
		
		System.out.print("Enter the employee name: ");
		String name = sc.nextLine();
		System.out.print("Enter the your gross salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.print("Is the initial bonus? (y/n): ");
		char result = sc.next().charAt(0);
		
		double bonus;
		if (result == 'y' || result == 'Y') {
			bonus = sc.nextDouble();
			employee = new Employee(name, grossSalary, bonus);
		}else {
			employee = new Employee(name, grossSalary);
		}
		

		System.out.println();
		employee.Salary(grossSalary);
		System.out.println("New employee data;");
		System.out.println(employee);
		
		System.out.print("Is the additional bonus? (y/n): ");
		result = sc.next().charAt(0);
		
		if (result == 'y' || result == 'Y') {
			bonus = sc.nextDouble();
			employee.addBonus(bonus);

			System.out.println();
			employee.Salary(grossSalary);
			System.out.println("Update employee data;");
			System.out.println(employee);
		}
		
		
		System.out.print("Is the alteration employee name? (y/n): ");

		if (result == 'y' || result == 'Y') {

			name = sc.nextLine();
			employee.setname(name);
			System.out.println("Update employee data;");
			System.out.println(employee);
		}
				
		sc.close();
		}
}
