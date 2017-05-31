package com.nauni.tutorial.amazonQuestions;

public class ReverseSentence {

	static String str= "This is Sparta"; 

	public static void main(String[] args) {
		
	    String[] words = str.split(" ");
	    StringBuilder stringBuilder = new StringBuilder();
	    for (int j = words.length-1; j >= 0; j--) {
	        stringBuilder.append(words[j]).append(' ');
	    }
	    System.out.println("Reverse Sentence: " + stringBuilder);
	    StringBuilder stringBuilder1 = new StringBuilder();
	    for (int j = 0; j < words.length; j++) {
	    	String reverse = new StringBuffer(words[j]).reverse().toString();
	    	stringBuilder1.append(reverse).append(' ');
	    }
	    System.out.println("Reverse words: " + stringBuilder1);
	}

}
