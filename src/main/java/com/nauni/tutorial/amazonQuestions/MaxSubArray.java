package com.nauni.tutorial.amazonQuestions;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no elements of an arry");
		int n = sc.nextInt();
		
		
		int[] arr = new int [n];
		for(int i=0; i<n; i++){
			System.out.println("Enter Element:" + i);
			arr[i] = sc.nextInt();
		}
	
		int maxSum = maxSubArray(arr);
		System.out.println("Max Sub Array Sum =" + maxSum);
	}

	private static int maxSubArray(int[] arr) {
		
		int maxArraySum = 0;
		int maxTillHere = 0;
		for(int i=0; i<arr.length; i++){
			maxTillHere = maxTillHere + arr[i];
			if(maxTillHere < 0){
				maxTillHere = 0;
			}
			else if(maxArraySum<maxTillHere){
			
				maxArraySum = maxTillHere;
			}
			
		}
		
		return maxArraySum;
	}

}
