package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;
import com.nvd.training.designpatterns.structural.decorator.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {

	public FruitPudding(IMilkTea inner) {
		super(inner);

	}

	@Override
	public double cost() {
		return 0.5d + super.cost();
	}

}
