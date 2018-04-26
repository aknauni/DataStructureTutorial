package com.nauni.tutorial.amazonQuestions;

import java.util.*;

public class InsertCharInWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		System.out.println("Enter insert Location");
		int loc = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(word);
		System.out.println("Orignal Word");
		System.out.println(sb.toString());
		
		sb.insert(loc, ch);
		System.out.println("After Insertion Word");
		System.out.println(sb.toString());
		
		sb.deleteCharAt(loc);
		System.out.println("After Deletion Word");
		System.out.println(sb.toString());
		
		sb.replace(loc-1, loc, ch+"");
		System.out.println("After Replacing Word");
		System.out.println(sb.toString());
	}

}
