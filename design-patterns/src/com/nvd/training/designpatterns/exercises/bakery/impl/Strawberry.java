package com.nvd.training.designpatterns.exercises.bakery.impl;

import com.nvd.training.designpatterns.exercises.bakery.Cake;

public class Strawberry extends Cake {

	@Override
	public void print() {
		System.out.print("Strawberry ");
		super.print();
	}

	@Override
	public double cost() {
		return 2 * super.cost();
	}
}
