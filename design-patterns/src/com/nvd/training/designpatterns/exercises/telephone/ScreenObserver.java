package com.nvd.training.designpatterns.exercises.telephone;

public abstract class ScreenObserver {
	protected Subject subject;
	
	public ScreenObserver(Subject subject) {
		this.subject = subject;
	}

	public abstract void notify(Subject subject, Object ...objects);

}
