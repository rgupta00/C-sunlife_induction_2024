package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
final public class Singleton implements Cloneable {

	private volatile static Singleton singleton; //Eager vs Lazy
	
	//java reflection: it can break encapuslation?
	//used to create the framework
	private Singleton() {}
	
	//t1 t2
	public  static Singleton getSingleton() {
		if (singleton == null)
			synchronized (Singleton.class) {
				if(singleton==null)
					singleton = new Singleton();
			}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new UnsupportedOperationException();
		//return super.clone();
	}
	
	
}







