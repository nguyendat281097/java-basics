package com.nvd.training.designpatterns.structural.adapter;

public class Line implements IShape {
	private LegacyLine legacyLine;
	
	public Line(LegacyLine legacyLine) {
		this.legacyLine = legacyLine;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		this.legacyLine.draw(x1, y1, x2, y2);
	}
}
