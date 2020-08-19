package br.com.udemy.java.secao20.consumer.lambdadeclarada.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.udemy.java.secao20.consumer.lambdadeclarada.entities.Product;

public class MainConsumerLambdaDeclarada {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		double factor = 1.1;

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * factor);
		};

		list.forEach(consumer);

		list.forEach(System.out::println);
	}

}
