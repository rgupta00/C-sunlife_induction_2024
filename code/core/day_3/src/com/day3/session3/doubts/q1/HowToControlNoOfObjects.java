package com.day3.session3.doubts.q1;
class A{
	private  static A a=new A();
	
	private A() {
		System.out.println("it is a ctr");
	}
	
	public static A getA() {
		return a;
	}
}
public class HowToControlNoOfObjects {
	
	public static void main(String[] args) {
		A a=A.getA();
		System.out.println(a.hashCode());
		
		A a2=A.getA();
		System.out.println(a2.hashCode());
		
	}

}
