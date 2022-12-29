package com.nvd.training.designpatterns.structural.proxy;

public class FundPaidFromAccount implements IPayment {

	@Override
	public void pay(String accountName, double price) {
		System.out.println("Paid for account " + accountName + " , price " + price);
	}

}
