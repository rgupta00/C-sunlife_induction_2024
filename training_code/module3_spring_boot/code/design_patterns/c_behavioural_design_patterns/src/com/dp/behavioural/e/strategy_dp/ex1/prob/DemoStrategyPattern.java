package com.dp.behavioural.e.strategy_dp.ex1.prob;
//Seprate what varies

//OCP

class MathsAlgo{
	private int arr[]=new int[5];

	public int max() {
		return 0;
	}
	
	public int [] sort() {
		//Bubble sort
		return null;
	}
}

class MathsAlgoUsingQuickSort extends MathsAlgo{
	@Override
	public int [] sort() {
		//Quick sort
		return null;
	}
}

class MathsAlgoUsingMergeSort extends MathsAlgo{
	@Override
	public int [] sort() {
		//merge sort
		return null;
	}
}


//Quick sort

//merge sort


public class DemoStrategyPattern {
	
	public static void main(String[] args) {
		MathsAlgo algo=new MathsAlgo();
		
		algo.sort();
	}

}
