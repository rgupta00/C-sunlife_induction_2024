package com.calapp;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class EmployeeAppTest {

	@Order(value = 4)
	@Test
	public void deleteEmp() {
		System.out.println("delete emp test case runs ");
	}
	
	@Order(value = 1)
	@Test
	public void addEmp() {
		System.out.println("add emp test case runs ");
	}
	@Order(value = 2)
	@Test
	public void getAllEmp() {
		System.out.println("getAllEmp test case runs ");
	}
	@Order(value = 3)
	@Test
	public void updateEmp() {
		System.out.println("update emp test case runs ");
	}
	
}
