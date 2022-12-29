package com.nvd.training.designpatterns.structural.facade;

public class BankAccountFacade {
	private AccountChecker accountChecker;
	private CashManager cashManager;
	private SecurityCodeChecker securityCodeChecker;
	private String accountName;
	private int securityCode;

	public BankAccountFacade(String accountName, int securityCode) {
		this.accountName = accountName;
		this.securityCode = securityCode;

		this.accountChecker = new AccountChecker(accountName);
		this.cashManager = new CashManager(1000d);
		this.securityCodeChecker = new SecurityCodeChecker(1234);
	}

	public void deposit(double cashAmount) {
		if (this.accountChecker.isValid(this.accountName) && this.securityCodeChecker.isValid(this.securityCode)) {
			this.cashManager.deposit(cashAmount);
			System.out.println("Done !!!");
		} else {
			System.out.println("Validated failed !!!");
		}
	}

	public void drawWithCash(double cashAmount) {
		if (this.accountChecker.isValid(this.accountName) && securityCodeChecker.isValid(this.securityCode)
				&& this.cashManager.haveEnoughMoney(cashAmount)) {
			this.cashManager.draw(cashAmount);
			System.out.println("Huhu I lost my money !!!");
		} else {
			System.out.println("Validated failed !!!");
		}
	}
}
