package com.kn.addTwoDArray;

public class AddTwoDArray {

	public int[][] add(int[][] arr, int[][] brr) {

		int[][] crr = new int[arr.length][brr.length];
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];

			}
		}

		return crr;
	}

}
