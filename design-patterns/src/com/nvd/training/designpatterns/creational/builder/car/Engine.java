package com.nvd.training.designpatterns.creational.builder.car;

public class Engine {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	
}
