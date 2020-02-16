package br.com.udemy.java.secao15.exceptions.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			String[] vet = scan.nextLine().split(" ");
			int position = scan.nextInt();

			System.out.println(vet[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position: " + e);
		} catch (InputMismatchException e) {
			System.out.println("Input error: " + e);
		}

		System.out.println("End of program");
		scan.close();
	}

}
