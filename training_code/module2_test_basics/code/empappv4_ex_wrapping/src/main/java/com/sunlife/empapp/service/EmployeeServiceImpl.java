package com.sunlife.empapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.impl.EmployeeDaoJdbcImpl;
import com.sunlife.empapp.exceptions.DaoException;
import com.sunlife.empapp.exceptions.DataAccessException;
import com.sunlife.empapp.exceptions.EmployeeNotFoundException;

//Service layer= BL + CCC* (Spring)
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoJdbcImpl();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = null;
		try {
			long start = System.currentTimeMillis();
			employees = employeeDao.getAll();
			long end = System.currentTimeMillis();
			logger.info("time taken: " + (end - start) + " ms");
			return employees;
		} catch (DaoException e) {
			logger.info(e.getCause().toString());
			throw new DataAccessException("database intraction failed");
		}

	}

	@Override
	public Employee getById(int id) {
		Employee employee = employeeDao.getById(id);
		if (employee == null)
			throw new EmployeeNotFoundException("emp with id " + id + " not found");
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		// validation
		employeeDao.addEmployee(employee);
	}

}
