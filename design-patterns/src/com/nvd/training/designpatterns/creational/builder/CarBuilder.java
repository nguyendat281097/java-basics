package com.nvd.training.designpatterns.creational.builder;

import com.nvd.training.designpatterns.creational.builder.car.Car;
import com.nvd.training.designpatterns.creational.builder.car.Engine;
import com.nvd.training.designpatterns.creational.builder.car.SeatBelt;
import com.nvd.training.designpatterns.creational.builder.car.WindScreen;

public class CarBuilder implements ICarBuilder {
	
	private int numberOfWheels;
	private SeatBelt seatBelt;
	private String color;
	private WindScreen windScreen;
	private Engine engine;

	@Override
	public ICarBuilder addWheels(int wheels) {
		this.numberOfWheels = wheels;
		return this;
	}

	@Override
	public ICarBuilder addSeatBelt(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
		return this;
	}

	@Override
	public ICarBuilder addColor(String color) {
		this.color = color;
		return this;
	}

	@Override
	public ICarBuilder addEngine(Engine engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public ICarBuilder addWindScreen(WindScreen windScreen) {
		this.windScreen = windScreen;
		return this;
	}
	
	@Override
	public Car build() {
		return new Car(numberOfWheels, seatBelt, color, windScreen, engine);
	}

}
