package br.com.udemy.java.secao14.exerciciofixacao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao14.exerciciofixacao.entities.Company;
import br.com.udemy.java.secao14.exerciciofixacao.entities.Individual;
import br.com.udemy.java.secao14.exerciciofixacao.entities.TaxPayer;

public class MainPayers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		List<TaxPayer> listTaxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int nPayers = scan.nextInt();

		for (int i = 0; i < nPayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)?: ");
			char select = scan.next().charAt(0);
			scan.nextLine();
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = scan.nextDouble();

			if (select == 'i') {
				System.out.print("Health expenditures: ");
				Double health = scan.nextDouble();

				listTaxPayers.add(new Individual(name, anualIncome, health));
			} else if (select == 'c') {
				System.out.print("Number of employees: ");
				int nEmployees = scan.nextInt();

				listTaxPayers.add(new Company(name, anualIncome, nEmployees));
			}
		}

		System.out.println("\nTAXES PAID: ");

		Double taxPayerTotal = 0.0;

		for (TaxPayer taxPayer : listTaxPayers) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			taxPayerTotal += taxPayer.tax();
		}

		System.out.printf("%nTOTAL TAXES: $ %.2f", taxPayerTotal);

		scan.close();
	}
}
