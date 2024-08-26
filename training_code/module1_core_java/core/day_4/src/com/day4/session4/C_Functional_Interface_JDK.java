package com.day4.session4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class C_Functional_Interface_JDK {

	public static void main(String[] args) {
		//ann inn class -->lambda express ---> funcational interface ---> stream processing
		
		Runnable runnable=()-> System.out.println("hello to java");
		
		//funcational interface: that support declartive data processing
		//Predicate, Function, Consumer, Supplier..
		
		Predicate<Integer> isEven= n-> n%2==0;
		System.out.println(isEven.test(23));
		
		//funcation : coverting something to something else
		
		Function<String, Integer> function= s-> s.length();
		
		System.out.println(function.apply("rajiv"));
			
		Consumer<String> consumer=(String s)-> System.out.println(s);
			
		
		
	
	}
}
