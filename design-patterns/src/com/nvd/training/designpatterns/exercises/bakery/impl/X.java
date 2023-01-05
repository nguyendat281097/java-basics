package com.nvd.training.designpatterns.exercises.bakery.impl;

import com.nvd.training.designpatterns.exercises.bakery.CakeDecorator;
import com.nvd.training.designpatterns.exercises.bakery.ICake;

public class X extends CakeDecorator {
	private String x;
	public X(ICake wrapper, String x) {
		super(wrapper);
		this.x = x;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf(" with saying \"%s\"", this.x);
	}
	
}
