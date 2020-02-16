package br.com.udemy.java.secao10.matriz.application;

import java.util.Scanner;

public class MainMatrizExemple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Tamanho da matriz (Linha/Coluna): ");
		int n = scan.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Posição[%d][%d]: ", i, j);
				matriz[i][j] = scan.nextInt();
			}
		}

		System.out.println("\nMain diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Posição[%d][%d]: %d%n", i, i, matriz[i][i]);
		}

		int count = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.printf("%nNegative numbers = %d", count);

		scan.close();
	}

}
