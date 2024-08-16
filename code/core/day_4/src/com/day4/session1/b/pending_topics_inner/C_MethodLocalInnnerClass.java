package com.day4.session1.b.pending_topics_inner;
//
class X {

	//?
	void foo() {
		int k=6;// effectivly final
		
		class Y {
			void foo() {
				System.out.println("foo method of Y class "+k);
				//k++;
			}
		}
		Y y=new Y();
		y.foo();
	}
	void bar() {
		X x=new X();
		x.foo();
	}

}

public class C_MethodLocalInnnerClass {

	public static void main(String[] args) {

	}
}
