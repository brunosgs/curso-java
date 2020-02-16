package br.com.udemy.java.secao14.application;

import br.com.udemy.java.secao14.entities.Account;
import br.com.udemy.java.secao14.entities.BusinessAccount;
import br.com.udemy.java.secao14.entities.SavingsAccount;

public class MainAccount {

	public static void main(String[] args) {
//		Account acc1 = new Account(1001, "Bruno", 1000.0);
		BusinessAccount bacc1 = new BusinessAccount(1002, "Heloise", 0.0, 500.0);

		// UPCASTING - (CASTING DA SUBCLASSE PARA SUPERCLASSE)

		Account acc2 = bacc1;
		Account acc3 = new BusinessAccount(1003, "Pedro", 1000.0, 500.0);
		Account acc4 = new SavingsAccount(1004, "Aba", 1000.0, 0.01);

		// DOWNCASTING - (CASTING DA SUPERCLASSE PARA SUBCLASSE)

		BusinessAccount bacc2 = (BusinessAccount) acc2;
		bacc2.loan(100.0);

		// EXCEPTION
		// BusinessAccount bacc3 = (BusinessAccount) acc4;

		if (acc4 instanceof BusinessAccount) {
			BusinessAccount bacc3 = (BusinessAccount) acc4;
			bacc3.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc4 instanceof SavingsAccount) {
			SavingsAccount sacc1 = (SavingsAccount) acc4;
			sacc1.updateBalance();
			System.out.println("Update!");
		}

//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		acc4.withdraw(200.0);
		System.out.println(acc4.getBalance());
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}
}
