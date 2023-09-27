package com.kn.mergeArray;

public class MergeArray {

	public int[] merge(int[] arr, int[] brr) {
		// create a new array for merge
		int[] crr = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		for (int i = 0; i < brr.length; i++) {
			crr[i + arr.length] = brr[i];
		}

		return crr;
	}

}
