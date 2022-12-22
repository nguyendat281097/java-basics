package com.nvd.training.designpatterns.behavioral.strategy.animal;

public class Duck extends IAnimal {

	public Duck(String color, String name, int legs) {
		super(color, name, legs);
	}
	
	@Override
	public String fly() {
		return this.flyTypeStrategy.fly();
	}

}
