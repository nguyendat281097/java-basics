package com.nvd.training.advanced.multithreading;

/* The result of this process will be different every time we run this program. */

public class MultithreadWithoutSynchronization extends Thread {
	static class PrintDemo {
		public void printCount() {
			try {
				for (int i = 5; i > 0; i--) {
					System.out.println("Counter   ---   " + i);
				}
			} catch (Exception e) {
				System.out.println("Thread  interrupted.");
			}
		}
	}

	private Thread t;
	private String threadName;
	PrintDemo PD;

	MultithreadWithoutSynchronization(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		PD.printCount();
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public static void main(String args[]) {

		PrintDemo PD = new PrintDemo();

		MultithreadWithoutSynchronization T1 = new MultithreadWithoutSynchronization("Thread - 1 ", PD);
		MultithreadWithoutSynchronization T2 = new MultithreadWithoutSynchronization("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			System.out.println("Start Join");
			T1.join();
			T2.join();
			System.out.println("End Join");
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
