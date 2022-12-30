package com.nvd.training.designpatterns.structural.bridge;

public class Circle extends Shape {
	private int radius;
	
	public Circle(IColor color, int radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Draw Circle with radius " + this.radius + " and color " + this.color.getColor());
	}

}
