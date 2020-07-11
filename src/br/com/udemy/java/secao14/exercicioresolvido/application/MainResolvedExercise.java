package br.com.udemy.java.secao14.exercicioresolvido.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao14.exercicioresolvido.entities.Company;
import br.com.udemy.java.secao14.exercicioresolvido.entities.Individual;
import br.com.udemy.java.secao14.exercicioresolvido.entities.TaxPayer;

public class MainResolvedExercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of taxpayers: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nTaxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c): ");
			char type = scan.next().charAt(0);

			System.out.print("Name: ");
			String name = scan.next();

			System.out.print("Anual income: ");
			Double anualIncome = scan.nextDouble();

			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = scan.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = scan.nextInt();

				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}

		System.out.println("\nTAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}

		double sum = 0;

		for (TaxPayer tp : list) {
			sum += tp.tax();
		}

		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		scan.close();
	}

}
