package br.com.udemy.java.secao18.interfaces.defaultmethods.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao18.interfaces.defaultmethods.services.InterestService;
import br.com.udemy.java.secao18.interfaces.defaultmethods.services.UsaInterestService;

public class MainDefaultMethods {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = scan.nextDouble();

		System.out.print("Months: ");
		int months = scan.nextInt();

		InterestService is = new UsaInterestService(1.0);	
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));

		scan.close();
	}

}
