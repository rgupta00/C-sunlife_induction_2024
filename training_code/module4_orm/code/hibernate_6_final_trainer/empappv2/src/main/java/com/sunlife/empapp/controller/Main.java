package com.sunlife.empapp.controller;

import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.service.EmployeeService;
import com.sunlife.empapp.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.addEmployee(new Employee("ravi",56000.00));
//		List<Employee> employees=employeeService.getAll();
//		employees.forEach(e-> System.out.println(e));
//
//		Employee employee=employeeService.getById(1);
//		System.out.println(employee);
	}
}
