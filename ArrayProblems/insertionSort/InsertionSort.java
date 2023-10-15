package com.kn.insertionSort;

public class InsertionSort {

	public int[] sort(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//			int temp = arr[i], index = i;
//			for (int j = i - 1; j >= 0; j--) {
//				if (temp < arr[j]) {
//					arr[j + 1] = arr[j];
//					index = j;
//				} else
//					break;
//			}
//			arr[index] = temp;
//		}
		for (int i = 1; i < arr.length; i++) {
			int temp1 = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp1 < arr[j]) {
					arr[j + 1] = arr[j];
					arr[j] = temp1;
				}
			}
		}

		return arr;
	}

}
