package com.nvd.training.designpatterns.structural.facade;

public class AccountChecker {
	private String accountName;

	public AccountChecker(String accountName) {
		this.accountName = accountName;
	}
	public boolean isValid(String accountName) {
		return this.accountName.equals(accountName);
	}
}
