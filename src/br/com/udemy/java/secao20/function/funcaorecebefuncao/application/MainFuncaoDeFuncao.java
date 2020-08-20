package br.com.udemy.java.secao20.function.funcaorecebefuncao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.udemy.java.secao20.function.funcaorecebefuncao.entities.Product;
import br.com.udemy.java.secao20.function.funcaorecebefuncao.model.services.ProductService;

public class MainFuncaoDeFuncao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();

		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);

		System.out.println("Sum: " + String.format("%.2f", sum));
	}

}
