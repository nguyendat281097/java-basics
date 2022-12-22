package com.nvd.training.designpatterns.behavioral.strategy;

public class LowFly implements IFlyTypeStrategy {

	@Override
	public String fly() {
		return "I can fly but fly low";
	}
	
}
