package com.day5.ex1.basics_collections;
import java.util.*;
public class A_HelloWorld {
	
	public static void main(String[] args) {
		//What is collection:
		//how to use ArrayList, LinkedList
		//basics examples, sorting, searching printing

		//Vehicle v=new Car();

		//ArrayList : internally is a growable array
		//random acces is very fast

     	List<String> list=new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		Collections.sort(list);
		
		System.out.println(list);
		int index=Collections.binarySearch(list, "raj");
		System.out.println(index);

		//java 5: syn suger on Iterator
//		for(String l: list){
//			System.out.println(l);
//		}
//		
//		System.out.println("--------using iterator----------");
//		//Iterator is a way to traverse collection
//		Iterator<String> it=list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		System.out.println("--------using backword----------");
//		//Iterator is a way to traverse collection
//		ListIterator<String> it2=list.listIterator(list.size());
//		
//		while(it2.hasPrevious()) {
//			System.out.println(it2.previous());
//		}
		
		
		//Iterator (cursor): Iterator, ListIteator, Enumeration (Vector)
		//Iterator is univeral cursor

//		List<String> list=new ArrayList<>();
//		list.add("foo");
//		list.add("bar");
//		list.add("jar");

		//Iterator vs Iteratable: custom iterator (Iterator dp)
//		Iterator<String>it=list.iterator();
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();
//
//		List<String> list=new ArrayList<>();
//		list.add("foo");
//		list.add("bar");
//		list.add("jar");
//
//		System.out.println(list);
//		list.subList(1,3).clear();
//		System.out.println(list);

//
//
//		System.out.println(list);
//		System.out.println("-------------------");
//		Collections.sort(list);
//		System.out.println(list);
//		//BS 0(log n)
//		int index=Collections.binarySearch(list,"foo");
//		System.out.println(index);

//		Iterator<String>it=list.iterator();
//		while (it.hasNext()){
//			it.next();
//			it.remove();
//		}




		//System.out.println(list.get(2));//O(1)
		
		//System.out.println(list);
		
		//one by one: using enhance for loop
		

//		System.out.println(list);
		
		//Sorting?
		
		
		//binary search ?
		
		
	}

}
