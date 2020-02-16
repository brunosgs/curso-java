package br.com.udemy.java.secao9.construtor.entities;

public class Account {
	private final double TAXA = 5;
	private int accountNumber;
	private String cardholderName;
	private double deposit;

	public Account() {
	}

	public Account(int accountNumber, String cardholderName) {
		this.accountNumber = accountNumber;
		this.cardholderName = cardholderName;
	}

	public Account(int accountNumber, String cardholderName, double deposit) {
		this.accountNumber = accountNumber;
		this.cardholderName = cardholderName;
		deposit(deposit);
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public static boolean checkInitialDeposit(char check) {
		if (check == 'y') {
			return true;
		} else {
			return false;
		}
	}

	public void deposit(double deposit) {
		this.deposit += deposit;
	}

	public void withdraw(double withdraw) {
		this.deposit -= withdraw + this.TAXA;
	}

	@Override
	public String toString() {
		return "Account " + this.accountNumber + ", Holder: " + cardholderName + ", Balance: $ "
				+ String.format("%.2f", deposit);
	}
}
