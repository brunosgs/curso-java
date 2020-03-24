package br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution2.model.entities;

import br.com.udemy.java.secao18.interfaces.herdarecumprircontrato.solution2.model.enums.Color;

public abstract class AbstractShape implements Shape {
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
