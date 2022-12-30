package com.nvd.training.designpatterns.structural.bridge;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(IColor color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle with width " + this.width + " and height " + this.height  + " and color " + this.color.getColor());
	}

}
