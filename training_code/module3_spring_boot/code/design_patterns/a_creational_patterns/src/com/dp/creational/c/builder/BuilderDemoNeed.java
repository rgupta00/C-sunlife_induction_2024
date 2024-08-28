package com.dp.creational.c.builder;

public class BuilderDemoNeed {

	public static void main(String[] args) {
		//Food food=new Food("PG", 80, 100, 200, 123, 1000, 230000);
		
		Food food2=new FoodBuilder("PG", 80)
				.setVitA(1000)
				.setVitB5(2000)
				.setVitD(34000)
				.build();
		System.out.println(food2);
	}
}
