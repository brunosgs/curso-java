package br.com.udemy.java.secao10.list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao10.list.entities.Employee;

public class MainEmplyee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<>();

		System.out.print("How many employees will be regisered?: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("ID: ");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Salary: ");
			double salary = scan.nextDouble();

			listEmployee.add(new Employee(id, name, salary));
			System.out.println("--------------------------");
		}

		System.out.print("Enter the employee id that will hava salary increase: ");
		int idIncrease = scan.nextInt();

		Employee employee = listEmployee.stream().filter(e -> e.getId() == idIncrease).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println("\nList of employees: ");
		for (Employee e : listEmployee) {
			System.out.println(e);
		}
		
		scan.close();
	}
}
