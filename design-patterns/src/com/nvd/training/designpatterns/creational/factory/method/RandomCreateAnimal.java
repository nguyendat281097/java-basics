package com.nvd.training.designpatterns.creational.factory.method;

import java.util.Random;

import com.nvd.training.designpatterns.creational.factory.ICreateAnimalFactory;
import com.nvd.training.designpatterns.creational.factory.animal.Cat;
import com.nvd.training.designpatterns.creational.factory.animal.Dog;
import com.nvd.training.designpatterns.creational.factory.animal.Duck;
import com.nvd.training.designpatterns.creational.factory.animal.IAnimal;

public class RandomCreateAnimal implements ICreateAnimalFactory {

	@Override
	public IAnimal createAnimal() {
		int num = new Random().nextInt(3);
		if (num == 0) {
			return new Cat();
		}

		if (num == 1) {
			return new Dog();
		}

		if (num == 2) {
			return new Duck();
		}
		return null;
	}

}
