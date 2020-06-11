package br.com.udemy.java.secao08.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao08.introducaopoo.entities.Triangle;

public class MainTriangle2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%nTriangle Y area: %.4f%n", areaX, areaY);

		Triangle.verifica(areaX, areaY);

		scan.close();
	}

}
