package com.nvd.training.designpatterns.behavioral.strategy.animal;

import com.nvd.training.designpatterns.behavioral.strategy.IFlyTypeStrategy;

public abstract class IAnimal {
	protected String color;
	protected String name;
	protected int legs;
	protected IFlyTypeStrategy flyTypeStrategy;
	
	public IAnimal(String color, String name, int legs) {
		this.color = color;
		this.name = name;
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public IFlyTypeStrategy getFlyTypeStrategy() {
		return flyTypeStrategy;
	}
	public void setFlyTypeStrategy(IFlyTypeStrategy flyTypeStrategy) {
		this.flyTypeStrategy = flyTypeStrategy;
	}
	
	public abstract String fly();
}
