package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Demo {
	public static void main(String[] args) {
//		ApplicationContext ctx=
//				new ClassPathXmlApplicationContext("beans.xml");
		//bean creation: lazy vs eager creation
		//BeanFactory (lazy) vs ApplicationContext(eager)
		//ApplicationContext vs AbstractApplicationContext(destroy method call)
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		ctx.registerShutdownHook();

		Foo foo= (Foo) ctx.getBean("foo");
		System.out.println(foo.hashCode());

		Foo foo2= (Foo) ctx.getBean("foo");
		System.out.println(foo2.hashCode());

		foo.doWork();
		foo.doWork();
		foo.doWork();
		System.out.println("-----------------------------");
	}
}
