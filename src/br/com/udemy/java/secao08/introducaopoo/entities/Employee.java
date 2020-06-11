package br.com.udemy.java.secao08.introducaopoo.entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double grossSalaryOld;
	private double tax;

	public void setName(String name) {
		this.name = name;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
		this.grossSalaryOld = grossSalary;
	}

	public void setTax(double tax) {
		this.tax = tax;
		this.grossSalary = netSalary();
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalaryOld * (percentage / 100);
	}

	@Override
	public String toString() {
		return "Employee: " + this.name + ", $ " + String.format("%.2f", this.grossSalary);
	}

}
