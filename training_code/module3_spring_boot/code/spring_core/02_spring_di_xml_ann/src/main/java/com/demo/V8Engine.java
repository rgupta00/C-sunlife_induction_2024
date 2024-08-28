package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "e1")
@Primary
public class V8Engine  implements Engine{
	public void move() {
		System.out.println("V8 engine is working");
	}
}
