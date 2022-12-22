package com.nvd.training.designpatterns.creational.factory.abstracts;

import com.nvd.training.designpatterns.creational.factory.animal.Cat;
import com.nvd.training.designpatterns.creational.factory.animal.Dog;
import com.nvd.training.designpatterns.creational.factory.animal.IAnimal;

public class FourLegsAnimalFactory extends AbstractAnimalFactory {
	private static int num = 0;

	@Override
	public IAnimal createAnimal() {
		if (num == 0) {
			num++;
			return new Cat();
		}

		if (num == 1) {
			num = 0;
			return new Dog();
		}

		return null;
	}

}
