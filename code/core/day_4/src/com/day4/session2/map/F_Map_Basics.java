package com.day4.session2.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class F_Map_Basics {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		map.put("ekta", 80);
		map.put(null, 100);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.put("keshav", 99);

		map.forEach((k,v)-> System.out.println(k+": "+v));
		
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key+": "+ map.get(key));
//		}
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for (Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		//steam processing *
		
		
		// map.putIfAbsent("keshav", 89);

		// how to print the map
	}
}
