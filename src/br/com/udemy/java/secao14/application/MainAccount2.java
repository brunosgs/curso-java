package br.com.udemy.java.secao14.application;

import br.com.udemy.java.secao14.entities.Account;
import br.com.udemy.java.secao14.entities.SavingsAccount;

public class MainAccount2 {

	public static void main(String[] args) {
//		Account acc1 = new Account(1020, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1030, "Bruno", 1000.0, 0.01);

//		acc1.withdraw(50.0);
		acc2.withdraw(50.0);

//		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
	}

}
