package com.sunlife.empapp.controller;

import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.service.EmployeeService;
import com.sunlife.empapp.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		//employeeService.addEmployee(new Employee("amir",67000.00));
		///System.out.println("-----------------------");
//		List<Employee> employees=employeeService.getAll();
//		employees.forEach(e-> System.out.println(e));
		
//		Employee employee=employeeService.getById(100);
//		System.out.println(employee);
	}
}
