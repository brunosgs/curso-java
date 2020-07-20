package br.com.udemy.java.secao17.exerciciofixacao.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao17.exerciciofixacao.entities.Product;

public class MainExercicioFixacaoArquivos {

	public static void main(String[] args) {
		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao17\\exerciciofixacao";
		String fileInitial = "\\data.csv";
		String outFileSummary = "\\out\\summary.csv";
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path + fileInitial))) {
			String product = br.readLine();

			while (product != null) {
				String[] items = product.split(",");

				String name = items[0];
				Double price = Double.parseDouble((String) items[1]);
				Integer quantity = Integer.parseInt(items[2]);

				products.add(new Product(name, price, quantity));

				product = br.readLine();
			}

			boolean success = new File(path + outFileSummary).exists();

			if (success) {
				System.out.println("Diretorio criado!");
			} else {
				new File(path + "\\out").mkdir();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(path + outFileSummary, true));

				for (Product prod : products) {
					bw.write(prod.toString());
					bw.newLine();
				}

				bw.flush();
				bw.close();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
