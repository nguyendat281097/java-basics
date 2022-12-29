package com.nvd.training.designpatterns.structural.facade;

public class SecurityCodeChecker {
	private int securityCode;

	public SecurityCodeChecker(int securityCode) {
		this.securityCode = securityCode;
	}
	
	public boolean isValid(int securityCode) {
		return this.securityCode == securityCode;
	}
}
