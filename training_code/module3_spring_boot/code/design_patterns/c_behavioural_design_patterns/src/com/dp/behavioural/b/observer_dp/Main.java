package com.dp.behavioural.b.observer_dp;

public class Main {

	public static void main(String[] args) {
		MySubject subject=new MySubject("Amdoc", 55);
		
		MyObserver o=new MyObserver();
//		
		subject.addObserver(o);
//		
		
		
		MyObserver o1=new MyObserver();
		subject.addObserver(o1);
		
		subject.deleteObserver(o);
		
		subject.setPrice(88);
		subject.setPrice(99);
		
	}
}
