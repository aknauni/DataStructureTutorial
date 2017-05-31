package com.nauni.tutorial.stackExample;

public class IntStack {

	private int[] stack;
	private int top;
	private int size;

	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[50];
	}

	public IntStack(int size) {
		top = -1;
		this.size = 50;
		stack = new int[this.size];
	}
	
	public boolean push(int item){
		if(!isfull()){
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
		
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public boolean isfull(){
		return(top == stack.length-1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
}
