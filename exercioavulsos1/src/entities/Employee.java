package entities;

public class Employee {
	private String name;
	private double salary;
	private double bonus;
	private double transportTax = 0.04;
	private double inssTax = 0.07;
	private double fgtsTax = 0.08;
	
	public Employee(){
	}
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee(String name, double salary, double bonus){
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
//	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public double getSalary(){
		return salary;
	}

	
//
	
	public void Salary(double grossSalary) {
		this.salary -= (transportTax *  grossSalary); 
		this.salary -= (inssTax  *  grossSalary);
		this.salary -= (fgtsTax  * grossSalary);
		this.salary += bonus;
	}
			
	public void addBonus(double addbonus) {
		this.bonus = addbonus;
	}
	
	public String toString() {
		return "Employee name: " + name + String.format(", Salary: R$ %.2f%n", salary); 
	}
	
	
	
}
