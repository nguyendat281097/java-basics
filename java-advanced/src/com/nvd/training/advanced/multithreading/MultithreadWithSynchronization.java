package com.nvd.training.advanced.multithreading;

/* The same result of this process every time we run this program. */

public class MultithreadWithSynchronization extends Thread {
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

	MultithreadWithSynchronization(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		// synchronization at here
		synchronized (PD) {
			PD.printCount();
		}
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

		MultithreadWithSynchronization T1 = new MultithreadWithSynchronization("Thread - 1 ", PD);
		MultithreadWithSynchronization T2 = new MultithreadWithSynchronization("Thread - 2 ", PD);

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
