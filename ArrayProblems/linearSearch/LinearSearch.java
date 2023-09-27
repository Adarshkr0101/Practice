package com.kn.linearSearch;

public class LinearSearch {
	// creating a method for linear search of elements
	public int linearsearch(int[] arr, int ele) {
		int loc = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == ele) {
				loc = i;
			} else
				loc = -1;
		}
		return loc;

	}

}
