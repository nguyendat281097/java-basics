package com.nvd.training.designpatterns.exercises.bakery.impl;

import com.nvd.training.designpatterns.exercises.bakery.CakeDecorator;
import com.nvd.training.designpatterns.exercises.bakery.ICake;

public class MultiLayered extends CakeDecorator {

	public MultiLayered(ICake wrapper) {
		super(wrapper);
	}

	@Override
	public void print() {
		System.out.print("Multi-layered ");
		super.print();
	}

	@Override
	public double cost() {
		return 5 + super.cost();
	}
}
