package br.com.udemy.java.secao19.set.example3.application;

import java.util.Set;
import java.util.TreeSet;

import br.com.udemy.java.secao19.set.example3.entities.Product;

public class MainTreeSet {

	public static void main(String[] args) {
		// Quando utilizado o treeset a classe do conjunto, nesse caso 'Product' deve
		// implementar Comparable<>.
		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for (Product p : set) {
			System.out.println(p);
		}
	}

}
