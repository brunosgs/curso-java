package br.com.udemy.java.secao18.interfaces.exercise.resolved.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.entities.Contract;
import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.entities.Installment;
import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.services.ContractService;
import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.services.PaypalService;

public class MainResolvedExercise {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = scan.nextInt();

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(scan.next());

		System.out.print("Contract value: ");
		Double totalValue = scan.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		int N = scan.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, N);
		
		System.out.println("Installments: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		scan.close();
	}

}
