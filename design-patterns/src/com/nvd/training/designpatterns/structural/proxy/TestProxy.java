package com.nvd.training.designpatterns.structural.proxy;

public class TestProxy {
	public static void main(String[] args) {
		IPayment payment = new CheckPayment();
		
		payment.pay("123", 12000d);
		
		System.out.println("------------");
		payment.pay("ABC", 12000d);
	}
}
