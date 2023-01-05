package com.nvd.training.designpatterns.exercises.bakery.impl;

import com.nvd.training.designpatterns.exercises.bakery.CakeDecorator;
import com.nvd.training.designpatterns.exercises.bakery.ICake;

public class Sprinkles extends CakeDecorator {

	public Sprinkles(ICake wrapper) {
		super(wrapper);
	}

	@Override
	public void print() {
		super.print();
		System.out.print(" with sprinkles");
	}

	@Override
	public double cost() {
		return 2 + super.cost();
	}
}
