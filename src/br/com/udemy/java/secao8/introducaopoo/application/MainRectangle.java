package br.com.udemy.java.secao8.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao8.introducaopoo.entities.Rectangle;

public class MainRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		
		System.out.print("Width: ");
		rectangle.setWidth(scan.nextDouble());
		System.out.print("Height: ");
		rectangle.setHeight(scan.nextDouble());
		
		System.out.println("\nAREA = " + rectangle.area());
		System.out.println("PERIMITER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
		scan.close();
	}

}
