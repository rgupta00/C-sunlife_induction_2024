package com.sunlife.empapp.service;

import java.util.List;

import com.sunlife.empapp.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public Employee getById(int id);
	public void addEmployee(Employee employee);
}
