package br.com.udemy.java.secao17.filewriterbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good noght" };

		String path = "\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao17\\filewriterbufferedwriter\\out.txt";

		// Se não adionando o parametro true em FileWrite(<caminho_arquivo>, true), o
		// arquivo é recriado. Com o parametro true adicionado no parametro é só
		// incluido os novos itens dentro do arquivo sem recrialo!
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
