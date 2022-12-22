package com.nvd.training.designpatterns.creational.factory;

import com.nvd.training.designpatterns.creational.factory.animal.IAnimal;

public interface ICreateAnimalFactory {
	IAnimal createAnimal();
}
