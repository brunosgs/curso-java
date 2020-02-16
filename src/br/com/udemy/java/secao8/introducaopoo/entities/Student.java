package br.com.udemy.java.secao8.introducaopoo.entities;

public class Student {
	@SuppressWarnings("unused")
	private String name;
	private double[] grades = new double[3];
	private static final double FIRST_SEMESTER = 30.00;
	private static final double SECOND_THIRD_SEMESTER = 35.00;
	private static final double SEMESTER = 100.00;

	public double[] getNotas() {
		return grades;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public void setNotas(double[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (i == 0 && grades[i] <= Student.FIRST_SEMESTER) {
				this.grades[i] = grades[i];
			} else if (i != 0 && grades[i] <= Student.SECOND_THIRD_SEMESTER) {
				this.grades[i] = grades[i];
			} else {
				System.out.printf("Não foi possivel adicionar a nota %d", i + 1);
			}
		}
	}

	public double finalSum() {
		double sum = 0;

		for (double note : this.grades) {
			sum += note;
		}
		return sum;
	}

	public void validYear() {
		double remainingAmount = Student.SEMESTER - finalSum();

		if (finalSum() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("MISSING " + String.format("%.2f", remainingAmount) + " POINTS");
			System.out.println("FAILED");
		}
	}
}
