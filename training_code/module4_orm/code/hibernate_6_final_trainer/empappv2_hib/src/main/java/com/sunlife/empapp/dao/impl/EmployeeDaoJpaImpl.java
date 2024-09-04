package com.sunlife.empapp.dao.impl;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.factory.JpaEMFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class EmployeeDaoJpaImpl implements EmployeeDao {

    private EntityManagerFactory emf;

    public EmployeeDaoJpaImpl(){
        emf= JpaEMFactory.entityManagerFactory();
    }
    @Override
    public List<Employee> getAll() {
        EntityManager em=emf.createEntityManager();
        List<Employee> employees=em.createQuery("select e from Employee e").getResultList();
        em.close();
        return employees;
    }

    @Override
    public Employee getById(int id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void update(int id, Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
