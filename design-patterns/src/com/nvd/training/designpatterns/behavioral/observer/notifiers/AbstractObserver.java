package com.nvd.training.designpatterns.behavioral.observer.notifiers;

import com.nvd.training.designpatterns.behavioral.observer.Subject;

public abstract class AbstractObserver {
	protected Subject subject;
	public abstract void notify(Subject subject, Object ...objects);
}
