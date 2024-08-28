package com.sunlife.empapp.controller;

import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.exceptions.DataAccessException;
import com.sunlife.empapp.service.EmployeeService;
import com.sunlife.empapp.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		try {
			EmployeeService employeeService=new EmployeeServiceImpl();
			List<Employee> employees=employeeService.getAll();
			employees.forEach(e-> System.out.println(e));
		}catch(DataAccessException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
//		Employee employee=employeeService.getById(1);
//		System.out.println(employee);
	}
}
