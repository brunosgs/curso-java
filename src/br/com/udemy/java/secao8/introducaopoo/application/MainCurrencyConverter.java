package br.com.udemy.java.secao8.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao8.introducaopoo.util.CurrencyConverter;

public class MainCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = scan.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = scan.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f",
				CurrencyConverter.currencyPayment(dollarPrice, dollarAmount));
		scan.close();
	}

}
