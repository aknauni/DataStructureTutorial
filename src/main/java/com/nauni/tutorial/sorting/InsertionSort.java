package com.nauni.tutorial.sorting;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InsertionSort {

	public int[] InsertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			ObjectMapper om = new ObjectMapper();
			try {
				String arrayString = om.writeValueAsString(arr);
				System.out.println(arrayString);
				System.out.println("************************");
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			while (j > -1 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		return arr;
	}

}
