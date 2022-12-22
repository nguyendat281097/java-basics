package com.nvd.training.designpatterns.creational.builder;

import com.nvd.training.designpatterns.creational.builder.car.Car;
import com.nvd.training.designpatterns.creational.builder.car.Engine;
import com.nvd.training.designpatterns.creational.builder.car.SeatBelt;
import com.nvd.training.designpatterns.creational.builder.car.WindScreen;

public interface ICarBuilder {
	ICarBuilder addWheels(int wheels);
	ICarBuilder addSeatBelt(SeatBelt seatBelt);
	ICarBuilder addColor(String color);
	ICarBuilder addEngine(Engine engine);
	ICarBuilder addWindScreen(WindScreen windScreen);
	Car build();
}
