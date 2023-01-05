package com.nvd.training.designpatterns.exercises.bakery;

public abstract class CakeDecorator implements ICake {
	private ICake cake;
	protected CakeDecorator(ICake wrapper) {
		this.cake = wrapper;
	}
	@Override
	public double cost() {
		return this.cake.cost();
	}
	
	@Override
	public void print() {
		this.cake.print();
	}
}
