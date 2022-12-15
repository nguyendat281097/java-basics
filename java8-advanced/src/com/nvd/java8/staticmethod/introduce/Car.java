package com.nvd.java8.staticmethod.introduce;

/*
 * Static method is a helpful part of interface, we can use it in the implement classes. 
 * We cannot override the static method in the implement classes. 
 * We can have the same name method in the implement classes 
 * but cannot add the Override annotation on it. 
*/

public class Car implements Vehicle {

	@Override
	public void showLog() {
		print();
		Vehicle.isValid();
		isNotValid();
	}

	public boolean isNotValid() {
		System.out.println("Car is not valid");
		return true;
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.showLog();
	}
}