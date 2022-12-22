package com.nvd.training.designpatterns.creational.builder.car;

public class SeatBelt {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public SeatBelt(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "SeatBelt [brand=" + brand + "]";
	}
}
