package com.nvd.training.designpatterns.behavioral.templatemethod;

public class HomePage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of home page");
	}

}
