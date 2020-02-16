package br.com.udemy.java.secao8.introducaopoo.util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double currencyPayment(double dollarPrice, double dollarAmount) {
		double payForDollars = dollarPrice * dollarAmount;
		return payForDollars += payForDollars * IOF;
	}
}
