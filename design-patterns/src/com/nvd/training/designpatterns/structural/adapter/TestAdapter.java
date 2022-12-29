package com.nvd.training.designpatterns.structural.adapter;

import java.util.List;

public class TestAdapter {
	public static void main(String[] args) {
		List<IShape> shapes = List.of(new Line(new LegacyLine()), new Rectangle(new LegacyRectangle()));
		int x1 = 1, y1 = 1, x2 = 2, y2 = 3;

		shapes.forEach(element -> {
			element.draw(x1, y1, x2, y2);
			System.out.println();
		});
	}
}
