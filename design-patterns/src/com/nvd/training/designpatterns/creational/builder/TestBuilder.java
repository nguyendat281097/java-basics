package com.nvd.training.designpatterns.creational.builder;

import com.nvd.training.designpatterns.creational.builder.car.Car;
import com.nvd.training.designpatterns.creational.builder.car.Engine;
import com.nvd.training.designpatterns.creational.builder.car.SeatBelt;
import com.nvd.training.designpatterns.creational.builder.car.WindScreen;

public class TestBuilder {
	public static void main(String[] args) {
		int wheels = 4;
		SeatBelt seatBelt = new SeatBelt("Seat Belt");
		Engine engine = new Engine("Engine");
		String color = "Red";
		WindScreen windScreen = new WindScreen("Wind Screen");
		Car car = new Car(wheels, seatBelt, color, windScreen, engine);
		System.out.println(car);
		
		System.out.println("--------------------------------");
		
		ICarBuilder builder = new CarBuilder();
		Car carCreatedByBuilder = builder.addWheels(wheels)
				.addColor(color)
				.addSeatBelt(seatBelt)
				.addWindScreen(windScreen)
				.addEngine(engine).build();
		System.out.println(carCreatedByBuilder);
	}
}
