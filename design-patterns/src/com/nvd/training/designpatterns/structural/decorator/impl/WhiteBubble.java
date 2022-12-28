package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;
import com.nvd.training.designpatterns.structural.decorator.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {

	public WhiteBubble(IMilkTea inner) {
		super(inner);

	}

	@Override
	public double cost() {
		return 2.2d + super.cost();
	}

}
