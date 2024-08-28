package com.dp.behavioural.d.template_dp;

public class Demo {

	public static void main(String[] args) {

		HouseTemplate houseType = new ConcreteHouse();
		
		//using template method
		houseType.buildHouse();
		System.out.println("************");


	}
}
