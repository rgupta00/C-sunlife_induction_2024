package com.dp.structural.b.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

//good morning -> very good morning -> special very good morning 

interface Greet{
	public String greet();
}

class SimpleGreet implements Greet{

	@Override
	public String greet() {
		return "good morning";
	}
}

class SpecialGreet implements Greet{
	private Greet greet;
	
	public SpecialGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "very "+greet.greet();
	}
}

class VerySpecialGreet implements Greet{
	private Greet greet;
	
	public VerySpecialGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "special "+greet.greet();
	}
}
public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
	
//		SimpleGreet greet2=new SimpleGreet();
//		System.out.println(greet2.greet());
		
		
		
		Greet greet=new VerySpecialGreet(new SpecialGreet(new SimpleGreet()));
		
		
		System.out.println(greet.greet());
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader  br2=new BufferedReader(new FileReader(new File("foo.txt")));
	}
}
