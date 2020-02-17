package br.com.udemy.java.secao18.nointerface.model.services;

import br.com.udemy.java.secao18.nointerface.model.entities.CarRental;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}

}
