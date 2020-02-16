package br.com.udemy.java.secao10.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao10.vetores.entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Tamanho: ");
		int n = scan.nextInt();

		Product[] vectProduct = new Product[n];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < vectProduct.length; i++) {
			System.out.println("------------------------");
			System.out.printf("Product: %d%n", i + 1);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();

			vectProduct[i] = new Product(name, price);

			sum += vectProduct[i].getPrice();
		}

		avg = sum / vectProduct.length;

		System.out.printf("%nAVERAGE PRICE = %.2f", avg);

		scan.close();
	}

}
