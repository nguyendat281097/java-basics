package com.nvd.training.designpatterns.behavioral.strategy;

import java.util.Random;

import com.nvd.training.designpatterns.behavioral.strategy.animal.Bird;
import com.nvd.training.designpatterns.behavioral.strategy.animal.Dog;
import com.nvd.training.designpatterns.behavioral.strategy.animal.Duck;
import com.nvd.training.designpatterns.behavioral.strategy.animal.IAnimal;

public class TestStrategy {
	public static void main(String[] args) {
		int num;
		IFlyTypeStrategy flyTypeStrategy = null;
		IAnimal animal = null;
		for (int i = 1; i <= 5; i++) {
			num = new Random().nextInt(3);
			switch (num) {
			case 0:
				flyTypeStrategy = new NoFly();
				animal = new Dog("Black", "Dog", 4);
				break;
			case 1:
				flyTypeStrategy = new LowFly();
				animal = new Duck("Gray", "Duck", 2);
				break;
			case 2:
				flyTypeStrategy = new HighFly();
				animal = new Bird("Red", "Bird", 2);
				break;

			}
			animal.setFlyTypeStrategy(flyTypeStrategy);
			System.out.println("Animal: "+ animal.getName() + ", fly: "+ animal.fly());
		}
	}
}
