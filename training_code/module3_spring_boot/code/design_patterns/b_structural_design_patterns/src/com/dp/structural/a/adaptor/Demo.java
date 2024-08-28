package com.dp.structural.a.adaptor;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//adaptor
		List<String> list=Arrays.asList("foo","bar");
		
		
		
		RoundPeg peg = new RoundPeg();
		PegAdaptor adaptor=new PegAdaptor(peg);
		useSquarePeg(adaptor);
	}
	
	public static void useSquarePeg(SquarePeg peg) {
		//do some operation
		peg.insert("some random shape");
	}
}
