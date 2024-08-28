package com.dp.behavioural.d.template_dp;
public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("wooden framed wall");
	}

	@Override
	public void buildPillars() {
		System.out.println("wooden polished pillars");
	}


}