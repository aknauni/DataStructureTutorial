package com.nauni.tutorial.stackExample;

public class Person {
	
	private String name;
	private String rollno;
	
	public Person(String name, String rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public String toString(){
		return "Name: " + this.name + " Roll Number :" +this.rollno;
	}
}
