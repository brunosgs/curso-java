package br.com.udemy.java.secao8.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao8.introducaopoo.entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		System.out.println("\nProduct data: " + product);

		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		System.out.println("\nUpdate data: " + product);

		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdate data: " + product);
		scan.close();
	}

}
