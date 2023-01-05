package com.nvd.training.designpatterns.exercises.websearch;

public class FirstOutput extends OutputObserver {

	public FirstOutput(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
	}

	@Override
	public void print(Subject subject, String content) {
		if (subject instanceof FileSearch) {
			if(content.toLowerCase().contains("friend")) {
				System.out.println("Oh yes! \t" + content);
			}
		}
	}

}
