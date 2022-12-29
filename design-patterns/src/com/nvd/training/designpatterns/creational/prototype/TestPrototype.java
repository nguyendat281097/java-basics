package com.nvd.training.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
			
		Shape circle = new Circle(10);
		shapes.add(circle);
		
		Shape rectangle = new Rectangle(4, 7);
		shapes.add(rectangle);
		
		Circle anotherCircle = (Circle) circle.clone();
		circle.color = "Red";
		shapes.add(anotherCircle);
		
		shapes.forEach(System.out::println);
		
	}
}
