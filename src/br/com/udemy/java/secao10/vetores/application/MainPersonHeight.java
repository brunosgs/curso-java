package br.com.udemy.java.secao10.vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class MainPersonHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Tamanho: ");
		int n = scan.nextInt();

		double[] vect = new double[n];
		double sum = 0;

		System.out.println("Digite " + n + " números...");

		for (int i = 0; i < n; i++) {
			System.out.printf("Numero %d: ", i + 1);
			vect[i] = scan.nextDouble();
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT = %.2f", avg);

		scan.close();
	}

}
