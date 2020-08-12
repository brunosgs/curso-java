package br.com.udemy.java.secao18.interfaces.exercise.resolved.model.services;

public interface OnlinePaymentService {
	public Double paymentFee(Double amount);
	
	public Double interest(Double amount, Integer months);
}
