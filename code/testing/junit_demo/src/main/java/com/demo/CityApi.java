package com.demo;

public class CityApi {

	public String getCity(int id) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "delhi";
	}
}
