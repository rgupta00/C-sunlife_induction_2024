package com.day3.session3.doubts;

import com.day3.session3.doubts.q1.A;

class A{
	A(){
		System.out.println("ctr of class A");
	}
	public void print() {
		System.out.println("print for A is called ");
	}
}
class B extends A{
	B(){
		System.out.println("ctr of class B");
	}
	public void print() {
		super.print();
		System.out.println("print for B is called ");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.print();
	}
}
