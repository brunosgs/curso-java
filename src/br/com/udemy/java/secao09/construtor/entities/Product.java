package br.com.udemy.java.secao09.construtor.entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Métodos da classes
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantityStock) {
		this.quantity += quantityStock;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}

}
