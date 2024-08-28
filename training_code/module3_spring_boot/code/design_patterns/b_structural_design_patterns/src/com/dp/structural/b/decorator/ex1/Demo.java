package com.dp.structural.b.decorator.ex1;

public class Demo {

	public static void main(String[] args) {
		Car car =new SuperSportCar(new SportCar(new BasicCar()));
		System.out.println(car.assemble());
	}
}
