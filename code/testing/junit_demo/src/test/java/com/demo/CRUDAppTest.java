package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Annotation processing: annotation how it is process? + java reflection*
//can we create own framework

@TestMethodOrder(OrderAnnotation.class)
class CRUDAppTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@Order(value = 2)
	@DisplayName("add new data")
	@Test
	void addData() {
		System.out.println("add new data");
	}

	@Order(value = 1)
	@DisplayName("delete old data")
	@Test
	void deleteingData() {
		System.out.println("delete all data");
	}
	
	

	@Order(value = 3)
	@DisplayName("udpate data")
	@Test
	void updateData() {
		System.out.println("update data");
	}

	@Order(value = 4)
	@DisplayName("get all data")
	@Test
	void getAllData() {
		System.out.println("get all data");
	}


	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

}
