package com.nvd.training.designpatterns.structural.bridge;

public class TestBride {
	public static void main(String[] args) {
		IColor red = new Red();
		IColor blue = new Blue();
		
		Shape circle = new Circle(blue, 5);
		Shape rectangle  = new Rectangle(red, 4, 7);
		
		circle.draw();
		rectangle.draw();
	}
}
