package com.nvd.training.designpatterns.creational.singleton;

import java.util.Random;

public class UserSingleton {
	// Eager initialization
//	private static UserSingleton uniqueInstance = new UserSingleton();
	private static UserSingleton uniqueInstance;
	private int num;

	// static block initialization
//	static {
//		try{
//			uniqueInstance = new UserSingleton();
//		} catch (Exception e) {
//			throw new RuntimeException("Exception occured in creating singleton instance");
//		}
//	}

	private UserSingleton(int num) {
		this.num = num;
	}

	// Lazy initialization and thread safe singleton
//	public static synchronized UserSingleton getInstance() {
//		if(uniqueInstance == null) {
//			int num = new Random().nextInt(4);
//			uniqueInstance = new UserSingleton(num);
//		}
//		return uniqueInstance;
//	}

	// Better
//	public static UserSingleton getInstance() {
//		synchronized (UserSingleton.class) {
//			if (uniqueInstance == null) {
//				int num = new Random().nextInt(4);
//				uniqueInstance = new UserSingleton(num);
//			}
//			return uniqueInstance;
//		}
//
//	}

	// The best
	public static UserSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (UserSingleton.class) {
				if (uniqueInstance == null) {
					int num = new Random().nextInt(4);
					uniqueInstance = new UserSingleton(num);
				}
			}
		}
		return uniqueInstance;

	}

//	public static UserSingleton getInstance() {
//		return uniqueInstance;
//	}

	public void sayHi() {
		System.out.println("Hello World, I am number " + num);
	}
}
