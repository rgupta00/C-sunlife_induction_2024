package com.dp.behavioural.b.observer_dp;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object ob) {
		System.out.println("price of stock is changed : "+ ob);
	}
	
}
