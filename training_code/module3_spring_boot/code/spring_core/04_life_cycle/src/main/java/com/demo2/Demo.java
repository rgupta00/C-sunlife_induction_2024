package com.demo2;

import com.demo.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
