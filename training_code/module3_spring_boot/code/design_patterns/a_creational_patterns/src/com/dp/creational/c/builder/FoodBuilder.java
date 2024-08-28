package com.dp.creational.c.builder;
public class FoodBuilder {
		
		private String name;
		private int unit;
		
		private int vitC=100;
		private int vitA=100;
		private int vitB12=100;
		private int vitB5=100;
		private int vitD=5000;
		
		
		public FoodBuilder(String name, int unit) {
			this.name = name;
			this.unit = unit;
		}
		
		
		public Food build(){
			return new Food(name, unit, vitC, vitA, vitB12, vitB5, vitD);
		}


		public FoodBuilder setVitC(int vitC) {
			this.vitC = vitC;
			return this;
		}


		public FoodBuilder setVitA(int vitA) {
			this.vitA = vitA;
			return this;
		}


		public FoodBuilder setVitB12(int vitB12) {
			this.vitB12 = vitB12;
			return this;
		}


		public FoodBuilder setVitB5(int vitB5) {
			this.vitB5 = vitB5;
			return this;
		}


		public FoodBuilder setVitD(int vitD) {
			this.vitD = vitD;
			return this;
		}
	
		
		
	
//		public FoodBuilder setName(String name) {
//			this.name = name;
//			return this;
//		}

	}