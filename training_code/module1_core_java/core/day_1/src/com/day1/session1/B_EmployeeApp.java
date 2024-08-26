package com.day1.session1;

class Employee {

	private int id;// instance varibale
	private String name;
	private double salary;

	private static int counter;// class varaible

	// init block

	{
		System.out.println("it is some common code");
	}

	// Default
	public Employee() {

		System.out.println("default ctr");
	}

	// Para
	public Employee(String name, double salary) {

		this.id = ++counter;
		this.name = name;// this assignment have no effect
		this.salary = salary;

	}

	// copy ctr
	public Employee(Employee e) {
		id = e.id;
		name = e.name;
		salary = e.salary;
	}

	// static method :1. "this" is not avaible
	// 2. object is not req while calling this method
	public static int getCounter() {
		return counter;
	}

	public void printEmployeeDetails() {
		System.out.println("id : " + this.id + " name: " + name + " salary: " + salary);
		// can be refer static data in normal method
		// System.out.println("couter :" + counter);
	}

	// static init block
	static {
		System.out.println("it is code for init static data");
		counter = 0;// cal
	}
	static {
		System.out.println("it is code for init static data 2");
		// return 4;
	}
}

//junit vs main
public class B_EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee("ravi", 80000);
		Employee employee2 = new Employee("ekta", 90000);
		employee.printEmployeeDetails();
		employee2.printEmployeeDetails();

		// The static method getCounter() from the type Employee should be accessed in a
		// static way
//		System.out.println(employee.getCounter());
//		System.out.println(employee2.getCounter());
		System.out.println(Employee.getCounter());
	}
}
