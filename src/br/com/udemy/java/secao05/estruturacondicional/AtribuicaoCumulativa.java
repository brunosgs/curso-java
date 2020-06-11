package br.com.udemy.java.secao05.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoCumulativa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double conta = 50.00;

		System.out.print("Digite os minutos: ");
		int minutos = scan.nextInt();

		if (minutos > 100) {
			System.out.println("Foram " + minutos + " minutos consumidos");
			conta += (minutos - 100) * 2.00;
			System.out.printf("Valor da conta a pagar R$%.2f", conta);
		}
		scan.close();
	}
}
