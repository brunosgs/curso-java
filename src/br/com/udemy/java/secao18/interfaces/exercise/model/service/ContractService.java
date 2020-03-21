package br.com.udemy.java.secao18.interfaces.exercise.model.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.SpringLayout.Constraints;

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

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public void processContract(Contract contract, Integer months) {
		Double installmentValue = contract.getTotalValue() / months;
		List<Installment> installmentsList = new ArrayList<>();

		for (int i = 1; i <= this.months; i++) {
			Double interestRateInstallment = onlinePaymentService.interest(installmentValue, i);
			Calendar calendar = Calendar.getInstance();

			calendar.setTime(contract.getDate());
			calendar.add(Calendar.MONTH, i);

			Installment installment = new Installment(calendar.getTime(),
					onlinePaymentService.paymentFee(interestRateInstallment));

			installmentsList.add(installment);
		}
		
		contract.setInstallments(installmentsList);
	}

}
