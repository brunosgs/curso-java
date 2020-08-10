package br.com.udemy.java.secao18.interfaces.exercise.fixation.model.services;

public class PaypalService implements OnlinePaymentService {
	@Override
	public Double paymentFee(Double amount) {
		Double installmentPaymentFee = amount + (amount * 0.02);
		
		return installmentPaymentFee;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		Double interestRateInstallment = amount + (amount * 0.01) * months;
		
		return interestRateInstallment;
	}

}
