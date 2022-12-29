package com.nvd.training.designpatterns.structural.facade;

public class TestFacade {
	public static void main(String[] args) {
		BankAccountFacade account = new BankAccountFacade("ABC", 1234);
		
		account.deposit(12000d);
		account.drawWithCash(2000d);
	}
}
