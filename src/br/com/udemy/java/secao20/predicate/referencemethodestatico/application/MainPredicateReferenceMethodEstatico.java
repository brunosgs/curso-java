package br.com.udemy.java.secao20.predicate.referencemethodestatico.application;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao20.predicate.referencemethodestatico.entities.Product;

public class MainPredicateReferenceMethodEstatico {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Method Reference estático
		list.removeIf(Product::staticProductPredicate);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
