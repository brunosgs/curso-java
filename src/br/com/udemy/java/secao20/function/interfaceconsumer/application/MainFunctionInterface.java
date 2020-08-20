package br.com.udemy.java.secao20.function.interfaceconsumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import br.com.udemy.java.secao20.function.interfaceconsumer.entities.Product;
import br.com.udemy.java.secao20.function.interfaceconsumer.util.UpperCaseName;

public class MainFunctionInterface {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Fun��o map() obtem uma cole��o de valores e aplica a cada item dessa cole��o
		 * a fun��o passada por parametro, nessa exemplo foi utilizada a fun��o
		 * UpperCaseName(), onde nela � definada todas as configura��es necessarias para
		 * que seja aplicada o resultado.
		 */
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}

}
