package org.com.akn.stackExample;

import org.com.akn.queueExample.Person;

public class PersonStack {

	private Person[] stack;
	private int top;
	private int size;

	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person[50];
	}

	public PersonStack(Person size) {
		top = -1;
		this.size = 50;
		stack = new Person[this.size];
	}
	
	public boolean push(Person item){
		if(!isfull()){
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
		
	}
	
	public Person pop(){
		return stack[top--];
	}
	
	public boolean isfull(){
		return(top == stack.length-1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
}
