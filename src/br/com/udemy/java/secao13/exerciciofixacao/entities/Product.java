package br.com.udemy.java.secao13.exerciciofixacao.entities;

public class Product {
	private String name;
	private double price;

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
