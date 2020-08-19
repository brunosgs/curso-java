package br.com.udemy.java.secao20.consumer.interfaceconsumer.util;

import java.util.function.Consumer;

import br.com.udemy.java.secao20.consumer.interfaceconsumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
