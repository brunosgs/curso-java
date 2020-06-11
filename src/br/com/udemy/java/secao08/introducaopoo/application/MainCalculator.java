package br.com.udemy.java.secao08.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao08.introducaopoo.util.Calculator;

public class MainCalculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();

		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);

		scan.close();
	}

}
