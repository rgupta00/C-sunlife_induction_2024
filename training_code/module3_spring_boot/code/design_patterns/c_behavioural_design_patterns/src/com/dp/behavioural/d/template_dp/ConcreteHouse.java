package com.dp.behavioural.d.template_dp;
public class ConcreteHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Concrete walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Concrete pillars");
	}

	

}