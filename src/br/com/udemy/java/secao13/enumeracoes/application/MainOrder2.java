package br.com.udemy.java.secao13.enumeracoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao13.enumeracoes.entities.Client;
import br.com.udemy.java.secao13.enumeracoes.entities.Order;
import br.com.udemy.java.secao13.enumeracoes.entities.OrderItem;
import br.com.udemy.java.secao13.enumeracoes.entities.Product;
import br.com.udemy.java.secao13.enumeracoes.entities.enums.OrderStatus;

public class MainOrder2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scan.next());
		Client cliente = new Client(name, email, birthDate);

		System.out.println("\nEnter order data: ");
		System.out.print("Status: ");
		String statusOrder = scan.next();
		System.out.print("How many items to this order? ");
		int nOrders = scan.nextInt();

		Order order = new Order(OrderStatus.valueOf(statusOrder.toUpperCase()), cliente);

		for (int i = 0; i < nOrders; i++) {
			scan.nextLine();
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String nameProduct = scan.nextLine();
			System.out.print("Product price: ");
			double priceProduct = scan.nextDouble();
			System.out.print("Quantity: ");
			int nQuantity = scan.nextInt();

			OrderItem item = new OrderItem(nQuantity, priceProduct, new Product(nameProduct, priceProduct));
			order.addItem(item);
		}

		System.out.println("\nORDER SUMMARY: ");
		System.out.println(order);

		scan.close();
	}

}
