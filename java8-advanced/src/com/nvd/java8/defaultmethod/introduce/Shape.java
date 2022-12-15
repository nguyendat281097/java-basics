package com.nvd.java8.defaultmethod.introduce;

public interface Shape {
	void draw();
	
	default void color(String color) {
		System.out.println("Draw shape with color " + color);
	}
	
	default void material(String material) {
		System.out.println("Draw shape with material " + material);
	}
}
