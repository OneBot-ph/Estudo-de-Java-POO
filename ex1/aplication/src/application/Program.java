package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rectangle width and height: ");

        Rectangle x = new Rectangle();

        x.height = sc.nextDouble();
        x.width = sc.nextDouble();

        System.out.print(x.toString());

        sc.close();
    }

}
