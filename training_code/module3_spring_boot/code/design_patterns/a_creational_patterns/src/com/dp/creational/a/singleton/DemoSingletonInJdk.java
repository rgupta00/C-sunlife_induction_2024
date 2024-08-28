package com.dp.creational.a.singleton;

public class DemoSingletonInJdk {
	
	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		Runtime runtime1=Runtime.getRuntime();
		
		System.out.println(runtime.hashCode());
		System.out.println(runtime1.hashCode());
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
	}

}
