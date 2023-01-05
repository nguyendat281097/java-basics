package com.nvd.training.designpatterns.exercises.websearch;

public abstract class OutputObserver {
	protected Subject subject;
	
	public OutputObserver(Subject subject) {
		this.subject = subject;
	}

	public abstract void print(Subject subject, String content);

}
