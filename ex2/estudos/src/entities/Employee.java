package entities;

public class Employee {
    public String name;
    public Double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage / 100;
    }

    public String toString(){
        return  "Name" + name +", $ " + String.format("%.2f", NetSalary());
    }
}
