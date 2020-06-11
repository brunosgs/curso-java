package br.com.udemy.java.secao09.construtor.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao09.construtor.entities.Account;

public class MainBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String cardholderName = scan.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char check = scan.next().charAt(0);

		while (check != 'y' && check != 'n') {
			System.out.print("Invalid option, type (y/n): ");
			check = scan.next().charAt(0);
		}

		if (Account.checkInitialDeposit(check)) {
			System.out.print("Enter initial deposit value: ");
			double deposit = scan.nextDouble();
			account = new Account(accountNumber, cardholderName, deposit);
		} else {
			account = new Account(accountNumber, cardholderName);
		}

		System.out.println("\nAccount data: ");
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		account.deposit(scan.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(scan.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		scan.close();
	}

}
