package br.com.udemy.java.secao15.exercices.application;

import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import br.com.udemy.java.secao15.exercices.model.entities.Account;

public class MainAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account data ");
		System.out.print("Number: ");
		Integer number = scan.nextInt();
		scan.nextLine();
		System.out.print("Holder: ");
		String holder = scan.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = scan.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = scan.nextDouble();

		Account acc = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.print("\nEnter amount for withdraw: ");
		Double withdraw = scan.nextDouble();
		
		try {
			acc.withdraw(withdraw);
			System.out.println(acc);
		} catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		scan.close();
	}

}
