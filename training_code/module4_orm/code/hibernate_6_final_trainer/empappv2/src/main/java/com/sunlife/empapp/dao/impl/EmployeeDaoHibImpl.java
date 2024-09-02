package com.sunlife.empapp.dao.impl;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDaoHibImpl implements EmployeeDao {

    private SessionFactory sessionFactory;

    public EmployeeDaoHibImpl(){
        sessionFactory= HibernateSessionFactory.getSessionFactory();
    }

    @Override
    public List<Employee> getAll() {
        Session session=sessionFactory.openSession();
        List<Employee> employees=session.createQuery("select e from Employee e",
                Employee.class).list();
        session.close();
        return employees;
    }

    @Override
    public Employee getById(int id) {
        Session session=sessionFactory.openSession();
        Employee employee=session.get(Employee.class, id);
        session.close();
        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            session.save(employee);
            tx.commit();
        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        session.close();

    }
}
