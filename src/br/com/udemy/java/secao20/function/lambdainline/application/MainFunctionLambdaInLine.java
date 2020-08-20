package br.com.udemy.java.secao20.function.lambdainline.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.udemy.java.secao20.function.lambdainline.entities.Product;

public class MainFunctionLambdaInLine {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}

}
