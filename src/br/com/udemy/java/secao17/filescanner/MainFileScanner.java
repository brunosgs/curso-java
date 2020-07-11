package br.com.udemy.java.secao17.filescanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainFileScanner {

	public static void main(String[] args) {
		File file = new File("\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao17\\filescanner\\in.txt");
		Scanner scan = null;

		try {
			scan = new Scanner(file);

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
