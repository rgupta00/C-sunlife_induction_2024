package com.calculator;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@DisplayName("add two numbers")
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void divideTest() {
		ArithmeticException ex = 
				assertThrows(ArithmeticException.class, ()-> calculator.divide(3, 0));
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	

}
