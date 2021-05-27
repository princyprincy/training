package com.training.threads;

public class Main extends Thread {
	public static void main(String[] args) {
		// current thread details
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());

		// create new thread using Thread class
		Main t = new Main();
		t.start();
		System.out.println("End of the Main Thread");
	}

	public void run() {
		System.out.println("Actual task is running in a thread");
	}

}
