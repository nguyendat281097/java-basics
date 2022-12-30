package com.nvd.training.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {
	private String name;
	private List<FileComponent> files;
	
	public FolderComposite(String name) {
		this.name = name;
		this.files = new ArrayList<FileComponent>();
	}

	public FolderComposite(String name, List<FileComponent> files) {
        this.files = files;
        this.name = name;
    }
	
	@Override
	public void showProperty() {
		System.out.println("Folder: "+ this.name);
		this.files.forEach(file -> file.showProperty());
		
	}

	@Override
	public double totalSize() {
		return this.files.stream().mapToDouble(d -> d.totalSize()).sum();
	}

}
