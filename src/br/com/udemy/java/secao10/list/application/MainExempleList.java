package br.com.udemy.java.secao10.list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainExempleList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(1, "Pedro"); // Adiciona selecioando a posição na lista.

		for (String string : lista) {
			System.out.println(string);
		}
		System.out.println("-----------------");

		System.out.println("Tamanho da lista?: " + lista.size()); // Verifica o tamanho da lista
		System.out.println("-----------------");

//		lista.remove(1);
		lista.removeIf(x -> x.charAt(0) == 'P'); // Remove da lista, verificando o primeiro caracter.

		for (String string : lista) {
			System.out.println(string);
		}
		System.out.println("-----------------");

		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Marco: " + lista.indexOf("Marco"));
		System.out.println("-----------------");

		// Converte a lista em uma stream, filtra pela primeira letra e depois converte
		// novamente a uma lista
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String string : result) {
			System.out.println(string);
		}
		System.out.println("-----------------");

		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
	}
}
