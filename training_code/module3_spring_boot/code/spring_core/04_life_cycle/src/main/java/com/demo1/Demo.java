package com.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {

		AbstractApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();

		Foo foo= (Foo) ctx.getBean("foo");
		System.out.println(foo.hashCode());

		foo.doWork();
		System.out.println("-----------------------------");
	}
}
