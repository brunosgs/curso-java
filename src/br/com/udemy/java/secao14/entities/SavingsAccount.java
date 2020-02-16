package br.com.udemy.java.secao14.entities;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void updateBalance() {
		this.deposit(this.getBalance() * this.interestRate);
	}

	@Override
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}
}
