package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Demo {

	public static void main(String[] args) {
		//Without DI
//		Tyre tyre=new MrfTyre();
//		Engine engine=new V8Engine();
//		Car car =new Car(engine, tyre);
//		car.drive();

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		Car car= (Car) ctx.getBean("car");
		System.out.println(car.hashCode());

		Car car2= (Car) ctx.getBean("car");
		System.out.println(car2.hashCode());

		car.drive();
	}
}
