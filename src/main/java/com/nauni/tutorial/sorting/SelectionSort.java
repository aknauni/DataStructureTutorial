package com.nauni.tutorial.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SelectionSort {

	public int[] SelectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			ObjectMapper om = new ObjectMapper();
			try {
				String arrayString = om.writeValueAsString(arr);
				System.out.println(arrayString);
				System.out.println("************************");
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
}
