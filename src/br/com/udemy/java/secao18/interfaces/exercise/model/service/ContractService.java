package br.com.udemy.java.secao18.interfaces.exercise.model.service;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.java.secao18.interfaces.exercise.model.entities.Contract;
import br.com.udemy.java.secao18.interfaces.exercise.model.entities.Installment;

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
		Double installmentValue = contract.getTotalValue() / months;
		List<Installment> installmentList = new ArrayList<>();
		
		for(int i = 1; i < this.months; i++ ) {
			Double installment = installmentValue + onlinePaymentService.paymentFee(installmentValue);
			Double interestResult = onlinePaymentService.interest(installment, i);
		}
	}
}
