package br.com.udemy.java.secao6.estruturarepetitiva.repeticaowhile;

import java.util.Scanner;

public class MainReadNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int sum = 0;

		while (x != 0) {
			sum += x;
			x = scan.nextInt();
		}

		System.out.println("SOMA: " + sum);
		scan.close();
	}

}
