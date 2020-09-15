package br.com.udemy.java.secao20.exercicioresolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.udemy.java.secao20.exercicioresolvido.entities.Product;

public class MainExercicioResolvidoStream {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao20\\exercicioresolvido\\product.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> productList = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

				productList.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();
			}

			double avg = productList.stream().map(product -> product.getPrice()).reduce(0.0, (x, y) -> x + y)
					/ productList.size();

			System.out.println("Average price: " + String.format("%.2f", avg));

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> productNames = productList.stream().filter(product -> product.getPrice() < avg)
					.map(product -> product.getName()).sorted(comp.reversed()).collect(Collectors.toList());

			productNames.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		scan.close();
	}

}
