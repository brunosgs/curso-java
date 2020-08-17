package br.com.udemy.java.secao20.comparator.application;

import java.util.Comparator;

import br.com.udemy.java.secao20.comparator.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
