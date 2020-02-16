package br.com.udemy.java.secao15.exercices.model.entities;

import javax.security.auth.login.AccountException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {

	}

	public void withdraw(Double amount) throws AccountException {
		if (amount > this.withdrawLimit) {
			throw new AccountException("The amount to be withdrawn is greater than the withdrawal limit.");
		}
		if (amount > this.balance) {
			throw new AccountException("The amount to be withdrawn is greater than the balance.");
		}

		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", this.balance);
	}

}
