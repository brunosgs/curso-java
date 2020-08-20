package br.com.udemy.java.secao20.function.interfaceconsumer.util;

import java.util.function.Function;

import br.com.udemy.java.secao20.function.interfaceconsumer.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
