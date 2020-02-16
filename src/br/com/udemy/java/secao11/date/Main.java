package br.com.udemy.java.secao11.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date horaAtual = new Date(); // Data atual do sistema
		Date horaAtualMili = new Date(System.currentTimeMillis()); // Data atual milisigundos

		Date data1 = sdf1.parse("25/06/2018");
		Date data2 = sdf2.parse("25/06/2018 20:43:37");
		Date data3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("--------------- HORA ATUAL ---------------");
		System.out.println("Hora atual: " + horaAtual);
		System.out.println("Hora atual (formatada): " + sdf2.format(horaAtual));
		System.out.println("Hora atual (milisegundos): " + horaAtualMili);

		System.out.println("\n--------- HORA MANUALMENTE ---------");
		System.out.println("Data1: " + data1);
		System.out.println("Data2: " + data2);
		System.out.println("Data2: " + data3);

		System.out.println("\n---- HORA MANUALMENTE (formatada) ----");
		System.out.println("Data1 (formatada): " + sdf1.format(data1));
		System.out.println("Data2 (formatada): " + sdf2.format(data2));
		System.out.println("Data2 (formatada): " + sdf2.format(data3));
		System.out.println("Data2 (formatada): " + sdf3.format(data3));
		
	}

}
