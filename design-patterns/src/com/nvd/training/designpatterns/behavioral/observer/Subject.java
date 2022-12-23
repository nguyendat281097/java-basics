package com.nvd.training.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import com.nvd.training.designpatterns.behavioral.observer.notifiers.AbstractObserver;

public abstract class Subject {
	private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

	public void attachObserver(AbstractObserver observer) {
		this.observers.add(observer);
	}

	public void detachObserver(AbstractObserver observer) {
		this.observers.remove(observer);
	}

	public void notifyObserver(Subject subject, Object... objects) {
		this.observers.forEach(obj -> obj.notify(subject, objects));
	}
}
