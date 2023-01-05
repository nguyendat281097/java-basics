package com.nvd.training.designpatterns.exercises.telephone;

public class SecondScreen extends ScreenObserver {

	public SecondScreen(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
	}

	@Override
	public void notify(Subject subject, Object ...objects) {
		if (subject instanceof Telephone) {
			if(objects != null && objects.length > 1)
			System.out.println("Now dialing "+ objects[1]);
		}
	}
	
}
