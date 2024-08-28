package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "t2")
public class CeatTyre implements Tyre {
	@Override
	public void rotate() {
		System.out.println("ceat tyre is rotating");
	}
}
