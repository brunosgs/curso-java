package br.com.udemy.java.secao20.function.lambdadeclarada.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.udemy.java.secao20.function.lambdadeclarada.entities.Product;

public class MainFunctionLambdaDeclarada {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Function<Product, String> funcToUpperCase = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(funcToUpperCase).collect(Collectors.toList());

		names.forEach(System.out::println);
	}

}
