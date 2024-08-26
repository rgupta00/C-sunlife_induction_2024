package com.calculator;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CityApiTest {

	private CityApi api;
	
	@BeforeEach
	void setUp() throws Exception {
		api=new CityApi();
	}
	@Test
	
	public void testCityApi() {
		assertTimeout(Duration.ofMillis(2000), ()-> api.getCity());
	}

	@AfterEach
	void tearDown() throws Exception {
		api=null;
	}

	
}
