package com.day2.assignment.q1;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Employee employee=new Employee(1, "rajeev", "gupta", 1239);
		
		Employee employee2=new Employee(1, "rajeev", "gupta", 1239);
		if(employee.equals(employee2)) {
			System.out.println("eq");
		}else {
			System.out.println("not eq");
		}
		
		HashSet<Employee> set=new HashSet<>();
		set.add(new Employee(1, "rajeev", "gupta", 1239));
		System.out.println(set.contains(new Employee(1, "rajeev", "gupta", 1239)));
		
	}
}
