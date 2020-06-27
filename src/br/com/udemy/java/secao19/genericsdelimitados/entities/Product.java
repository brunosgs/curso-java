package br.com.udemy.java.secao19.genericsdelimitados.entities;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;

	public Product(String nome, Double price) {
		this.name = nome;
		this.price = price;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}

}
