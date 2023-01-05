package com.nvd.training.designpatterns.exercises.telephone;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<ScreenObserver> observers = new ArrayList<>();

	public void addObserver(ScreenObserver observer) {
		this.observers.add(observer);
	}

	public void deleteObserver(ScreenObserver observer) {
		this.observers.remove(observer);
	}

	public void notifyObserver(Subject subject, Object ...objects) {
		this.observers.forEach(obj -> obj.notify(subject, objects));
	}
}
