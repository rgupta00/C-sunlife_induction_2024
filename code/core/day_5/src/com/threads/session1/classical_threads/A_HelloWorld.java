package com.threads.session1.classical_threads;
//Job and worker analogy
//Thread(object of thraeds act as worker) and Runnable(aka job)

class Job implements Runnable{
	@Override
	public void run() {
		System.out.println("job of thread stated: "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1200);
		}catch(InterruptedException e) {}
		System.out.println("job of thread done: "+ Thread.currentThread().getName());
	}
	
}

public class A_HelloWorld {
    public static void main(String[] args) {
    	System.out.println("Main job of thread: "+ Thread.currentThread().getName());
    	
    	Job job=new Job();
    	Thread thread=new Thread(job , "a");
    	Thread thread2=new Thread(job , "b");
    	Thread thread3=new Thread(job , "c");
    	
    	
    	thread.start();//never call run() directly? 
    	//thread.start();
    	thread2.start();
    	thread3.start();
    	
    	//how to ensure that main thrad should finished to end: orphan threads
    	try {
    		thread.join();
    		thread2.join();
    		thread3.join();
    	}catch(InterruptedException e) {}
    	
    	System.out.println("Main job of thread done : "+ Thread.currentThread().getName());
    }
}
