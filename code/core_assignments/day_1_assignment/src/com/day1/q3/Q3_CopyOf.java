package com.day1.q3;
/*
 * Write a method called copyOf(), which accept an int array and returns a copy of the given array.
The method's signature is as follows:
public static int[] copyOf(int[] array)
 */
public class Q3_CopyOf {

	public static void main(String[] args) {
		int arr[]= {6,7,8};
		int arr2[]=copyOf(arr);
		arr2[1]=7877;
		
		for(int temp: arr) {
			System.out.println(temp);
		}
		
	}

	//Wrong code
	private static int[] copyOf(int[] arr) {
			//code vs api
		return arr;
	}
}
