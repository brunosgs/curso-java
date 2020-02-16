package br.com.udemy.java.secao14.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao14.entities.Employee;
import br.com.udemy.java.secao14.entities.OutsourcedEmployee;

public class MainEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int nEmployee = scan.nextInt();

		for (int i = 0; i < nEmployee; i++) {
			System.out.println("\nEmployee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)?: ");
			char outsourced = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = scan.nextDouble();
				listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			} else {
				listEmployee.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println("\nPAYMENTS:");
		for (Employee employee : listEmployee) {
			System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}

		scan.close();
	}
}
