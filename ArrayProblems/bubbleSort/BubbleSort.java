package com.kn.bubbleSort;

public class BubbleSort {
	// Create a method to bubble sort
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			boolean isswap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isswap = true;
				}
			}
			if (isswap == false) {
				break;
			}
		}

		return arr;
	}

}
