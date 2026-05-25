package aplication;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		int m, n, number, cont;
		
//-------------------
		System.out.println("Enter the size Matrix: ");
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
//-------------------
		System.out.printf("Enter the value Matrix: %n");
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}	
		}
		
//-------------------
		
		System.out.print("Enter the number for Matrix: ");
		number = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.printf("%nPosition : (%d , %d)%n", i, j);
					
					if (j > 0) {
						System.out.println("Left: "+ mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("up: "+ mat[i - 1][j]);
					}
					if (j < mat[i].length -1) {
						System.out.println("Right: "+ mat[i][j + 1]);
					}
					if (i < mat.length -1) {
						System.out.println("Down: "+ mat[i + 1][j]);
					}
				}

			}
		}
		
		
		
		sc.close();
	}

}
