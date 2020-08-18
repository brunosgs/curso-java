package br.com.udemy.java.secao20.predicate.interfacepredicate.application;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao20.predicate.interfacepredicate.entities.Product;
import br.com.udemy.java.secao20.predicate.interfacepredicate.util.ProductPredicate;


public class MainPredicateInterface {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(new ProductPredicate());
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
