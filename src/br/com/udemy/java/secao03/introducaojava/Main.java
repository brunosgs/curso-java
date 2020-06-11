package br.com.udemy.java.secao03.introducaojava;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		String nome = "Bruno";
		int i = 32;
		int idade = 25;
		double d = 10.35784;
		double renda = 1800.00;

		System.out.println(i);
		System.out.println(d);
		System.out.printf("%.2f%n", d);
		System.out.printf("%.4f%n", d);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", d);

		System.out.println("RESULTADO = " + d + " METROS");

		System.out.printf("RESULTADO = %.2f METROS%n", d);

		System.out.printf("%s tem %d de idade e o salário é %.2f", nome, idade, renda);
	}
}
