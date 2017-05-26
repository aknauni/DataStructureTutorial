package org.com.akn.linkedList;

public class IntLinkedList {
	
	private Node head;
	
	public IntLinkedList(){
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItem(int item){
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public void printList(){
		Node z = head.link;
		while(z!=null){
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	public boolean deleteItem(int item){
		if(head.value == item){
			head.link = head.link.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while(true){
				if(y == null || y.value == item){
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
			if(y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	class Node {
		private int value;
		private Node link;
	}

}
