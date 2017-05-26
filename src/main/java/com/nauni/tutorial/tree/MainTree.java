package org.com.akn.tree;

public class MainTree {

	public static void main(String[] args) {
		Person p1 = new Person("Anand", 324);
		Person p2 = new Person("Bnand", 34);
		Person p3 = new Person("ZAnand", 44);
		Person p4 = new Person("CAnand", 54);
		Person p5 = new Person("JAnand", 64);
		Person p6 = new Person("KAnand", 74);
		Person p7 = new Person("YAnand", 84);
		Person p8 = new Person("PAnand", 94);
		Person p9 = new Person("MAnand", 214);
		Person p10 = new Person("NAnand", 234);
		Person p11 = new Person("IAnand", 244);
		Person p12 = new Person("OAnand", 294);
		
		BST bst = new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		bst.insert(p6);
		bst.insert(p7);
		bst.insert(p8);
		bst.insert(p9);
		bst.insert(p10);
		bst.insert(p11);
		bst.insert(p12);
		
		bst.showAll(bst.findNode("IAnand"));
//		Person p = bst.getData(bst.findParent("Anand"));

//		System.out.println(p.toString());
	}

}
