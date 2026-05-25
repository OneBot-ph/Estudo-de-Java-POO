package entities;

public class Account {
	private String holder;
	private int number;
	private double bankbalance;
	
	public Account(){
	}
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
		
	}
	
	public Account(String holder, int number, double bankbalance) {
		this.holder = holder;
		this.number = number;
	 	deposit(bankbalance);
	}
	
	
//  getters e Setters 	
	
	public String getholder() {
		return holder;
	}
	
	public void setholder(String holder) {
		this.holder = holder; 
	}
	
	public int getnumber() {
		return number;
	}
	
	public double getbankbalance() {
		return bankbalance;
	}
	
	//---------------------------------
	
	public void deposit(double amount) {
		bankbalance +=  amount;
	}
	
	public void withdraw(double amount) {
		bankbalance -= amount + 5.0;
	}
	
	public String toString() {
		return "Accont " + number + ", account name: " + holder + String.format(", Balance: %.2f%n", bankbalance);
	}
	
}
