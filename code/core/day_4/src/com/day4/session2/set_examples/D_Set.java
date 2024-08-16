package com.day4.session2.set_examples;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class MyKey implements Comparable<MyKey> {
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

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		return k == other.k;
	}

	@Override
	public int compareTo(MyKey o) {
		return Integer.compare(this.getK(), o.getK());
	}

}

public class D_Set {
	public static void main(String[] args) {

		Set<MyKey> set = 
				new TreeSet<>(( o1,  o2) -> Integer.compare(o2.getK(), o1.getK()));

		set.add(new MyKey(1));
		set.add(new MyKey(187));
		set.add(new MyKey(19));
		set.add(new MyKey(34));

		System.out.println(set);

		// System.out.println(set.contains(new MyKey(1)));

//		Set<MyKey> set = new HashSet<>();
//		set.add(new MyKey(1));
//		set.add(new MyKey(187));
//		set.add(new MyKey(19));
//		set.add(new MyKey(34));
//		
//		System.out.println(set.contains(new MyKey(1)));

		// Set dont allow duplicate
		// HashSet, LinkedHashSet,TreeSet
//		Set<String> set = new TreeSet<>();
//		set.add("umesh");
//		set.add("foo");
//		set.add("bar");
//		set.add("foo");
//		set.add("apple");
//
//		System.out.println(set);
	}

}
