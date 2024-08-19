package com.threads.session2.classical_threads;
//Printer ---> 3 employee : race condition

class Printer {

	private Object lock=new Object();
	public  void printLetter(String letter) {

		//...
		///...
		synchronized (lock) {

			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(letter + "]");
		}
		
		//..
		//..

	}

}



class Client implements Runnable {
	private String letter;
	private Printer printer;
	private Thread thread;

	public Client(String letter, Printer printer) {
		this.letter = letter;
		this.printer = printer;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
			printer.printLetter(letter);
	}
}

public class A_NeedOfSyn {
	public static void main(String[] args) {

		Printer printer = new Printer();
		Client c1 = new Client("i love java", printer);
		Client c2 = new Client("i hate java", printer);
		Client c3 = new Client("i love maths", printer);

	}
}
