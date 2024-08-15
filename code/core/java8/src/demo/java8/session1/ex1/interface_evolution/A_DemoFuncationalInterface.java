package demo.java8.session1.ex1.interface_evolution;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//SAM: single abs method 
@FunctionalInterface
interface Food{
	public void cook();
	public default  void fooDefault() {
		System.out.println("foo default method");
	}
	public static  void fooStatic() {
		System.out.println("foo stataic method");
	}
}

interface Cal{
	int add(int a, int b);
}

public class A_DemoFuncationalInterface {
	public static void main(String[] args) {
		
		
		Cal cal=( a,  b) ->a+b;
			
		System.out.println(cal.add(2, 1));
		
		Runnable runnable=()-> System.out.println("job of the thread...");
			
		
		
		
		
		/*
		what is funcational interface =>
		lambda expression vs ann inner class
		how to do funcational programing in java aka decleratitive programing in java
		//stream processing in java
		 */
		//SAM: single abs method ->Fuctional interface-> lambda
	

		//ann inner class : bad 
//		Food foo=new Food() {
//			
//			@Override
//			public void cook() {
//				System.out.println("food implemation");
//			}
//		};
		
		
//		Food food=() ->  System.out.println("food implemation");
//			
//		food.cook();
		

	}
}


