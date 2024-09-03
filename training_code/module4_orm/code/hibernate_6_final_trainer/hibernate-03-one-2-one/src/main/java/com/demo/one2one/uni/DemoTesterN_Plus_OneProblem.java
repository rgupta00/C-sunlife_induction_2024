package com.demo.one2one.uni;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Transaction;

public class DemoTesterN_Plus_OneProblem {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("raj");
		Employee employee2=new Employee("ekta");
		Employee employee3=new Employee("gun");
		Employee employee4=new Employee("keshav");
		Employee employee5=new Employee("vikas");
		
		Parking parking1=new Parking("A12");
		Parking parking2=new Parking("M2");
		Parking parking3=new Parking("B2");
		Parking parking4=new Parking("T11");
		Parking parking5=new Parking("U12");
		
		
		parking1.setEmployee(employee1);
		parking2.setEmployee(employee2);
		parking3.setEmployee(employee3);
		parking4.setEmployee(employee4);
		parking5.setEmployee(employee5);
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		//if we run as it is it will take 1+5 => N+1 problem
		//in both the cases the quaries would be same : lazy vs eager

		//"featch join": HQL
		//from Parking p join fetch p.employee Employee
//		List<Parking> parkings=
//				session.createQuery("select p from Parking p").getResultList();

		//it have no effect
		//select p from Parking p join p.employee Employee

		List<Parking> parkings=
				session.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("----------------");
		for(Parking parking : parkings) {
			System.out.println("----------------");
			System.out.println(parking.getParkingLocation());
			System.out.println(parking.getEmployee().getEmpName());
		}




//		Transaction tx=session.getTransaction();

//		try{
//			tx.begin();
//			session.save(parking1);
//			session.save(parking2);
//			session.save(parking3);
//			session.save(parking4);
//			session.save(parking5);
////			session.save(employee1);
////			session.save(employee2);
////			session.save(employee3);
////			session.save(employee4);
////			session.save(employee5);
//
//			//due to cascading in dont need to that   session.save(employee1);
//
//			tx.commit();
//		}catch (HibernateException ex){
//			System.out.println(ex);
//			tx.rollback();
//		}
		session.close();
		factory.close();


		//I want to get a particualr parking

//		Parking parking=session.get(Parking.class, 8);
//		System.out.println(parking.getParkingLocation());
//		System.out.println(parking.getEmployee().getEmpName());










		

		
		
		//Spring tx*
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();		
//			Parking parking=session.get(Parking.class, 5);
//			session.delete(parking);
//			
//			tx.commit();
//			
//		} catch (HibernateException ex) {
//			tx.rollback();
//			ex.printStackTrace();
//		}

	}

}



//select p from Parking p
	/*	List<Parking>parkings=session
				.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("------------------------------------");
		for(Parking parking : parkings) {
			System.out.println(parking);
			//System.out.println(parking.getEmployee());
		}
		*/


//		for(Parking parking : parkings) {
//			System.out.println(parking.getEmployee());
//		}
