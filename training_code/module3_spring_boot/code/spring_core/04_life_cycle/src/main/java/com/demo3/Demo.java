package com.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Demo {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Bar bar= (Bar) ctx.getBean("bar");
		bar.doWork();
		bar.doWork();
	}
}
