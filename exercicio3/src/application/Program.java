package application;

import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter the number of Student and your grades:");
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n", student.missingPoints());
		}else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
