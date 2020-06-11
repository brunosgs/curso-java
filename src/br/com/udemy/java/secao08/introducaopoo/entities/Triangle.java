package br.com.udemy.java.secao08.introducaopoo.entities;

public class Triangle {
	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;

		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}

	public static void verifica(double t1, double t2) {
		if (t1 > t2) {
			System.out.println("Larger area: X");
		} else if (t1 == 0 && t2 == 0) {
			System.out.println("Larger areaX and areaY = 0");
		} else {
			System.out.println("Larger area: X");
		}
	}
}
