package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		
		int media1, media2, somamedias, mediafinal;
		
		media1 = (9 + 8 + 7) / 3;
		media2 = (4 + 5 + 6) / 3;
		somamedias = media1 + media2;
		mediafinal = somamedias / 2;
		
		System.out.println("Primeira media: "+ media1);
		System.out.println("segunda media: "+ media2);
		System.out.println("Soma das medias: " + somamedias);
		System.out.println("Media final: " + mediafinal);
		
		sc.close();
	}

}
