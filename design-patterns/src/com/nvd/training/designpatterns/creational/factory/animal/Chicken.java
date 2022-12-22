package com.nvd.training.designpatterns.creational.factory.animal;

public class Chicken implements IAnimal {

	@Override
	public void sayHello() {
		System.out.println("I'm Chicken, I say \"Cuc ta, Cuc tat\"");
		
	}

}
