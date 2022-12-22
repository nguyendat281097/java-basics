package com.nvd.training.designpatterns.creational.builder.car;

public class Car {
	private int numberOfWheels;
	private SeatBelt seatBelt;
	private String color;
	private WindScreen windScreen;
	private Engine engine;
	
	
	
	public Car(int numberOfWheels, SeatBelt seatBelt, String color, WindScreen windScreen, Engine engine) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.seatBelt = seatBelt;
		this.color = color;
		this.windScreen = windScreen;
		this.engine = engine;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public SeatBelt getSeatBelt() {
		return seatBelt;
	}
	public void setSeatBelt(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public WindScreen getWindScreen() {
		return windScreen;
	}
	public void setWindScreen(WindScreen windScreen) {
		this.windScreen = windScreen;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + ", seatBelt=" + seatBelt + ", color=" + color + ", windScreen="
				+ windScreen + ", engine=" + engine + "]";
	}

}
