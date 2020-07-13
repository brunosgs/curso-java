package br.com.udemy.java.secao17.manipulandopastas;

import java.io.File;
import java.util.Scanner;

public class MainManipulandoPastas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = scan.nextLine();

		File path = new File(strPath);

		// Cria um vetor com os caminhos das pastas.
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS: ");

		for (File folder : folders) {
			System.out.println(folder);
		}

		// Cria um vetor com os caminhos dos arquivos.
		File[] files = path.listFiles(File::isFile);

		System.out.println("\nFILES: ");

		for (File file : files) {
			System.out.println(file);
		}

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

		scan.close();
	}

}
