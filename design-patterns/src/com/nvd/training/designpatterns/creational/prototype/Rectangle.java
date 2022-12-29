package com.nvd.training.designpatterns.creational.prototype;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}

}
