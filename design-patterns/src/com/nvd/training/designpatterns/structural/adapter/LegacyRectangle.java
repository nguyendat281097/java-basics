package com.nvd.training.designpatterns.structural.adapter;

public class LegacyRectangle {
	public void draw(int x, int y, int w, int h) {
		System.out.printf("Drawing Rectangle %s, %s, %s, %s", x, y, w, h);
	}
}
