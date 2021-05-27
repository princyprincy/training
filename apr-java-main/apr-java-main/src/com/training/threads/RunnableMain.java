package com.training.threads;

public class RunnableMain implements Runnable {
	public static void main(String[] args) {
		RunnableMain runnable = new RunnableMain();
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("End of the Main Thread");
	}

	public void run() {
		System.out.println("Actual task is running in a thread");
	}
}
