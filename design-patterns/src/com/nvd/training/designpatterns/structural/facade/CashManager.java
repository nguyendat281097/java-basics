package com.nvd.training.designpatterns.structural.facade;

public class CashManager {
	private double cashInAccount;

	public CashManager(double cashInAccount) {
		this.cashInAccount = cashInAccount;
	}
	
	public void deposit(double cashAmount) {
		this.cashInAccount += cashAmount;
		System.out.println("Current amount is " + this.cashInAccount);
	}
	
	public boolean haveEnoughMoney(double cashAmount) {
		return this.cashInAccount >= cashAmount;
	}
	
	public void draw(double cashAmount) {
		this.cashInAccount -= cashAmount;
		System.out.println("Current amount is " + this.cashInAccount);
	}
}
