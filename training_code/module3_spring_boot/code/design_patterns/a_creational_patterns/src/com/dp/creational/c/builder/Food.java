package com.dp.creational.c.builder;

public class Food {
	private String name;// PG
	private int unit;// 80gm

	private int vitC;
	private int vitA;
	private int vitB12;
	private int vitB5;
	private int vitD;

	public Food(String name, int unit) {
		super();
		this.name = name;
		this.unit = unit;
	}

	public Food(String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD) {
		super();
		this.name = name;
		this.unit = unit;
		this.vitC = vitC;
		this.vitA = vitA;
		this.vitB12 = vitB12;
		this.vitB5 = vitB5;
		this.vitD = vitD;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", unit=" + unit + ", vitC=" + vitC + ", vitA=" + vitA + ", vitB12=" + vitB12
				+ ", vitB5=" + vitB5 + ", vitD=" + vitD + "]";
	}

	
}