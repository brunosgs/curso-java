package br.com.udemy.java.secao20.function.funcaorecebefuncao.model.services;

import java.util.List;
import java.util.function.Predicate;

import br.com.udemy.java.secao20.function.funcaorecebefuncao.entities.Product;

public class ProductService {
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;

		for (Product product : list) {
			if (criteria.test(product)) {
				sum += product.getPrice();
			}
		}

		return sum;
	}
}
