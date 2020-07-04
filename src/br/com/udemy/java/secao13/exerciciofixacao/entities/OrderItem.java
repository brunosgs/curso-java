package br.com.udemy.java.secao13.exerciciofixacao.entities;

public class OrderItem {
	private int quantity;
	private double price;
	private Product product;

	public OrderItem() {

	}

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public double subTotal() {
		return this.quantity * this.price;
	}
}
