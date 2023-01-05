package com.nvd.training.designpatterns.exercises.bakery;

public abstract class Cake implements ICake{
	@Override
	public double cost() {
		return 10d;
	}

	@Override
	public void print() {
		System.out.print("cake");
	}
	
}
