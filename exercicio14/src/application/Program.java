package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		
		List<Employee> listemp = new ArrayList<>();
		
		int id = 0, size = 0;
		String name = null;
		double percentage = 0.0, salary = 0.0;
		
		
//----------------------
		
		System.out.print("How many employees will be registered? ");
		size = sc.nextInt();
		
		
//----------------------
		
		for(int i = 0; i < size; i++) {
			System.out.printf("%nEmplyoee #%d: %n", (i + 1));
			
			System.out.print("Id: ");
			id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			listemp.add(emp);
		}
		
		
//----------------------
		
		System.out.printf("%nEnter the employee id that will have salary increase : ");
		id = sc.nextInt();
		
		boolean status = true;
		do {
		for (Employee x : listemp) {
				if (id == x.getId()) {
					System.out.print("Enter the percentage: ");
					percentage = sc.nextDouble();
					x.increseSalary(percentage);
					status = false;
				}
		}
		
		if (status == true) {
			System.out.print("This id does not exist! Please enter the correct id: ");
			id = sc.nextInt();
		}
		}while(status == true);

		
//----------------------
		System.out.println("");
		
		for (Employee x : listemp) {	
			System.out.println(x.getName() +", "+ x.getId()+", "+ x.getSalary());
		}	
		
		sc.close();
	}

}
