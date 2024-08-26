package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//Annotation processing: annotation how it is process? + java reflection*
//can we create own framework
//@EnabledOnOs(OS.LINUX)
//@EnabledOnJre(JRE.JAVA_15)
class CalculatorTest2 {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@DisplayName("add test case")
	@Test
	void testAdd() {
		Assertions.assertEquals(4, calculator.add(3, 1));
	}

	@DisplayName("mul test case")
	@Test
	void testMul() {
		Assertions.assertEquals(3, calculator.mul(3, 1));
	}
	
	@DisplayName("divide test case success")
	@Test
	void testDivideWithSuccess() {
		Assertions.assertEquals(10, calculator.divide(30, 3));
	}
	
	@Disabled
	@DisplayName("divide test case With exception")
	@Test
	void testDivideWithArithMaticEx() {
		ArithmeticException assertThrows = 
				Assertions.assertThrows(ArithmeticException.class, ()-> calculator.divide(30, 0));
		Assertions.assertEquals("divide by zero", assertThrows.getMessage());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

}
