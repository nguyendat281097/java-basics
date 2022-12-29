package com.nvd.training.designpatterns.structural.adapter;

public class Rectangle implements IShape {
	private LegacyRectangle legacyRectangle;

	public Rectangle(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		int x = Math.min(x1, x2);
		int y = Math.min(y1, y2);
		int w = Math.abs(x1 - x2);
		int h = Math.abs(y1 - y2);
		this.legacyRectangle.draw(x, y, w, h);
	}
}
