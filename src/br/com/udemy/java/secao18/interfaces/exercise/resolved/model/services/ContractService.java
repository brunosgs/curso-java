package br.com.udemy.java.secao18.interfaces.exercise.resolved.model.services;

import java.util.Calendar;
import java.util.Date;

import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.entities.Contract;
import br.com.udemy.java.secao18.interfaces.exercise.resolved.model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			Date dueDate = addMonths(contract.getDate(), i);

			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}

	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);

		return calendar.getTime();
	}
}
