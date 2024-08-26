package com.day5.ex4.map_example;
import java.util.*;
import java.util.Map.Entry;
public class A_UsingHashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("ekta", 80);
		map.put("gunika", 100);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.put("keshav", 99);
		
		//map.putIfAbsent("keshav", 89);
		
		//how to print the map
		System.out.println("----------using keyset set-----------");
		Set<String> keys=map.keySet();
		for(String key: keys) {
			System.out.println(key+": "+ map.get(key));
		}
		//Entryset
		System.out.println("----------using entry set-----------");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> e: entrySet) {
			System.out.println(e.getKey()+" : "+ e.getValue());
		}
		
		//java 8 syntex
	}

}




