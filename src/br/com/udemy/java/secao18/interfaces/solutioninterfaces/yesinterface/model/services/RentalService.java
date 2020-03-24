package br.com.udemy.java.secao18.interfaces.solutioninterfaces.yesinterface.model.services;

import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.entities.CarRental;
import br.com.udemy.java.secao18.interfaces.solutioninterfaces.nointerface.model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long instant1 = carRental.getStart().getTime();
		long instant2 = carRental.getFinish().getTime();
		double hours = (double) (instant2 - instant1) / 1000 / 60 / 60;
		double basicPayment;

		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
