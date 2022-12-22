package com.nvd.training.designpatterns.behavioral.strategy;

public class NoFly implements IFlyTypeStrategy {

	@Override
	public String fly() {
		return "I can't fly";
	}

}
