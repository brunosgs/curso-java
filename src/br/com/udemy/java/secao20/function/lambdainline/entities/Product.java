package br.com.udemy.java.secao20.function.lambdainline.entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean nonStaticProductPredicate() {
		return this.price >= 100;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
