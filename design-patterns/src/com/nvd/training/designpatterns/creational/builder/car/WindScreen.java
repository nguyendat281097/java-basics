package com.nvd.training.designpatterns.creational.builder.car;

public class WindScreen {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WindScreen(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "WindScreen [name=" + name + "]";
	}
}
