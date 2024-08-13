package com.day2.session1;
import java.util.*;
//LL stack Queue: FIFO
//class Queue extends LinkedList<String>{
//	public void push(String data) {
//		addLast(data);
//	}
//	public String pop() {
//		return getFirst();
//	}
//}

class Queue {
	private LinkedList<String> linkedList;
	
	
	public Queue() {
		linkedList=new LinkedList<>();
	}
	public void push(String data) {
		linkedList.addLast(data);
	}
	public String pop() {
		return linkedList.getFirst();
	}
}

public class I_AnotherExOfWhenToUseInheritance {
	public static void main(String[] args) {
		
	}

}
