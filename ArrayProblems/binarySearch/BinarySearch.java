package com.kn.binarySearch;

public class BinarySearch {

	public int binarysearch(int[] arr, int ele) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (ele == arr[mid]) {
				return mid;
			} else if (arr[mid] > ele) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		
		return -1;
	}

}
