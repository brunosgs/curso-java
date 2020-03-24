package br.com.udemy.java.secao18.interfaces.solutioninterfaces.yesinterface.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.entities.CarRental;
import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.entities.Vehicle;
import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.services.BrazilTaxService;
import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.services.RentalService;

public class MainYesInterface {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat formart = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();

		System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
		Date start = formart.parse(scan.nextLine());

		System.out.print("Return (dd/MM/yyyy HH:ss): ");
		Date finish = formart.parse(scan.nextLine());

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: R$");
		double pricePerHour = scan.nextDouble();

		System.out.print("Enter price per day: R$");
		double pricePerDay = scan.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(carRental);

		System.out.println("\nINVOICE: ");
		System.out.println("Basic payment: R$" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: R$" + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: R$" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

		scan.close();
	}

}
