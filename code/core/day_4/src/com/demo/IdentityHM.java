package com.demo;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;


public class IdentityHM {

	public static void main(String[] args) {
		Integer i1=new Integer(3);
		Integer i2=new Integer(3);
		
		System.out.println(i1==i2);
		System.out.println(i1.compareTo(i2));
//		
		Map<Integer, String> map=new IdentityHashMap<>();
		
		map.put(i1, "Three");
		map.put(i2, "Three again");
		System.out.println(map);
		
	}
}
