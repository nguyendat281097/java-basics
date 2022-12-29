package com.nvd.training.designpatterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {
	protected String color;

	public Shape(Shape shape) {
		this.color = shape.color;
	}

	public Shape() {
	}

	public abstract Shape clone();

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Shape))
			return false;
		Shape shape2 = (Shape) object2;
		return Objects.equals(shape2.color, color);
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
