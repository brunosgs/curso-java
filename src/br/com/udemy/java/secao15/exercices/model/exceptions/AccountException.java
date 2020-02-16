package br.com.udemy.java.secao15.exercices.model.exceptions;

public class AccountException extends Exception {
	private static final long serialVersionUID = 1L;

	public AccountException(String msg) {
		super(msg);
	}
}
