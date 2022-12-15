package com.nvd.java8.defaultmethod.introduce;

public class Cricle implements Shape {

	@Override
	public void draw() {
		String cricle = "Cricle";
		System.out.printf("Let's draw the %s", cricle);
		System.out.println();
	}

}
