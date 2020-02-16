package br.com.udemy.java.secao15.exceptions.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException2 {

	public static void main(String[] args) {
		methodException1();

		System.out.println("End of program!");
	}

	public static void methodException1() {
		System.out.println("*** 1 - METHOD EXCEPTION START ***");

		methodException2();

		System.out.println("*** 1 - METHOD EXCEPTION END ***");

	}

	public static void methodException2() {
		System.out.println("*** 2 - METHOD EXCEPTION START ***");
		Scanner scan = new Scanner(System.in);

		try {
			String[] vet = scan.nextLine().split(" ");
			int position = scan.nextInt();

			System.out.println(vet[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position: ");
			e.printStackTrace();
			scan.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error: " + e);
		}

		scan.close();
		System.out.println("*** 2 - METHOD EXCEPTION END ***");
	}

}
