package br.com.udemy.java.secao13.enumeracoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao13.enumeracoes.entities.Department;
import br.com.udemy.java.secao13.enumeracoes.entities.HourContract;
import br.com.udemy.java.secao13.enumeracoes.entities.Worker;
import br.com.udemy.java.secao13.enumeracoes.entities.enums.WorkerLevel;

public class MainWorker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = scan.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int nContracts = scan.nextInt();

		for (int i = 0; i < nContracts; i++) {
			System.out.println("\nEnter contract #" + (i + 1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateContract = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int durationHours = scan.nextInt();

			HourContract contract = new HourContract(dateContract, valuePerHour, durationHours);
			worker.addContract(contract);
			System.out.println("------------------------------------");
		}

		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		scan.close();
	}

}
