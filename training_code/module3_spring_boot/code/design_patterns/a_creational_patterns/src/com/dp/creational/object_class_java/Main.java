package com.dp.creational.object_class_java;

import java.util.Date;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
	
	

		Employee employee1=new Employee(1, "raj", new Date());
		Employee employee2=new Employee(1, "raj", new Date());
		
		//it can give u very useful information
		Class<?>class1=employee1.getClass();
		
		
//		if(employee1==employee2) {
//			System.out.println("are eq");
//		}else {
//			System.out.println("not ");
//		}
		
//		if(employee1.equals(employee2)) {
//			System.out.println("are eq");
//		}else {
//			System.out.println("not ");
//		}
		//hashing tech: 
		
		HashSet<Employee> set=new HashSet<>();
		set.add(new Employee(1, "raj", new Date()) );
		
		System.out.println(set.contains(new Employee(1, "raj", new Date())));
		
	}

}
