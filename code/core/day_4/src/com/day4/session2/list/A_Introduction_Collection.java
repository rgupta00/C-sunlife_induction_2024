package com.day4.session2.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class A_Introduction_Collection {

	public static void main(String[] args) {
		// List
		List<String> list = new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("foo");
		list.add("apple");
		list.add("umesh");
		
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			String value=it.previous();
			System.out.println(value);

		}
		
		
		
		// System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		int index = Collections.binarySearch(list, "raj");
//		System.out.println(index);
		// Iterator vs Iteable

//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			it.next();
//			it.remove();
//		}
//		
//		System.out.println(list);

//		Iterator<String> it = list.iterator();
//		it.next();
//		it.remove();
//		//it.next();
//		it.remove();
//
//		System.out.println(list);

		// java 5
//		for(String data: list) {
//			System.out.println(data);
//		}

	}
}
