package br.com.udemy.java.secao14.abstrato.entities;

public class Company extends TaxPayer {
	private final static double TAX_16 = 0.16;
	private final static double TAX_14 = 0.14;
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (this.numberOfEmployees < 10) {
			return (this.getAnualIncome() * TAX_16);
		} else {
			return (this.getAnualIncome() * TAX_14);
		}
	}

}
