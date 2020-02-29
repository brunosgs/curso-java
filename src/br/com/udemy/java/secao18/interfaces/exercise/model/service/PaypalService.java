package br.com.udemy.java.secao18.interfaces.exercise.model.service;

public class PaypalService implements OnlinePaymentService{
	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.1;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * months;
	}

}
