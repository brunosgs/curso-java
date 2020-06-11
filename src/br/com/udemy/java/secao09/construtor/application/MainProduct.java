package br.com.udemy.java.secao09.construtor.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao09.construtor.entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Price: ");
		double price = scan.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = scan.nextInt();

//		Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);

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
