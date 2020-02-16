package br.com.udemy.java.secao14.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao14.entities.ImportedProduct;
import br.com.udemy.java.secao14.entities.Product;
import br.com.udemy.java.secao14.entities.UsedProduct;

public class MainProduct {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Product> listProduct = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int nProducts = scan.nextInt();

		for (int i = 0; i < nProducts; i++) {
			System.out.println("\nProduct #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c / u / i)?: ");
			char select = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Price: ");
			Double price = scan.nextDouble();
			if (select == 'c') {
				listProduct.add(new Product(name, price));
			} else if (select == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(scan.next());
				listProduct.add(new UsedProduct(name, price, manufacture));
			} else if (select == 'i') {
				System.out.print("Customs fee: ");
				Double customs = scan.nextDouble();
				listProduct.add(new ImportedProduct(name, price, customs));
			} else {
				System.out.println("Nenhuma valor selecionado, reinicie o software!");
			}
		}

		System.out.println("\nPRICE TAGS: ");
		for (Product product : listProduct) {
			System.out.println(product.priceTag());
		}

		scan.close();
	}

}
