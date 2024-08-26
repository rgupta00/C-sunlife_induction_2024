package com.day3.session2.q2;

class AEx extends Exception{
}

class BEx extends AEx{}

class A{
//	void foo()throws AEx {
//		
//	}
//	void foo(int i) {
//		
//	}
	A()throws AEx{
		System.out.println("Ctr of A");
	}
}
class B extends A{
	B()throws Exception{
		System.out.println("Ctr of B");
	}
}
public class A_Ex_And_Overriding {
	
	public static void main(String[] args) {
		try {
			A a=new B();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
