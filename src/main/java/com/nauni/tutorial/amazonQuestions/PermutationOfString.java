package com.nauni.tutorial.amazonQuestions;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String for Permutation");
		String str = sc.nextLine();
		int length = str.length();
		permutation(str, 0, length - 1);
	}

	private static void permutation(String str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		} else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permutation(str, start + 1, end);
				str = swap(str, start, i);

			}
		}

	}

	private static String swap(String str, int start, int i) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[start];
		charArray[start] = charArray[i];
		charArray[i] = temp;
		return String.valueOf(charArray);
	}

}
