package com.training.threads;

public class ConcurrencyThread implements Runnable {
	private static int amount;

	public static void main(String[] args) {
		ConcurrencyThread obj = new ConcurrencyThread();
		Thread t = new Thread(obj);
		t.start();
		// wait for the thread to finish 
		while(t.isAlive()) {
			System.out.println("Waiting..");
		}
		System.out.println(amount);
		amount++;
		System.out.println(amount);

	}

	@Override
	public void run() {
		amount++;
	}

}
