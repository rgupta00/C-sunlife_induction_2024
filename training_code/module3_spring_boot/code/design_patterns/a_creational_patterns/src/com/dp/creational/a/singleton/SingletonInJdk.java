package com.dp.creational.a.singleton;

public class SingletonInJdk {
	
	public static void main(String[] args) {
		Runtime runtime1=Runtime.getRuntime();
		Runtime runtime2=Runtime.getRuntime();
		System.out.println(runtime1);
		System.out.println(runtime2);
		
		//System.out.println(runtime.availableProcessors());
	}

}
