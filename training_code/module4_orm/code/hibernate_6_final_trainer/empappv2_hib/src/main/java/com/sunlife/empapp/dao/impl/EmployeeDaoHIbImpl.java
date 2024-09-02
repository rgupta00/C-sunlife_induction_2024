package com.sunlife.empapp.dao.impl;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDaoHIbImpl implements EmployeeDao {

    private SessionFactory sessionFactory;

    public EmployeeDaoHIbImpl(){
        sessionFactory= HibernateSessionFactory.getSessionFactory();
    }
    @Override
    public List<Employee> getAll() {
        Session session=sessionFactory.openSession();
        List<Employee> employees=session
                .createQuery("select e from Employee e", Employee.class).list();
        session.close();
        return employees;
    }

    @Override
    public Employee getById(int id) {
        Session session=sessionFactory.openSession();
        Employee employee=session
                .get(Employee.class, id);
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

    @Override
    public void update(int id, Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            Employee employeeToUpdate=getById(id);
            if(employeeToUpdate!=null){
               employeeToUpdate.setSalary(employee.getSalary());
               session.update(employeeToUpdate);
            }

            tx.commit();
        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            Employee employeeToDelete=getById(id);
            if(employeeToDelete!=null){
                session.delete(employeeToDelete);
            }
            tx.commit();
        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }
}
