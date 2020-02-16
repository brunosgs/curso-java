package br.com.udemy.java.secao14.abstrato.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao14.abstrato.entities.Circle;
import br.com.udemy.java.secao14.abstrato.entities.Rectangle;
import br.com.udemy.java.secao14.abstrato.entities.Shape;
import br.com.udemy.java.secao14.abstrato.entities.enums.Color;

public class MainGeometricalFigures {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		List<Shape> listShape = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int nShapes = scan.nextInt();

		for (int i = 0; i < nShapes; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c): ");
			char select = scan.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next().toUpperCase());

			if (select == 'r') {
				System.out.print("Width: ");
				Double width = scan.nextDouble();
				System.out.print("Height: ");
				Double height = scan.nextDouble();

				listShape.add(new Rectangle(color, width, height));
			} else if (select == 'c') {
				System.out.print("Radius: ");
				Double radius = scan.nextDouble();

				listShape.add(new Circle(color, radius));
			}
		}

		System.out.println("\nSHAPE AREAS: ");
		for (Shape shape : listShape) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		scan.close();
	}

}
