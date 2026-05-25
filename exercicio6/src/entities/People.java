package entities;

public class People {
	private String name;
	private int yearsOld;
	private double height;
	
	public People(String name, int yearsOld, double height){
		this.name = name;
		this.yearsOld = yearsOld;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public int getyearsOld() {
		return yearsOld;
	}
	
	public double getHeight() {
		return height;
	}
	
}
