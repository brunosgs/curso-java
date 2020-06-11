package br.com.udemy.java.secao08.introducaopoo.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao08.introducaopoo.entities.Student;

public class MainStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Sistema de notas");
		System.out.print("Nome do aluno: ");
		student.setNome(scan.nextLine());

		double[] notas = new double[3];
		System.out.println("\nNotas no aluno");
		for (int i = 0; i < student.getNotas().length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = scan.nextDouble();
		}
		student.setNotas(notas);

		System.out.println("\nFINAL GRADE = " + String.format("%.2f", student.finalSum()));
		student.validYear();

		scan.close();

	}
}
