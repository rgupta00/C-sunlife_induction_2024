package com.calapp;

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
@EnabledOnOs(OS.WINDOWS)
@EnabledOnJre(JRE.JAVA_17)
class CalculatorTest2 {

	private Calculator calculator;
	
	@BeforeEach
	public void before() {
		calculator=new Calculator();
	}
	@Test
	public void myTC() {
		System.out.println("it is my tc");
	}
	
	@Disabled
	@DisplayName("add two numbers test case")
	@Test
	public void add_two_numbers() {
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	@DisplayName("mul two numbers test case")
	public void mul_two_numbers() {
		assertEquals(4, calculator.mul(2, 2));
	}
	
	@Test
	@DisplayName("divide two numbers test case: postive case")
	public void divide_two_numbers_with_success() {
		assertEquals(10, calculator.divide(20, 2));
	}
	
	@Test
	@DisplayName("divide two numbers test case: negative case")
	public void divide_two_numbers_with_arithmantic_ex() {
		assertThrows(ArithmeticException.class, ()-> calculator.divide(3, 0));
	}
	
	@AfterEach
	public void after() {
		calculator=null;
	}
}
