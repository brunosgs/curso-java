package br.com.udemy.java.secao17.filereaderbufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainReader {
	/**
	 * Essa forma de implementação de leitura executando as streams de arquivos é a
	 * mais verbosa, tendo que abrir manualmente e inicializar os readers.
	 */

	public static void main(String[] args) {
		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao17\\filereaderbufferedreader\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
