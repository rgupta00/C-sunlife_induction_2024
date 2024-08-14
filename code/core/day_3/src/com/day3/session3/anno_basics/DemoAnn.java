package com.day3.session3.anno_basics;
import java.util.*;
class Foo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void dataProcessing() {
		ArrayList l=new ArrayList();
		l.add("data");
	}
	@Deprecated
	public void oldApi() {
		System.out.println("api old..");
	}
	void foo() {
		System.out.println("I");
	}
}

class Bar extends Foo {
	@Override
	void foo() {
		System.out.println("II");
	}
}

public class DemoAnn {

	public static void main(String[] args) {

		Foo f=new Bar();
		f.oldApi();
	}
}
