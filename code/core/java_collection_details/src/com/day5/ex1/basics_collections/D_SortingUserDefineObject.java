package com.day5.ex1.basics_collections;
import java.util.*;
public class D_SortingUserDefineObject {

	public static void main(String[] args) {
		//Natural sort vs extra sort seq
		//Comparable vs Comparator=> to sort user define data
		
		List<Employee>employees=new ArrayList<>();

		employees.add(new Employee(123,	"zen", "delhi", 45000.00));
		employees.add(new Employee(13,	"sumit", "noida", 42000.00));
		employees.add(new Employee(93,	"sumit", "banglore", 49000.00));
		employees.add(new Employee(939,	"amit", "chennai", 59000.00));
		
		System.out.println("---printing all emps as it is-------------");

		printAll(employees);
		
		//?
		Collections.sort(employees);
		
		
		System.out.println("---sorted as per id----------");
		printAll(employees);

		Collections.sort(employees, new NameSorter());
		System.out.println("---sorted as per name-----------");
		
		Collections.sort(employees, new NameSorterThenSalary());
		System.out.println("---sorted as per name and salary-----------");
		
		printAll(employees);
	}

	private static void printAll(List<Employee> employees) {
		for(Employee e: employees){
			System.out.println(e);
		}
	}


}




