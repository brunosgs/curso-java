package br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution1.model.entities;

import br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution1.model.enums.Color;

public abstract class Shape {
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
}
