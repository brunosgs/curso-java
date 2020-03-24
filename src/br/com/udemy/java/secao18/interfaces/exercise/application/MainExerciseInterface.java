package br.com.udemy.java.secao18.interfaces.exercise.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao18.interfaces.exercise.model.entities.Contract;
import br.com.udemy.java.secao18.interfaces.exercise.model.service.ContractService;
import br.com.udemy.java.secao18.interfaces.exercise.model.service.PaypalService;

public class MainExerciseInterface {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = scan.nextInt();

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(scan.next());

		System.out.print("Contract value: ");
		Double value = scan.nextDouble();

		System.out.print("Enter number of installments: ");
		int installment = scan.nextInt();

		ContractService contractService = new ContractService(value, installment, new PaypalService());

		Contract contract = new Contract(number, date, value);

		contractService.processContract(contract, installment);

		System.out.println("Installments: ");
		System.out.println(contract);

		scan.close();
	}

}
