package com.nvd.training.designpatterns.exercises.websearch;

public class SecondOutput extends OutputObserver {

	public SecondOutput(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
	}

	@Override
	public void print(Subject subject, String content) {
		if (subject instanceof FileSearch) {
			if(content.length() > 60) {
				System.out.println("So long....! \t" + content);
			}
		}
	}

}
