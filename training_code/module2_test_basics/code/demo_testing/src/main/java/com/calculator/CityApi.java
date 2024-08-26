package com.calculator;

public class CityApi {

	public String getCity() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		return "delhi";
	}
}
