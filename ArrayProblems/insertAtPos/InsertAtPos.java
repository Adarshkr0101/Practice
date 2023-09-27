package com.kn.insertAtPos;

public class InsertAtPos {
	// Method to insert an element at given position
	public int[] insert(int[] arr, int pos, int ele) {
		int[] brr = new int[arr.length + 1];
		for (int i = 0; i < brr.length; i++) {
			if (i >= pos) {
				brr[pos] = ele;
				brr[i] = arr[i - 1];
			} else
				brr[i] = arr[i];
		}

		return brr;
	}

}
