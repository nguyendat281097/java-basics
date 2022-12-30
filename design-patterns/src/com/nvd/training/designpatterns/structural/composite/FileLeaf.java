package com.nvd.training.designpatterns.structural.composite;

public class FileLeaf implements FileComponent {
	private String name;
	private double size;
	
	public FileLeaf(String name, double size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void showProperty() {
		System.out.println("\tFile name: "+ this.name + ", size: " + this.size);
		
	}

	@Override
	public double totalSize() {
		return this.size;
	}

}
