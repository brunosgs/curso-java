package br.com.udemy.java.secao8.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

public class MainTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double xA;
		double xB;
		double xC;
		double yA;
		double yB;
		double yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%nTriangle Y area: %.4f%n", areaX, areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX == 0 && areaY == 0) {
			System.out.println("Larger areaX and areaY = 0");
		} else {
			System.out.println("Larger area: X");
		}

		scan.close();
	}

}
