package br.com.udemy.java.secao20.exerciciofixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.udemy.java.secao20.exerciciofixacao.entities.Employee;

public class MainExercicioFixacaoStream {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao20\\exerciciofixacao\\people.csv";

		System.out.print("Enter salary: ");
		Double inSalary = scan.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> listPeople = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

				listPeople.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

				line = br.readLine();
			}

			Comparator<String> comp = (a, b) -> a.compareTo(b);
			List<String> listEmails = listPeople.stream().filter(people -> people.getSalary() > inSalary)
					.map(people -> people.getEmail()).sorted(comp).collect(Collectors.toList());

			System.out.println("Emails of people whose salary is more than " + String.format("%.2f", inSalary));
			listEmails.forEach(System.out::println);

			double sum = listPeople.stream().filter(people -> people.getName().charAt(0) == 'M')
					.map(people -> people.getSalary()).reduce(0.0, (a, b) -> a + b);

			System.out.println("\nSum of salary of people whose  name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

		scan.close();
	}
}
