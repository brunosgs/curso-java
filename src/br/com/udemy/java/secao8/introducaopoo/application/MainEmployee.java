package br.com.udemy.java.secao8.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao8.introducaopoo.entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.setName(scan.nextLine());
		System.out.print("Gross salary: ");
		employee.setGrossSalary(scan.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(scan.nextDouble());

		System.out.println("\n" + employee);

		System.out.print("\nWhich percentage to increase salary? ");
		employee.increaseSalary(scan.nextDouble());

		System.out.println("\nUpdated data: " + employee);
		
		scan.close();
	}

}
