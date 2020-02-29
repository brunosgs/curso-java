package br.com.udemy.java.secao18.interfaces.exercise.model.service;

import br.com.udemy.java.secao18.interfaces.exercise.model.entities.Contract;

public class ContractService {
	private Double value;
	private Integer months;
	OnlinePaymentService onlinePaymentService;

	public ContractService(Double value, Integer months, OnlinePaymentService onlinePaymentService) {
		super();
		this.value = value;
		this.months = months;
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
	}
}
