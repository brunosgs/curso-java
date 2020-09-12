package br.com.udemy.java.secao20.comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.udemy.java.secao20.comparator.entities.Product;

public class MainExperienciaComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Nesse caso foi criado uma classe anonima, só que de uma forma mais ferbosa.
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		// Nesse comparator a classe ficou menos verbosa, usando a forma lambda.
		@SuppressWarnings("unused")
		Comparator<Product> comp2 = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};

		// Outra forma lambda menos verbosa comparada a comp2.
		@SuppressWarnings("unused")
		Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		// É possivel fazer o comparator em uma classe separada (MyComparator).
		list.sort(comp);

		/*
		 * Ou implementando com lambda diretamente como um argumento, não foi preciso
		 * implicitar que p1 e p2 são do tipo "Product", pois o proprio compilador fez a
		 * tipagem dinâmica/inferência de tipos.
		 */
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product product : list) {
			System.out.println(product);
		}
	}

}
