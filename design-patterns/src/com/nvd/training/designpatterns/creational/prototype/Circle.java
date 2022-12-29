package com.nvd.training.designpatterns.creational.prototype;

public class Circle extends Shape {
	private int radius;

	public Circle(Circle cricle) {
		super(cricle);
		this.radius = cricle.radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}
