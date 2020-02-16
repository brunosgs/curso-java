package br.com.udemy.java.secao13.enumeracoes.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.udemy.java.secao13.enumeracoes.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = this.baseSalary;
		Calendar calendar = Calendar.getInstance();

		for (HourContract hc : contracts) {
			calendar.setTime(hc.getDate());

			int hc_year = calendar.get(Calendar.YEAR);
			int hc_month = 1 + calendar.get(Calendar.MONTH);

			if (year == hc_year && month == hc_month) {
				sum += hc.totalValue();
			}
		}
		return sum;
	}
}
