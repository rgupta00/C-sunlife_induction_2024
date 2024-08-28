package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Car compose of Tyre and engine

@Component(value = "car")
public class Car {
		//field setter vs ctr
	private Engine engine;

	private Tyre tyre;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	@Autowired
	public Car(Engine engine, Tyre tyre) {
		this.engine = engine;
		this.tyre = tyre;
	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
