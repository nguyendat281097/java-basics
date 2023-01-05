package com.nvd.training.designpatterns.exercises.telephone;

public class FirstScreen extends ScreenObserver {

	public FirstScreen(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
	}

	@Override
	public void notify(Subject subject, Object ...objects) {
		if (subject instanceof Telephone) {
			if(objects != null && objects.length > 0)
			System.out.println("The newest digit out to the screen is: "+ objects[0]);
		}
	}
	
}
