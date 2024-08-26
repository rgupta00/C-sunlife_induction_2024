package q4;

import java.util.*;

public class PriorityQueExample {

	public static void main(String[] args) {
		//TODO create PriorityQueue that use ProductSortAsPerPrice, add some elements  and print them
		PriorityQueue<Product> priorityQueue =null;
				
	
//		priorityQueue.offer(new Product(1	, "tv", 59000));
//		priorityQueue.offer(new Product(13	, "laptop", 99000));
//		priorityQueue.offer(new Product(113	, "laptop mouse", 590));
//		priorityQueue.offer(new Product(101	, "ms word", 5900));
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	
	}
}
