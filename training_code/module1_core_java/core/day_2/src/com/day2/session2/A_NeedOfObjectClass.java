package com.day2.session2;

public class A_NeedOfObjectClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee=new Employee(1, "raja", 40000);
		Employee employee2=(Employee) employee.clone();
		System.out.println(employee);
		System.out.println(employee2);
		foo(employee);
		
		
		
//	for(int i=0;i<100;i++) {
//		Employee employee=new Employee(1, "raja", 40000);
//		employee=null;
//	}
//		
//	System.gc();
//	Runtime.getRuntime().gc();
		
//		System.out.println(employee);
//		
//		Employee employee2=new Employee(1, "raja", 40000);
//		
//		if(employee.equals(employee2)) {
//			System.out.println("are eq");
//		}else {
//			System.out.println("not eq");
//		}
		
	}

	private static void foo(Employee employee) {
		
	}
	
}
