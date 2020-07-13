package br.com.udemy.java.secao17.infospath;

import java.io.File;
import java.util.Scanner;

public class MainInfosPaths {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a file path: ");
		String strPath = scan.nextLine();

		File path = new File(strPath);

		// getName() busca o nome do arquivo.
		System.out.println("getName: " + path.getName());

		// getParent() busca o caminho do arquivo.
		System.out.println("getParent: " + path.getParent());

		// getParent() busca o caminho completo do arquivo.
		System.out.println("getPath: " + path.getPath());

		scan.close();
	}

}
