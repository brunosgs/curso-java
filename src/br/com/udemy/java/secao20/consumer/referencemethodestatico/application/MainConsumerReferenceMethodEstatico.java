package br.com.udemy.java.secao20.consumer.referencemethodestatico.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.udemy.java.secao20.consumer.referencemethodestatico.entities.Product;

public class MainConsumerReferenceMethodEstatico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::staticPriceUPdate);

		list.forEach(System.out::println);
	}

}
