package com.kn.findIndexSearch;

public class FindIndexSearchInArray {
	// method to search the element and retun the address

	public int search(int ele, int[] arr) {

		// Checking each element with all the array elements
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return i;

			}
		}

		return -1;

	}

}
