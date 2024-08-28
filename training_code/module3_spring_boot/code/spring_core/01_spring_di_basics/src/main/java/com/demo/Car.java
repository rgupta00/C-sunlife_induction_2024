package com.demo;
//Car compose of Tyre and engine
public class Car {
	private Engine engine;
	private Tyre tyre;

	public Car(Engine engine, Tyre tyre) {
		this.engine =engine;
		this.tyre = tyre;
	}
	
//	public Car() {
//		this.engine = new V8Engine();
//		this.tyre = new MrfTyre();
//	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
