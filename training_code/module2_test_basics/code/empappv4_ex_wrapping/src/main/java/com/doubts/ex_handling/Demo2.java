package com.doubts.ex_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2 {
	public static void main(String[] args) throws FileNotFoundException {
		foo();
	}

	private static void foo() throws FileNotFoundException {
		bar();
	}

	private static void bar() throws FileNotFoundException {
		jar();
	}

	private static void jar() throws FileNotFoundException {
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
	}

}
