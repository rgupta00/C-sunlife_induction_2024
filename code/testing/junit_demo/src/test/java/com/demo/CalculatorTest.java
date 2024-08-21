package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//Annotation processing: annotation how it is process? + java reflection*
//can we create own framework
class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll: before any test case run");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach: before test case");
	}


	@Tag(value = "dev")
	@Test
	void testAdd() {
		System.out.println("=====================test add is called=with dev tag======================");
	}
	
	@Tag(value = "test")
	@Test
	void testMul() {
		System.out.println("==================test mul is called= with test tag===============");
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@After : After test case");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll: after all test case run");
	}

}
