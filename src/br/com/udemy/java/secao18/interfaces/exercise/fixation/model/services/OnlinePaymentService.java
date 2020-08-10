package br.com.udemy.java.secao18.interfaces.exercise.fixation.model.services;

public interface OnlinePaymentService {
	Double paymentFee(Double amount);
	
	Double interest(Double amount, Integer months);
}
