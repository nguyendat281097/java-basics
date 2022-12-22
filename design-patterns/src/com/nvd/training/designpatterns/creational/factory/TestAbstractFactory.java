package com.nvd.training.designpatterns.creational.factory;

import java.util.Random;

import com.nvd.training.designpatterns.creational.factory.abstracts.FourLegsAnimalFactory;
import com.nvd.training.designpatterns.creational.factory.abstracts.TwoLegsAnimalFactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		int num = new Random().nextInt(2);
		System.out.println(num);
		ICreateAnimalFactory factory = null;
		if(num == 0) {
			factory = new TwoLegsAnimalFactory();
		}
		if (num == 1) {
			factory = new FourLegsAnimalFactory();
		}
		
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
		factory.createAnimal().sayHello();
	}
}
