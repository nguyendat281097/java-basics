package com.nvd.training.designpatterns.creational.factory.animal;

public class Duck implements IAnimal {

	@Override
	public void sayHello() {
		System.out.println("I'am Duck, I say \" Quac Quac \"");
		
	}

}
