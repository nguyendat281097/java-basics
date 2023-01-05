package com.nvd.training.designpatterns.exercises.telephone;

public class Telephone extends Subject {
	private String number = "";
	public void updateNumber(String num) {
		this.number = this.number.concat(num);
		this.notifyChanged(num, this.number);
	}
	public void notifyChanged(Object ...objects) {
		this.notifyObserver(this, objects);
	}
}
