package br.com.udemy.java.secao20.objetosprimeiraordem.application;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao20.objetosprimeiraordem.entities.Product;

public class MainObjetoPrimeiraOrdem {
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(MainObjetoPrimeiraOrdem::compareProducts);
		list.forEach(System.out::println);
	}

}
