package com.nvd.training.designpatterns.creational.factory.abstracts;

import com.nvd.training.designpatterns.creational.factory.animal.Chicken;
import com.nvd.training.designpatterns.creational.factory.animal.Duck;
import com.nvd.training.designpatterns.creational.factory.animal.IAnimal;

public class TwoLegsAnimalFactory extends AbstractAnimalFactory {
	private static int num = 0;

	@Override
	public IAnimal createAnimal() {
		if (num == 0) {
			num++;
			return new Duck();
		}

		if (num == 1) {
			num = 0;
			return new Chicken();
		}

		return null;
	}

}
