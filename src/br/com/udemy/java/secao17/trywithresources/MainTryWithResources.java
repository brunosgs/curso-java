package br.com.udemy.java.secao17.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTryWithResources {

	public static void main(String[] args) {
		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao17\\trywithresources\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
