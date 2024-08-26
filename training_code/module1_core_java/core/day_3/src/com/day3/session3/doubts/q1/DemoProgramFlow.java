package com.day3.session3.doubts.q1;

class M {
	private int i;
	private static int j;

	public M() {
		System.out.println("ctr of calss M");
	}

	public void logic() {
		System.out.println("logic");
	}

	static {
		j = 9;
		System.out.println("it is static init block");
	}
	{
		System.out.println("it is init block");
	}
}

public class DemoProgramFlow {

	public static void main(String[] args) {
		System.out.println("demo");
		M m = new M();
		m.logic();
		
		M m2 = new M();
		m2.logic();
	}

}
