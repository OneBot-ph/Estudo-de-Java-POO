package application;

import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("name");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary:");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("Tax");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: "+ emp);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println("Updated data: "+ emp);

        sc.close();
    }


}


