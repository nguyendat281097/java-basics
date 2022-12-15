package com.nvd.java8.staticmethod.introduce;

public interface Vehicle {
	default void print() {
		if (isValid())
			System.out.println("Vehicle printed");
	}

	static boolean isValid() {
		System.out.println("Vehicle is valid");
		return true;
	}
	
	static boolean isNotValid() {
		System.out.println("Vehicle is not valid");
		return true;
	}

	void showLog();
}
