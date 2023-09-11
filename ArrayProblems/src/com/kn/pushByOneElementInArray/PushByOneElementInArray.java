package com.kn.pushByOneElementInArray;

public class PushByOneElementInArray {

	public int[] push(int[] arr) {
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		return arr;
	}

}
