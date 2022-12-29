package com.nvd.training.designpatterns.structural.proxy;

public class CheckPayment implements IPayment {
	private FundPaidFromAccount fundPaidFromAccount;
	
	@Override
	public void pay(String accountName, double price) {
	if(!"ABC".equals(accountName)) {
		System.out.println("Account name must be ABC");
		return;
	}
	if(fundPaidFromAccount == null) {
		fundPaidFromAccount = new FundPaidFromAccount();
	}
		fundPaidFromAccount.pay(accountName, price);
	}

}
