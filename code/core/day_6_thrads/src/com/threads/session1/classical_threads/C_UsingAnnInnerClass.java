package com.threads.session1.classical_threads;

//C_UsingAnnInnerClass vs labmbda
public class C_UsingAnnInnerClass {
	public static void main(String[] args) {
		
		Runnable runnable=()-> 
				System.out.println("job of thread");
			
		Runnable runnable2=C_UsingAnnInnerClass::foo;
		
		Thread thread=new Thread(runnable);
		thread.start();
		
	}

	public static void foo() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " : start");
	}
}
