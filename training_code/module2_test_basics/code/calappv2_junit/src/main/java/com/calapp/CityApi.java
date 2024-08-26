package com.calapp;

public class CityApi {

	public String getCityName() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		return "New Delhi";
		
	}
}
