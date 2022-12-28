package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;
import com.nvd.training.designpatterns.structural.decorator.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

	public BlackSugar(IMilkTea inner) {
		super(inner);

	}

	@Override
	public double cost() {
		return 1d + super.cost();
	}

}
