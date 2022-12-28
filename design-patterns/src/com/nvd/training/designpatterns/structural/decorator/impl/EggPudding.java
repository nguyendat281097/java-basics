package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;
import com.nvd.training.designpatterns.structural.decorator.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {

	public EggPudding(IMilkTea inner) {
		super(inner);

	}

	@Override
	public double cost() {
		return 1.55d + super.cost();
	}

}
