package br.com.udemy.java.secao13.enumeracoes.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.udemy.java.secao13.enumeracoes.entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

	private Integer id;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> listaItens = new ArrayList<>();
	private Client client;

	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Order(OrderStatus status, Client client) {
		Calendar cal = Calendar.getInstance();
		this.moment = cal.getTime();
		this.status = status;
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void addItem(OrderItem item) {
		this.listaItens.add(item);
	}

	public void removeItem(OrderItem item) {
		this.listaItens.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public double total() {
		double sum = 0;

		for (OrderItem item : listaItens) {
			sum += item.getPrice() * item.getQuantity();
		}

		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: " + dataHora.format(this.moment));
		sb.append("\nOrder status: " + this.status);
		sb.append("\nClient: " + this.client.getName() + "(" + data.format(this.client.getBirthDate()) + ") - "
				+ this.client.getEmail());
		sb.append("\nOrder items: ");
		for (OrderItem item : listaItens) {
			sb.append("\n" + item.getProduct().getName() + ", ");
			sb.append("$" + String.format("%.2f", item.getPrice()) + ", ");
			sb.append("Quantity: " + item.getQuantity() + ", ");
			sb.append("Subtotal: $" + String.format("%.2f", item.subTotal()));
		}
		sb.append("\nTotal price: $" + String.format("%.2f", this.total()));
		return sb.toString();
	}

}
