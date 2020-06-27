package br.com.udemy.java.secao19.hashcodeequals.application;

import br.com.udemy.java.secao19.hashcodeequals.entities.Client;

public class MainHashEquals {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		String s3 = new String("Test");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s3);

		// Dessa forma o compilador faz um tratameto especial e retorna TRUE, a escrita
		// foi literal.
		System.out.println(s1 == s2);

	}

}
