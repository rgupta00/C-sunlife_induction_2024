package com.sunlife.empapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.factory.ConnectionFactory;
import com.sunlife.empapp.exceptions.DaoException;
import com.sunlife.empapp.exceptions.EmployeeNotFoundException;
import com.sunlife.empapp.exceptions.HibernateException;

public class EmployeeDaoHibImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoHibImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAll() {
		try {
			if(1==1)
				throw new HibernateException();
		}catch(HibernateException e) {
			throw new DaoException(e);
		}
		return null;
	}

	@Override
	public Employee getById(int id) {
		try {
			if(1==1)
				throw new HibernateException();
		}catch(HibernateException e) {
			throw new DaoException(e);
		}
		return null;
	}

	@Override
	public void addEmployee(Employee employee)  {
		try {
			if(1==1)
				throw new HibernateException();
		}catch(HibernateException e) {
			throw new DaoException(e);
		}	
	}

}





