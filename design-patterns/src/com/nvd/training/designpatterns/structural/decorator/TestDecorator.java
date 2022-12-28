package com.nvd.training.designpatterns.structural.decorator;

import com.nvd.training.designpatterns.structural.decorator.impl.BlackSugar;
import com.nvd.training.designpatterns.structural.decorator.impl.EggPudding;
import com.nvd.training.designpatterns.structural.decorator.impl.FruitPudding;
import com.nvd.training.designpatterns.structural.decorator.impl.MilkTea;

public class TestDecorator {
	public static void main(String[] args) {
		
		// Black Sugar Eggpudding FruitPudding WhitePudding MilkTea
		IMilkTea firstMilkTea = new BlackSugar(
												new EggPudding(
														new FruitPudding(
																new MilkTea())));
		
		System.out.println("Black Sugar Eggpudding FruitPudding WhitePudding MilkTea: " + firstMilkTea.cost());
	}
}
