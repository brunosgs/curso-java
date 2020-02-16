package br.com.udemy.java.secao4.estruturasequencial;
import java.util.Scanner;

public class FuncoesMatematicas {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double j = 0;
		double k = 0;
		double l = 0;

		j = Math.sqrt(x);
		k = Math.sqrt(y);
		l = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + j);
		System.out.println("Raiz quadrada de " + y + " = " + k);
		System.out.println("Raiz quadrada de 25 = " + l);
		System.out.println();

		j = Math.pow(x, y);
		k = Math.pow(x, 2.0);
		l = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + j);
		System.out.println(x + " elevado ao quadrado = " + k);
		System.out.println("5 elevado ao quadrado = " + l);
		System.out.println();

		j = Math.abs(y);
		k = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + j);
		System.out.println("Valor absoluto de " + z + " = " + k);

		double a = 0;
		double b = 0;
		double c = 0;

		System.out.println("Fórmula de Bhaskara:");
		System.out.print("Digite o valor de a: ");
		a = scan.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = scan.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = scan.nextDouble();

		double delta = Math.pow(b, 2.0) - (4 * a * c);
		System.out.println("O resultado é: " + delta);

		double mult = (2.0 * a);

		double x1 = (-b + Math.sqrt(delta)) / mult;
		double x2 = (-b - Math.sqrt(delta)) / mult;

		System.out.printf("x1 = %.2f e x2 = %.2f", x1, x2);

		scan.close();
	}
}
