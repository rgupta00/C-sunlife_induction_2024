package com.day2.session1;
//can i ask a object about meta data of the class?
class Emp{
	
}
public class A_DemoClass {

	public static void main(String[] args) {
		Emp e1=new Emp();
		Class<? extends Emp> class1 = e1.getClass();//java reflection*
		System.out.println(class1.getName());
		Emp e2=new Emp();
		
		Class<? extends Emp> class2 = e2.getClass();//java reflection*
		System.out.println(class2.getName());
		
	}
}
