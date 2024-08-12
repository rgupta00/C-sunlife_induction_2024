package com.day1.session1;

class Car{
	public void move() {
		System.out.println("moving in a car");
	}
}
public class Hello {
	public  static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		//}
		
		Car cars[]=new Car[5];
		cars[0]=new Car();
		cars[1]=new Car();
		cars[2]=new Car();
		cars[3]=new Car();
		cars[4]=new Car();
//		
//		for(int i=0;i<cars.length; i++) {
//			cars[i].move();
//		}
		//java 5: enhance for loop
		for(Car car: cars) {
			car.move();
		}
	}
}
