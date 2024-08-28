package com.calapp;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Tag("dev")
	@Test
	public void deleteEmp() {
		System.out.println("delete emp test case runs====dev ");
	}
	@Tag("dev")
	@Test
	public void addEmp() {
		System.out.println("add emp test case runs ===dev");
	}
	
	@Tag("prod")
	@Test
	public void getAllEmp() {
		System.out.println("getAllEmp test case runs === prod ");
	}
	
	@Tag("prod")
	@Test
	public void updateEmp() {
		System.out.println("update emp test case runs ==== prod");
	}
	
}
