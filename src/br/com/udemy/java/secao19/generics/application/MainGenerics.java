package br.com.udemy.java.secao19.generics.application;

import java.util.Scanner;

import br.com.udemy.java.secao19.generics.services.PrintService;

public class MainGenerics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PrintService<String> printService = new PrintService<>();

		System.out.print("How many values? ");
		int n = scan.nextInt();
		

		for (int i = 0; i < n; i++) {
			String value = scan.next();

			printService.addValue(value);
		}

		printService.print();

		System.out.println("First: " + printService.first());

		scan.close();
	}

}
