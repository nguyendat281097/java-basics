package com.nvd.training.designpatterns.execises.websearch;

public class Main {
	public static void main(String[] args) {
		String fileName = "D:\\Training\\Java\\documents\\design-pattern-execises\\websearch.txt";
		
		FileSearch fileSearch = new FileSearch();
		new FirstOutput(fileSearch);
		new SecondOutput(fileSearch);
		
		fileSearch.iterate(fileName);
	}
}
