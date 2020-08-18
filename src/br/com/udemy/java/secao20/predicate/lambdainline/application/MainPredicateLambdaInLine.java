package br.com.udemy.java.secao20.predicate.lambdainline.application;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao20.predicate.lambdainline.entities.Product;

public class MainPredicateLambdaInLine {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(p -> p.getPrice() >= 100);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
