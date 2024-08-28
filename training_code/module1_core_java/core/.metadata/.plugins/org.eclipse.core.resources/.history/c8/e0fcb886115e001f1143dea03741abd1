package com.threads.session1.classical_threads;

//C_UsingAnnInnerClass vs labmbda
public class C_UsingAnnInnerClass {
	public static void main(String[] args) {

		// annonymous inner class vs lambda expression (functional programming)
//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("job of the thread!");
//			}
//		};
		
		Runnable runnable = ()-> System.out.println("job of the thread!");
			
		
		Thread t=new Thread(runnable);
		t.start();
	}

	public static void foo() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " : start");
	}
}
