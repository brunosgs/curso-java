package br.com.udemy.java.secao11.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(date));

		// Soma uma unidade de tempo
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		date = cal.getTime();

		System.out.println(date);
		System.out.println("\n-----------------------");

		// Obtendo uma unidade de tempo
		date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);

		int minutes = cal2.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);

		int month = 1 + cal2.get(Calendar.MONTH);
		System.out.println("Month: " + month);

	}

}
