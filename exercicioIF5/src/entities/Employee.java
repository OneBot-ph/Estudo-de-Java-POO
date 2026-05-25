package entities;

public class Employee {

	private Double employeeSalary;
	private Double minimumSalary = 788.00;
	
//-------------
	
	public Employee(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
//-------------

	public Double quantitySalary() {
		return employeeSalary / minimumSalary;
	}
	
}
