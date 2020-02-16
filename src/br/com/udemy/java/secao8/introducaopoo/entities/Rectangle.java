package br.com.udemy.java.secao8.introducaopoo.entities;

public class Rectangle {
	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return 2 * (this.width + this.height);
	}

	public double diagonal() {
		double soma = Math.pow(this.width, 2) + Math.pow(this.height, 2);
		double result = Math.sqrt(soma);

		return result;
	}
}
