package com.calapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("-------before any test case run---");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("-------before every test case---");
	}

	@Test
	void test() {
		System.out.println("test case 1");
	}
	
	@Test
	void test2() {
		System.out.println("test case 2");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("------after every test case run---");
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("-------After all test case run---");
	}


}
