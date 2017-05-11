package com.nauni.tutorial.sorting;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SortingAlgo {
	
	public static void main (String[] args){
		ObjectMapper om = new ObjectMapper();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of Elements");
		int numberOfElements = scan.nextInt();
		int arr[] = new int[numberOfElements];
		
		for(int i=0;i<numberOfElements;i++){
			System.out.println("Please Enter the next Elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("************************");
		System.out.println("Array Before Sorting"); 
		System.out.println("************************");
		
		
//		BubbleSort bs = new BubbleSort();
//		bs.bubbleSort(arr);
		
//      SelectionSort sc = new SelectionSort();
//      sc.SelectionSort(arr);
        
//        InsertionSort is = new InsertionSort();
//        is.InsertionSort(arr);
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr);
		
		System.out.println("Array After Sorting");  
		System.out.println("************************");
		try {
			String arrayString = om.writeValueAsString(arr);
			System.out.println(arrayString);
			System.out.println("************************");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} 
		
	}

}
