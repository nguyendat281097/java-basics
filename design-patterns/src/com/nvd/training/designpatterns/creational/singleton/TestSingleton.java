package com.nvd.training.designpatterns.creational.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				UserSingleton.getInstance().sayHi();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				UserSingleton.getInstance().sayHi();
				
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
