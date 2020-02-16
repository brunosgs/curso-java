package br.com.udemy.java.secao10.matriz.application;

import java.util.Scanner;

public class MatrizExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Matriz");
		System.out.print("Linha: ");
		int linha = scan.nextInt();
		System.out.print("Coluna: ");
		int coluna = scan.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Posição[%d][%d]: ", i, j);
				matriz[i][j] = scan.nextInt();
			}
		}

//		Imprime os valores da matriz
		System.out.print("\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");

//		Seleciona um valor da matriz e mostra as informações solicitadas
		System.out.printf("Selecione um valor: ");
		int search = scan.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (search == matriz[i][j]) {
					System.out.printf("%nPosition[%d][%d]%n", i, j);
					if (i > 0) {
						System.out.printf("Up: %d%n", matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.printf("Right: %d%n", matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.printf("Down: %d%n", matriz[i + 1][j]);
					}
					if (j > 0) {
						System.out.printf("Left: %d%n", matriz[i][j - 1]);
					}
				}
			}
		}

		scan.close();
	}
}
