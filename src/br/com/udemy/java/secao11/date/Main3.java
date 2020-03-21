package br.com.udemy.java.secao11.date;

import java.text.DateFormat;
import java.util.Date;

public class Main3 {
	// Fomatação das datas

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data); // Sat Mar 21 16:59:10 BRT 2020

		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfs.format(data)); // 21/03/20

		DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfm.format(data)); // 21/03/2020

		DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dfl.format(data)); // 21 de Março de 2020

		DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dff.format(data)); // Sábado, 21 de Março de 2020

	}

}
