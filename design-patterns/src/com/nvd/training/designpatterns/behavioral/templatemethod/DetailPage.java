package com.nvd.training.designpatterns.behavioral.templatemethod;

public class DetailPage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of detail page");
	}

}
