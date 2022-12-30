package com.nvd.training.designpatterns.structural.bridge;

public abstract class Shape {
	protected IColor color;
	
	public Shape(IColor color) {
		this.color = color;
	}

	public Shape() {
	}

	public abstract void draw();
}
