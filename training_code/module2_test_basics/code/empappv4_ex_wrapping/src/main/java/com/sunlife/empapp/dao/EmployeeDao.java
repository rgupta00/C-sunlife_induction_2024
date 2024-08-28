package com.sunlife.empapp.dao;

import java.util.List;

import com.sunlife.empapp.exceptions.DaoException;

public interface EmployeeDao {
	public List<Employee> getAll();

	public Employee getById(int id);

	public void addEmployee(Employee employee);
}
