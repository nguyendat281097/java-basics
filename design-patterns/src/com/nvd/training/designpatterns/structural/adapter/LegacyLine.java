package com.nvd.training.designpatterns.structural.adapter;

public class LegacyLine {
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.printf("Drawing Line %s, %s, %s, %s", x1, y1, x2, y2);
	}
}
