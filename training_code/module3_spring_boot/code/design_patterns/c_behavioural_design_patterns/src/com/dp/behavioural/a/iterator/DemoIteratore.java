package com.dp.behavioural.a.iterator;
import java.util.*;
public class DemoIteratore {

	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
	    List<String> list=new LinkedList<>();
	
		list.add("foo");
		list.add("bar");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
