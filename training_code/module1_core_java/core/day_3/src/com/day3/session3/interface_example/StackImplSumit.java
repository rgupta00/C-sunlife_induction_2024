package com.day3.session3.interface_example;
class StackImplSumit implements Stack{
	private int x[];
	private final int SIZE;
	private int top;
	
	public StackImplSumit() {
		x=new int[10];
		SIZE=10;
		top=-1;	
	}
	
	
	public void push(int element){
		if(top>=SIZE)
			return ;
		else
			x[++top]=element;
	}
	
	
	public int pop(){
		if(top==-1)
			return -99;
		else
			return x[top--];
	}
}