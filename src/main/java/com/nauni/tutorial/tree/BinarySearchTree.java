package com.nauni.tutorial.tree;

public class BinarySearchTree {

	public Node insertData(Node node, int data) {
		if (node == null) {
			return createNewNode(data);
		}

		if (data < node.data) {
			node.lc = insertData(node.lc, data);
		} else if (data > node.data) {
			node.rc = insertData(node.rc, data);
		}
		return node;
	}

	private Node createNewNode(int data) {
		Node newNode = new Node();
		newNode.lc = null;
		newNode.rc = null;
		newNode.data = data;
		return newNode;
	}

	
}

class Node {
	Node rc;
	Node lc;
	int data;
}
