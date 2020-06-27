package br.com.udemy.java.secao19.curingasdelimitados.example1.application;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao19.curingasdelimitados.example1.entities.Circle;
import br.com.udemy.java.secao19.curingasdelimitados.example1.entities.Rectangle;
import br.com.udemy.java.secao19.curingasdelimitados.example1.entities.Shape;

public class MainCouringasDelimitados {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();

		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();

		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;

		for (Shape s : list) {
			sum += s.area();
		}

		return sum;
	}

}
