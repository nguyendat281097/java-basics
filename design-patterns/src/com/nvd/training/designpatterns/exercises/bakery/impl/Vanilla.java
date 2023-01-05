package com.nvd.training.designpatterns.exercises.bakery.impl;

import com.nvd.training.designpatterns.exercises.bakery.Cake;

public class Vanilla extends Cake {

	@Override
	public void print() {
		System.out.print("Vanilla ");
		super.print();
	}

	@Override
	public double cost() {
		return super.cost();
	}
}
