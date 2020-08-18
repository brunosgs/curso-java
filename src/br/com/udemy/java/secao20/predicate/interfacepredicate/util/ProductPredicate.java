package br.com.udemy.java.secao20.predicate.interfacepredicate.util;

import java.util.function.Predicate;

import br.com.udemy.java.secao20.predicate.interfacepredicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}

}
