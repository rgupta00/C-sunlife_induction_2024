package com.demo;

import org.springframework.stereotype.Component;


@Component(value = "e2")
public class TurboEngine implements Engine{
	@Override
	public void move() {
		System.out.println("Turbo engine is working");
	}
}
