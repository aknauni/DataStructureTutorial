package com.nauni.tutorial.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MergeSort {

	public int[] mergeSort(int[] arr) {

		ObjectMapper om = new ObjectMapper();
		try {
			String arrayString = om.writeValueAsString(arr);
			System.out.println(arrayString);
			System.out.println("************************");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		if (arr.length <2) {
			return arr;
		}
		int leftSize = arr.length / 2;
		int mid = leftSize;
		int rightSize = arr.length - leftSize;

		int[] left = new int[leftSize];
		int[] right = new int[rightSize];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			right[i-mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		
		return mergeSortedArrays(left, right, arr);
	}

	private int[] mergeSortedArrays(int[] left, int[] right, int[] arr) {

		int i = 0, j = 0 , k = 0;
		while(i< left.length && j < right.length){
			if(left[i]<=right[j]){
				arr[k] = left[i];
				i++;
				k++;
			}else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<left.length){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length){
			arr[k] = right[j];
			j++;
			k++;
		}
		
		return arr;
	}

}
