package com.nvd.training.designpatterns.creational.factory.method;

import com.nvd.training.designpatterns.creational.factory.ICreateAnimalFactory;
import com.nvd.training.designpatterns.creational.factory.animal.Cat;
import com.nvd.training.designpatterns.creational.factory.animal.Dog;
import com.nvd.training.designpatterns.creational.factory.animal.Duck;
import com.nvd.training.designpatterns.creational.factory.animal.IAnimal;

public class BasicCreateAnimal implements ICreateAnimalFactory {
	private static int num = 0;

	@Override
	public IAnimal createAnimal() {
		if (num == 0) {
			num++;
			return new Cat();
		}

		if (num == 1) {
			num++;
			return new Dog();
		}

		if (num == 2) {
			num = 0;
			return new Duck();
		}

		return null;
	}

}
