package com.nvd.training.designpatterns.creational.factory;

import java.util.Random;

import com.nvd.training.designpatterns.creational.factory.method.BasicCreateAnimal;
import com.nvd.training.designpatterns.creational.factory.method.RandomCreateAnimal;

public class TestFactoryMethod {
	public static void main(String[] args) {
		int num = new Random().nextInt(2);
		ICreateAnimalFactory factory = null;
		if(num == 0) {
			factory = new BasicCreateAnimal();
		}
		if (num == 1) {
			factory = new RandomCreateAnimal();
		}
		
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
	}
}
