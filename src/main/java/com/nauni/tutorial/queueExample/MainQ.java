package com.nauni.tutorial.queueExample;

public class MainQ {

	public static void main(String[] args) {
		/*Intq q = new Intq();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		
		q.showAll();*/
		
		PersonQ q = new PersonQ();
		q.enqueue(new Person("Nauni", "123"));
		q.enqueue(new Person("Anand", "312"));
		
		q.showAll();
		
	}

}
