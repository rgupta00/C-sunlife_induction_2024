package com.q10;

public class ThreadTest implements Runnable {
	static int i;

	public void run() {
		i = (int) Math.random() * 10;
		System.out.print("running....");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		while (i == 0) {
			System.out.print("start again....");
			t.start();
		}
	}
}
