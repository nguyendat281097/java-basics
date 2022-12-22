package com.nvd.training.designpatterns.behavioral.strategy;

public class HighFly implements IFlyTypeStrategy {

	@Override
	public String fly() {
		return "I can fly and fly high";
	}
	
}
