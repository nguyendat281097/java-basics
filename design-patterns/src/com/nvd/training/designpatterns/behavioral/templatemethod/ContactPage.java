package com.nvd.training.designpatterns.behavioral.templatemethod;

public class ContactPage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of contact page");
	}

}
