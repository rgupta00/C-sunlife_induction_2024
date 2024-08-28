package com.calapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatorParameterized {

	private Calculator calculator;

	@BeforeEach
	public void before() {
		calculator = new Calculator();
	}

	@ParameterizedTest
	@DisplayName("demo of parametized test case")
	@CsvFileSource(resources = "/val.csv", numLinesToSkip = 1)
	public void add_two_numbers(int a, int b, int result) {
		Assertions.assertEquals(result, calculator.add(a, b));
	}

	@AfterEach
	public void after() {
		calculator = null;
	}
}
