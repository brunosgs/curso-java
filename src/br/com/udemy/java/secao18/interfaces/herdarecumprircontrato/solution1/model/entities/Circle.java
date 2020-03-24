package br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution1.model.entities;

import br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution1.model.enums.Color;

public class Circle extends Shape {
	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
