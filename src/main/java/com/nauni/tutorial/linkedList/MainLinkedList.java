package org.com.akn.linkedList;

import javax.naming.LimitExceededException;

public class MainLinkedList {
	
	public static void main (String[] args){
		IntLinkedList list = new IntLinkedList();
		list.insertItem(5);
		list.insertItem(8);
		list.insertItem(9);
		list.insertItem(9);
		list.printList();
		System.out.println("***************");
		list.deleteItem(8);
		System.out.println("***************");
		list.printList();
	}

}
