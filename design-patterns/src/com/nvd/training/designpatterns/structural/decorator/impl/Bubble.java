package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;
import com.nvd.training.designpatterns.structural.decorator.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {

	public Bubble(IMilkTea inner) {
		super(inner);

	}

	@Override
	public double cost() {
		return 2d + super.cost();
	}

}
