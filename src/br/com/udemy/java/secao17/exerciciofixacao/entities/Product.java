package br.com.udemy.java.secao17.exerciciofixacao.entities;

public class Product {
	private String name;
	private Double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double total() {
		return this.price * this.quantity;
	}

	@Override
	public String toString() {
		return name + "," + total();
	}

}
