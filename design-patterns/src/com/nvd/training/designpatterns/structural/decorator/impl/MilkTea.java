package com.nvd.training.designpatterns.structural.decorator.impl;

import com.nvd.training.designpatterns.structural.decorator.IMilkTea;

public class MilkTea implements IMilkTea {
	@Override
	public double cost() {
		
		return 5d;
	}

}
