package com.dp.behavioural.e.strategy_dp.ex1.sol;
//Seprate what varies
interface Sortable{
	public int[] sort(int arr[]);
}
class BubbleSorting implements Sortable{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("using bubble sort");
		return null;
	}
	
}
class QuickSortSorting implements Sortable{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("using quick sort");
		return null;
	}
	
}

class MergeSortSorting implements Sortable{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("using merge sort");
		return null;
	}
	
}
class RadixSortSorting implements Sortable{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("using radix sort");
		return null;
	}
	
}
//OCP

class MathsAlgo{
	
	private int []arr=new int[5];
	
	private Sortable sortable;
	
	public MathsAlgo() {
		sortable=new BubbleSorting();
	}

	public void setSortable(Sortable sortable) {
		this.sortable = sortable;
	}

	public int max() {
		return 0;
	}
	public int [] sort() {
		return sortable.sort(arr);
	}
}

public class DemoStrategyPattern {
	
	public static void main(String[] args) {
		MathsAlgo algo=new MathsAlgo();
		algo.setSortable(new RadixSortSorting());
		algo.sort();
	}

}
