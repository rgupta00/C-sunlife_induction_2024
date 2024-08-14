package com.day3.session3.doubts.q1;

public class N {

	void N(){
		System.out.println("bar");
	}
	
	N(){
		System.out.println("foo");
	}
	public static void main(String[] args) {
		new N().N();
	}
}
