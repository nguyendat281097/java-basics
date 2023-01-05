package com.nvd.training.designpatterns.execises.websearch;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<OutputObserver> observers = new ArrayList<>();
	private IFilterStrategy filterStrategy;

	public void addObserver(OutputObserver observer) {
		this.observers.add(observer);
		this.filterStrategy = new IFilterStrategy() {

			@Override
			public boolean accept(String query) {
				return true;
			}
		};
	}

	public void deleteObserver(OutputObserver observer) {
		this.observers.remove(observer);
	}

	public void notifyObserver(Subject subject, String content) {
		this.observers.forEach(obj -> {
			if (content != null && this.filterStrategy.accept(content)) {
				obj.print(subject, content);
			}
		});
	}
}
