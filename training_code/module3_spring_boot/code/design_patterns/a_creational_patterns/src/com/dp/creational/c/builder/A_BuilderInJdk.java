package com.dp.creational.c.builder;

public class A_BuilderInJdk {
	
	public static void main(String[] args) {
		//StringBuilder vs String
		
		String a="foo"+"bar"+"jar"+"car";//good code or bad code
		
		String a2=new StringBuilder().append("foo").append("bar").append("jar").append("car").toString();
		
		System.out.println(a2);
		
		
		
		
	}

}
