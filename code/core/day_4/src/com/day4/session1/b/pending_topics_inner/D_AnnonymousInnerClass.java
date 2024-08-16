package com.day4.session1.b.pending_topics_inner;

interface Cookable{
	void cook();
}

public class D_AnnonymousInnerClass {

	public static void main(String[] args) {
		//java 8: functional programming
		//declartive programming: js
		
		
		Cookable cookable1=new Cookable() {	
			@Override
			public void cook() {
				System.out.println("ann impl of cook interface");
			}
		};
		
		myFoo(cookable1);
//				
//		cookable.cook();
		//java 7 vs 8: "type interference"
		
//		Cookable cookable2=
//				()-> System.out.println("ann impl of cook interface");
//			
//		cookable2.cook();
		
		
		Runnable runnable=()-> 
				System.out.println("job of threads");
			
	
		
		Thread thread=new Thread(runnable);
	}

	private static void myFoo(Cookable cookable1) {
		
	}

	
}
