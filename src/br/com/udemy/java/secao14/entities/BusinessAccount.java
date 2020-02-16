package br.com.udemy.java.secao14.entities;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void loan(double amount) {
		if (amount <= this.loanLimit) {
			this.deposit(amount);
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		this.setBalance(this.getBalance() - 2.0);
	}

}
