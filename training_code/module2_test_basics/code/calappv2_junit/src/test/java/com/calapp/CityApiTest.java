package com.calapp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CityApiTest {

	private CityApi api;
	@BeforeEach
	void setUp() throws Exception {
		api=new CityApi();
	}

	//Junit 5: DI
	@DisplayName("get CityName Test TimingTest aka performance test")
	@Test
	void getCityNameTestTimingTest(TestInfo testInfo) {
//		System.out.println(testInfo.getDisplayName());
//		System.out.println(testInfo.getTestClass().getClass().getName());
		Assertions.assertTimeout(Duration.ofMillis(2000), ()-> api.getCityName());
	}

	@AfterEach
	void tearDown() throws Exception {
		api=null;
	}


}
