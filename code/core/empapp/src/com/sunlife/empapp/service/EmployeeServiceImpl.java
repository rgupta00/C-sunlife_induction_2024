package com.sunlife.empapp.service;

import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.impl.EmployeeDaoJdbcImpl;
import com.sunlife.empapp.exceptions.EmployeeNotFoundException;
//Service layer= BL + CCC* (Spring)
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoJdbcImpl();
	}
	
	@Override
	public List<Employee> getAll() {
		long start=System.currentTimeMillis();
		List<Employee> employees=employeeDao.getAll();
		long end=System.currentTimeMillis();
		System.out.println("time taken: "+(end-start )+" ms");
		return employees;
	}

	@Override
	public Employee getById(int id) {
		Employee employee=employeeDao.getById(id);
		if(employee==null)
			throw new EmployeeNotFoundException("emp with id "+ id +" not found");
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		//validation
		employeeDao.addEmployee(employee);
	}

}
