package br.com.udemy.java.secao18.interfaces.interfacecomparable.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.udemy.java.secao18.interfaces.interfacecomparable.entities.Employee;

public class MainInterfaceComparable {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "D:\\workspace\\ws-udemy\\curso-programacao\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");

				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}

			/*
			 * Deve ser implementado na classe a interface Comparable e adicionado o método
			 * compareTo()
			 */
			Collections.sort(list);

			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
