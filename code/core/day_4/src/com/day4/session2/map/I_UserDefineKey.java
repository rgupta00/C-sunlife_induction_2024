package com.day4.session2.map;

import java.util.HashMap;
import java.util.Map;

class MyKey {
	private int k;

	public int getK() {
		return k;
	}

	public MyKey(int k) {
		super();
		this.k = k;
	}

	@Override
	public String toString() {
		return "MyKey [k=" + k + "]";
	}
}

public class I_UserDefineKey {

	public static void main(String[] args) {
		Map<MyKey, String> map=new HashMap<>();
		map.put(new MyKey(80), "Eighty");
		map.put(new MyKey(80), "Hundered");
		map.put(new MyKey(84), "Eighty four");

	}
}
