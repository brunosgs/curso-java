package br.com.udemy.java.secao13.enumeracoes.application;

import java.util.Date;

import br.com.udemy.java.secao13.enumeracoes.entities.Order;
import br.com.udemy.java.secao13.enumeracoes.entities.enums.OrderStatus;

public class MainOrder {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
