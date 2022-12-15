package com.nvd.java8.defaultmethod.introduce;

/*
 * Default method: introduced in Java 8, it helps us minimum writing code when
 * customizing an interface. Default method with body and it will not be
 * implemented in the subclass.
 */
public class ShapeUser {

	public static void main(String[] args) {
		Shape cricle = new Cricle();
		cricle.color("Red");
		cricle.draw();
		Shape rectangle = new Rectangle();
		rectangle.color("Blue");
		rectangle.draw();
	}
}
