package br.com.udemy.java.secao14.abstrato.entities;

public class Individual extends TaxPayer {
	private final static double TAX_15 = 0.15;
	private final static double TAX_25 = 0.25;
	private final static double TAX_50 = 0.5;
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (this.getAnualIncome() < 20000) {
			return (this.getAnualIncome() * TAX_15) - (this.healthExpenditures * TAX_50);
		} else {
			return (this.getAnualIncome() * TAX_25) - (this.healthExpenditures * TAX_50);
		}
	}

}
