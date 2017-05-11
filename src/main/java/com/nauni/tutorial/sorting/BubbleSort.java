package com.nauni.tutorial.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BubbleSort {
	
	int temp = 0;
	
	public int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			ObjectMapper om = new ObjectMapper();
			try {
				String arrayString = om.writeValueAsString(arr);
				System.out.println(arrayString);
				System.out.println("************************");
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			for(int j=1; j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
